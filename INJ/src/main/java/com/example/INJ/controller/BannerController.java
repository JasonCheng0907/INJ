package com.example.INJ.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.INJ.model.Banner;
import com.example.INJ.service.BannerImpl;

@Controller
public class BannerController {

	@Autowired
	BannerImpl bannerImpl;

	@RequestMapping("/bannerList")
	public String getBanner(Model banner) {
		List bannerList = bannerImpl.selectBanner(banner);
		banner.addAttribute("banner", bannerList);
		return "bannerList";
	}

	@RequestMapping("/bannerEdit")
	public String edit(Model model) {
		// model.getAttribute();
		return "bannerEdit";
	}

	@PostMapping(value = "edit")
	@InitBinder
	public String bannerEdit(@RequestParam("name") String name, @RequestParam("link") String link,
			@RequestParam("file_name") String file_name, @RequestParam("start_time") Date start_time,
			@RequestParam("end_time") Date end_time, @RequestParam("active") String active) {
		Banner banner = new Banner();
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		banner.setName(name);
		banner.setLink(link);
		banner.setFile_name(file_name);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setActive(active);
		bannerImpl.update(banner);
		return "bannerList";
	}

	@RequestMapping("/bannerSave")
	public String Save() {
		return "bannerSave";
	}

	@PostMapping(value = "save")
	public String bannerSave(@ModelAttribute("save") @RequestParam("name") String name,
			@RequestParam("link") String link, @RequestParam("file_name") String file_name,
			@RequestParam("start_time") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date start_time,
			@RequestParam("end_time") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date end_time,
			@RequestParam("active") String active, Banner banner) {

		String id = UUID.randomUUID().toString();
		file_name = id + file_name;
		String recommend = "0";
		String creator = "mdbc";
		Timestamp create_time = new Timestamp(System.currentTimeMillis());
		Timestamp st = (Timestamp) start_time;
		Timestamp et = (Timestamp) end_time;
		banner.setId(id);
		banner.setName(name);
		banner.setFile_name(file_name);
		banner.setLink(link);
		banner.setActive(active);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setRecommend(recommend);
		banner.setCreator(creator);
		banner.setCreate_time(create_time);
		bannerImpl.addBanner(banner);
		return "bannerList";
	}

}
