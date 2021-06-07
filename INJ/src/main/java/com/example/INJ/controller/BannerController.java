package com.example.INJ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.INJ.model.Banner;
import com.example.INJ.service.BannerService;

@Controller
public class BannerController {

	@Autowired
	Banner banner;

	@Autowired
	BannerService bannerService;

	@SuppressWarnings("rawtypes")
	@GetMapping("/banner")
	public String getBanner(Model model) {
		List bannerList = bannerService.selectBanner(model);
		model.addAttribute("banner", bannerList);
		return "banner";
	}

}
