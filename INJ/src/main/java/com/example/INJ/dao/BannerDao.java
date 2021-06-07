package com.example.INJ.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class BannerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List selectBanner(Model model) {
		String sql = "SELECT * FROM church.banner";
		List bannerList = jdbcTemplate.queryForList(sql);
		return bannerList;
	}

}
