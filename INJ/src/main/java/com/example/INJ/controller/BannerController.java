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
import org.springframework.web.bind.annotation.ResponseBody;

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
	/*
	 * @GetMapping("/admin/banner/bannerEdit{bannerID}") public String
	 * edit(@PathVariable String bannerID, Model model) { List bannerList =
	 * bannerImpl.findById(bannerID); model.addAttribute("banner", bannerList);
	 * return "/admin/banner/bannerEdit"; }
	 */

	@GetMapping("/admin/banner/bannerEdit{bannerID}")
	public String bannerEdit(Model model) {
		List bannerList = bannerImpl.findById("1jenqw9idjlgh");
		model.addAttribute("banner", bannerList);
		return "/admin/banner/bannerEdit";
	}

	@PostMapping(value = "/admin/banner/edit")
	@ResponseBody
	public String edit(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("link") String link, @RequestParam("file_name") String file_name,
			@RequestParam("start_time") Date start_time, @RequestParam("end_time") Date end_time,
			@RequestParam("active") String active) {
		Banner banner = new Banner();
		String fn = shortUUID() + file_name;
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		String modifier = "mdbc";
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		banner.setId(id);
		banner.setName(name);
		banner.setLink(link);
		banner.setFile_name(fn);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setActive(active);
		banner.setModifier(modifier);
		banner.setModify_time(modify_time);
		bannerImpl.update(banner);
		return "編輯成功";
	}

	@RequestMapping("/admin/banner/bannerSave")
	public String bannerSave() {
		return "/admin/banner/bannerSave";
	}

	@PostMapping(value = "/admin/banner/save")
	@ResponseBody
	public String save(@RequestParam("name") String name, @RequestParam("link") String link,
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
		banner.setApprove("2");
		banner.setTarget("0");
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setRecommend(recommend);
		banner.setCreator(creator);
		banner.setCreate_time(create_time);
		banner.setModifier(creator);
		banner.setModify_time(create_time);
		bannerImpl.addBanner(banner);
		return "新增成功";
	}

	@GetMapping(value = "/deleteBanner")
	@ResponseBody
	public String delete(@RequestParam(name = "bannerID") String id) {
		bannerImpl.delete(id);
		return "刪除成功";
	}
}
