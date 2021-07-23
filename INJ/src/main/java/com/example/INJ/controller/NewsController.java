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

import com.example.INJ.model.News;
import com.example.INJ.service.NewsImpl;

/**
 * @author jason
 * @version 建立時間:2021年7月14日 下午1:49:55
 */
@Controller
@RequestMapping("/admin/news")
public class NewsController {

	@Autowired
	NewsImpl newsImpl;

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
	public String getNewsList(Model model) throws Exception {
		List newsList = newsImpl.select(model);
		model.addAttribute("news", newsList);
		return "/admin/news/list";
	}

	@GetMapping("edit{newsID}")
	public String getNewsEdit(@RequestParam(name = "newsID") String id, Model model) throws Exception {
		List newsList = newsImpl.findById(id);
		model.addAttribute("news", newsList);
		return "/admin/news/edit";
	}

	@PostMapping(value = "edit")
	@ResponseBody
	public String edit(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("file") MultipartFile file, @RequestParam("active") String active, HttpServletRequest request)
			throws Exception {
		News news = new News();
		String url = "C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\";
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String modifier = "mdbc";
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		news.setId(id);
		news.setFile_name(file_name);
		news.setActive(active);
		news.setModifier(modifier);
		news.setModify_time(modify_time);
		try {
			file.transferTo(new File(url + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		newsImpl.update(news);
		return "編輯成功";
	}

	@RequestMapping("save")
	public String getNewsSave() throws Exception {
		return "/admin/news/save";
	}

	@PostMapping(value = "save")
	@ResponseBody
	public String save(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("file") MultipartFile file, @RequestParam("active") String active, HttpServletRequest request)
			throws Exception {
		News news = new News();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String modifier = "mdbc";
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		news.setId(id);
		// news.setName(name);
		news.setFile_name(file_name);
		news.setActive(active);
		news.setModifier(modifier);
		news.setModify_time(modify_time);
		try {
			file.transferTo(new File(
					"C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		newsImpl.update(news);
		return "編輯成功";
	}

	@GetMapping(value = "deleteNews")
	@ResponseBody
	public String delete(@RequestParam(name = "newsID") String id) throws Exception {
		newsImpl.delete(id);
		return "刪除成功";
	}

	@PostMapping(value = "search")
	public String search(@RequestParam(name = "keywords") String keywords, @RequestParam(name = "active") String active,
			Model model) throws Exception {
		if (active.equals("1") || active.equals("0")) {
			// List n1 = newsImpl.findByKeywords(keywords, active);
			// model.addAttribute("newsSource", n1);
		} else {
			// List n2 = newsImpl.findByKeywords(keywords);
			// model.addAttribute("newsSource", n2);
		}
		return "/admin/newsSource/list";
	}

}
