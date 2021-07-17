package com.example.INJ.controller;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
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

import com.example.INJ.model.NewsSource;
import com.example.INJ.service.NewsSourceImpl;

/**
 * @author jason
 * @version 建立時間:2021年7月16日 下午3:53:46
 */

@Controller
@RequestMapping("/admin/newsSource")
public class NewsSourceController {

	@Autowired
	NewsSourceImpl newsSourceImpl;

	public static String shortUUID() {
		UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}

	@RequestMapping("/")
	public String index() throws Exception {
		return "index";
	}

	@RequestMapping("list")
	public String List(Model model) throws Exception {
		List newsSourceList = newsSourceImpl.select(model);
		model.addAttribute("newsSource", newsSourceList);
		return "/admin/newsSource/list";
	}

	@GetMapping("edit{newsSourceID}")
	public String Edit(@RequestParam(name = "newsSourceID") String id, Model model) throws Exception {
		List newsSourceList = newsSourceImpl.findById(id);
		model.addAttribute("newsSource", newsSourceList);
		return "/admin/newsSource/edit";
	}

	@PostMapping(value = "edit")
	@ResponseBody
	public String edit(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("file") MultipartFile file, @RequestParam("active") String active, HttpServletRequest request)
			throws Exception {
		NewsSource newsSource = new NewsSource();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String modifier = "mdbc";
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		newsSource.setId(id);
		newsSource.setName(name);
		newsSource.setFile_name(file_name);
		newsSource.setActive(active);
		newsSource.setModifier(modifier);
		newsSource.setModify_time(modify_time);
		try {
			file.transferTo(new File(
					"C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		newsSourceImpl.update(newsSource);
		return "編輯成功";
	}

	@RequestMapping("save")
	public String Save() throws Exception {
		return "/admin/newsSource/save";
	}

	@PostMapping(value = "save")
	@ResponseBody
	public String save(@RequestParam("name") String name, @RequestParam("file") MultipartFile file,
			@RequestParam("active") String active, HttpServletRequest request) throws Exception {

		NewsSource newsSource = new NewsSource();
		String id = shortUUID();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String creator = "mdbc";
		Timestamp create_time = new Timestamp(System.currentTimeMillis());
		newsSource.setId(id);
		newsSource.setName(name);
		newsSource.setFile_name(file_name);
		newsSource.setActive(active);
		newsSource.setCreator(creator);
		newsSource.setCreate_time(create_time);
		newsSource.setModifier(creator);
		newsSource.setModify_time(create_time);
		try {
			file.transferTo(new File(
					"C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		newsSourceImpl.add(newsSource);
		return "新增成功";
	}

	@GetMapping(value = "deleteNewsSource")
	@ResponseBody
	public String delete(@RequestParam(name = "newsSourceID") String id) throws Exception {
		newsSourceImpl.delete(id);
		return "刪除成功";
	}
}
