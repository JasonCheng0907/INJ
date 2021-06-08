package com.example.INJ.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.example.INJ.model.Banner;

@Repository
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
	public int addBanner(String sql, Banner banner) {
		/*
		 * Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 * banner.getName();
		 * 
		 * banner.getFile_name(); banner.getLink(); banner.getActive();
		 * banner.getStart_time(); banner.getEnd_time(); banner.setRecommend("0");
		 * banner.setCreator("mdbc"); banner.setCreate_time(timestamp);
		 * 
		 * 
		 * String sql =
		 * "INSERT INTO church.banner (name, file_name, link, active, start_time, end_time, recommend, creator, create_time)"
		 * + " VALUES (?,?,?,?,?,?,?,?,?)";
		 */
		return jdbcTemplate.update(sql, banner);

	}

	@Override
	public void delete(String link) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Banner banner) {
		// TODO Auto-generated method stub

	}

}
