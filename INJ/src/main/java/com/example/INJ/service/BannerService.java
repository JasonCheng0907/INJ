package com.example.INJ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.BannerImpl;
import com.example.INJ.model.Banner;

@Service
public class BannerService {
	@Autowired
	private BannerImpl bannerImpl;

	@SuppressWarnings("rawtypes")
	public List selectBanner(Model banner) {
		return bannerImpl.selectBanner(banner);
	}

	public void addBanner(Banner banner) {
		String sql = "INSERT INTO church.banner (name, file_name, link, active, start_time, end_time, recommend, creator, create_time)"
				+ " VALUES (?,?,?,?,?,?,?,?,?)";
		bannerImpl.addBanner(sql, banner);
	}
}
