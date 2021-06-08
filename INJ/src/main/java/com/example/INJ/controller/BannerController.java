package com.example.INJ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.INJ.model.Banner;
import com.example.INJ.service.BannerService;

@Controller
public class BannerController {

	@Autowired
	BannerService bannerService;

	@RequestMapping("/banner_1")
	public String getBanner(Model banner) {
		List bannerList = bannerService.selectBanner(banner);
		banner.addAttribute("banner", bannerList);
		return "banner_1";
	}

	@RequestMapping(value = "/banner_2", method = RequestMethod.GET)
	public String addBanner(@ModelAttribute(value = "addbanner") Banner banner) {
		bannerService.addBanner(banner);
		return "banner_2";
	}

}
