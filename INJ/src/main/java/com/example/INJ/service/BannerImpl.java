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

		String sql = "INSERT INTO church.banner (id, name, file_name, link, active, approve, target, start_time, end_time, recommend, creator, "
				+ "create_time, modifier, modify_time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
		String modifier = banner.getModifier();
		Timestamp modify_time = banner.getModify_time();
		String approve = banner.getApprove();
		String target = banner.getTarget();
		jdbcTemplate.update(sql, id, name, file_name, link, active, approve, target, start_time, end_time, recommend,
				creator, create_time, modifier, modify_time);

	}

	@Override
	public void delete(String id) {
		String sql = "delete from church.banner where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(Banner banner) {
		String sql = "update church.banner set name=?, link=?, file_name=?, active=?, start_time=?, end_time=?, modifier=?, modify_time=? where id=?";
		String id = banner.getId();
		String name = banner.getName();
		String file_name = banner.getFile_name();
		String link = banner.getLink();
		String active = banner.getActive();
		Timestamp start_time = banner.getStart_time();
		Timestamp end_time = banner.getEnd_time();
		String modifier = banner.getModifier();
		Timestamp modify_time = banner.getModify_time();
		jdbcTemplate.update(sql, name, link, file_name, active, start_time, end_time, modifier, modify_time, id);
	}

	@Override
	public List findById(String id) {
		String sql = "SELECT * FROM church.banner where id=?";
		List bannerList = jdbcTemplate.queryForList(sql, id);
		return bannerList;
	}

}
