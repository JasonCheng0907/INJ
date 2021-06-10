package com.example.INJ.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.BannerDao;
import com.example.INJ.model.Banner;

@Service
public class BannerImpl implements BannerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List selectBanner(Model model) {
		String sql = "SELECT * FROM church.banner";
		List bannerList = jdbcTemplate.queryForList(sql);
		return bannerList;
	}

	@Override
	public void addBanner(Banner banner) {

		String sql = "INSERT INTO church.banner (id, name, file_name, link, active, start_time, end_time, recommend, creator, create_time)"
				+ " VALUES (?,?,?,?,?,?,?,?,?,?)";
		String id = banner.getId();
		String name = banner.getName();
		String file_name = banner.getFile_name();
		String link = banner.getLink();
		String active = banner.getActive();
		Timestamp start_time = banner.getStart_time();
		Timestamp end_time = banner.getEnd_time();
		String recommend = banner.getRecommend();
		String creator = banner.getCreator();
		Timestamp create_time = banner.getCreate_time();
		jdbcTemplate.update(sql, id, name, file_name, link, active, start_time, end_time, recommend, creator,
				create_time);

	}

	@Override
	public void delete(String link) {
		String sql = "delete from church.banner where link = ?";
		jdbcTemplate.update(sql, link);
	}

	@Override
	public void update(Banner banner) {
		String sql = "update church.banner set name=?,file_name=?,link=?,active=?,start_time=?,end_time=? where id=?";
		jdbcTemplate.update(sql, banner);
	}

}
