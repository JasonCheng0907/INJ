package com.example.INJ.controller;

import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.INJ.model.Banner;
import com.example.INJ.service.BannerImpl;

@Controller
public class BannerController {

	@Autowired
	BannerImpl bannerImpl;

	private static String UPLOADED_FOLDER = "C:/Users/Jason/eclipse-workspace/INJ/src/main/resources/static/images";

	public static String shortUUID() {
		UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/admin/banner/bannerList")
	public String getBanner(Model model) {
		List bannerList = bannerImpl.selectBanner(model);
		model.addAttribute("banner", bannerList);
		return "/admin/banner/bannerList";
	}

	@GetMapping("/admin/banner/bannerEdit{bannerID}")
	public String edit(Model model) {
		List bannerList = bannerImpl.findById("123");
		model.addAttribute("banner", bannerList);
		return "/admin/banner/bannerEdit";
	}

	@PostMapping(value = "/admin/banner/edit")
	public String bannerEdit(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("link") String link, @RequestParam("file_name") String file_name,
			@RequestParam("start_time") Date start_time, @RequestParam("end_time") Date end_time,
			@RequestParam("active") String active) {
		Banner banner = new Banner();
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		String fn = shortUUID() + file_name;
		banner.setId(id);
		banner.setName(name);
		banner.setLink(link);
		banner.setFile_name(fn);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setActive(active);
		bannerImpl.update(banner);
		return "/admin/banner/bannerEdit";
	}

	@RequestMapping("/admin/banner/bannerSave")
	public String Save() {
		return "/admin/banner/bannerSave";
	}

	@PostMapping(value = "/admin/banner/save")
	public String bannerSave(@RequestParam("name") String name, @RequestParam("link") String link,
			@RequestParam("file_name") String file_name, @RequestParam("start_time") Date start_time,
			@RequestParam("end_time") Date end_time, @RequestParam("active") String active) {

		Banner banner = new Banner();
		String id = shortUUID();
		String fn = id + file_name;
		String recommend = "0";
		String creator = "mdbc";
		Timestamp create_time = new Timestamp(System.currentTimeMillis());
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		banner.setId(id);
		banner.setName(name);
		banner.setFile_name(fn);
		banner.setLink(link);
		banner.setActive(active);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setRecommend(recommend);
		banner.setCreator(creator);
		banner.setCreate_time(create_time);
		bannerImpl.addBanner(banner);
		return "/admin/banner/bannerList";
	}

}
