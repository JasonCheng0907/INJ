package com.example.INJ.controller;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.INJ.model.Banner;
import com.example.INJ.service.BannerImpl;

/**
 * 廣告控制器
 * 
 * @author jason
 */
@Controller
@RequestMapping("/admin/banner")
public class BannerController {

	@Autowired
	BannerImpl bannerImpl;

	public static String shortUUID() {
		UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("bannerList")
	public String getBanner(Model model) throws Exception {
		List bannerList = bannerImpl.selectBanner(model);
		model.addAttribute("banner", bannerList);
		return "/admin/banner/bannerList";
	}

	@GetMapping("bannerEdit{bannerID}")
	public String bannerEdit(@RequestParam(name = "bannerID") String id, Model model) throws Exception {
		List bannerList = bannerImpl.findById(id);
		model.addAttribute("banner", bannerList);
		return "/admin/banner/bannerEdit";
	}

	@PostMapping(value = "edit")
	@ResponseBody
	public String edit(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("link") String link, @RequestParam("file") MultipartFile file,
			@RequestParam("start_time") Date start_time, @RequestParam("end_time") Date end_time,
			@RequestParam("active") String active, HttpServletRequest request) throws Exception {
		Banner banner = new Banner();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		String modifier = "mdbc";
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		banner.setId(id);
		banner.setName(name);
		banner.setLink(link);
		banner.setFile_name(file_name);
		banner.setStart_time(st);
		banner.setEnd_time(et);
		banner.setActive(active);
		banner.setModifier(modifier);
		banner.setModify_time(modify_time);
		try {
			file.transferTo(new File(
					"C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		bannerImpl.update(banner);
		return "編輯成功";
	}

	@RequestMapping("bannerSave")
	public String bannerSave() {
		return "/admin/banner/bannerSave";
	}

	@PostMapping(value = "save")
	@ResponseBody
	public String save(@RequestParam("name") String name, @RequestParam("link") String link,
			@RequestParam("file") MultipartFile file, @RequestParam("start_time") Date start_time,
			@RequestParam("end_time") Date end_time, @RequestParam("active") String active, HttpServletRequest request)
			throws Exception {

		Banner banner = new Banner();
		String id = shortUUID();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String recommend = "0";
		String creator = "mdbc";
		Timestamp create_time = new Timestamp(System.currentTimeMillis());
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		banner.setId(id);
		banner.setName(name);
		banner.setFile_name(file_name);
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
		try {
			file.transferTo(new File(
					"C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		bannerImpl.addBanner(banner);
		return "新增成功";
	}

	@GetMapping(value = "deleteBanner")
	@ResponseBody
	public String delete(@RequestParam(name = "bannerID") String id) throws Exception {
		bannerImpl.delete(id);
		return "刪除成功";
	}
}
