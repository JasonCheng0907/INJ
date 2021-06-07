package com.example.INJ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.BannerDao;

@Service
public class BannerService {
	@Autowired
	private BannerDao bannerDao;

	@SuppressWarnings("rawtypes")
	public List selectBanner(Model model) {
		return bannerDao.selectBanner(model);
	}
}
