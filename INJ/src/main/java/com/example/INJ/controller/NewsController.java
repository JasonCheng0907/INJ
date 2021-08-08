package com.example.INJ.controller;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	public String edit(@RequestParam("id") String id, @RequestParam("title") String title,
			@RequestParam("content") String content, @RequestParam("file") MultipartFile file,
			@RequestParam("reporter") String reporter, @RequestParam("city") String city,
			@RequestParam("report_time") Date report_time, @RequestParam("news_source") String news_source,
			@RequestParam("category_id") String category_id, @RequestParam("headline") String headline,
			@RequestParam("active") String active, @RequestParam("start_time") Date start_time,
			@RequestParam("end_time") Date end_time) throws Exception {
		News news = new News();
		String url = "C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\";
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String modifier = "mdbc";
		Timestamp rt = new Timestamp(report_time.getTime());
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		news.setId(id);
		news.setCategory_id(category_id);
		news.setTitle(title);
		news.setContent(content);
		news.setReporter(reporter);
		news.setCity(city);
		news.setReport_time(rt);
		news.setNews_source(news_source);
		news.setHeadline(headline);
		news.setFile_name(file_name);
		news.setActive(active);
		news.setStart_time(st);
		news.setEnd_time(et);
		news.setForever("0");
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
	public String save(@RequestParam("title") String title, @RequestParam("content") String content,
			@RequestParam("file") MultipartFile file, @RequestParam("reporter") String reporter,
			@RequestParam("city") String city, @RequestParam("report_time") Date report_time,
			@RequestParam("news_source") String news_source, @RequestParam("category_id") String category_id,
			@RequestParam("headline") String headline, @RequestParam("active") String active,
			@RequestParam("start_time") Date start_time, @RequestParam("end_time") Date end_time) throws Exception {
		News news = new News();
		String id = shortUUID();
		String file_name = id + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String modifier = "mdbc";
		Timestamp rt = new Timestamp(report_time.getTime());
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		Timestamp modify_time = new Timestamp(System.currentTimeMillis());
		news.setId(id);
		news.setCategory_id(category_id);
		news.setTitle(title);
		news.setContent(content);
		news.setReporter(reporter);
		news.setCity(city);
		news.setReport_time(rt);
		news.setNews_source(news_source);
		news.setHeadline(headline);
		news.setFile_name(file_name);
		news.setActive(active);
		news.setStart_time(st);
		news.setEnd_time(et);
		news.setForever("0");
		news.setCreator(modifier);
		news.setCreate_time(modify_time);
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
		newsImpl.add(news);
		return "新增成功";
	}

	@GetMapping(value = "deleteNews")
	@ResponseBody
	public String delete(@RequestParam(name = "newsID") String id) throws Exception {
		newsImpl.delete(id);
		return "刪除成功";
	}

	@PostMapping(value = "search")
	public String search(@RequestParam(name = "keywords") String keywords, @RequestParam(name = "active") String active,
			@RequestParam(name = "news_source") String news_source,
			@RequestParam(name = "category_id") String category_id, @RequestParam("start_time") Date start_time,
			@RequestParam("end_time") Date end_time, Model model) throws Exception {
		Timestamp st = new Timestamp(start_time.getTime());
		Timestamp et = new Timestamp(end_time.getTime());
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		String sst = df.format(start_time);
		String set = df.format(end_time);
		if (active.equals("2")) {
			List n1 = newsImpl.findByKeywords(keywords, news_source, category_id, st, et);
			model.addAttribute("news", n1);
		} else {
			List n2 = newsImpl.findByKeywords(keywords, active, news_source, category_id, st, et);
			model.addAttribute("news", n2);
		}
		model.addAttribute("keywords", keywords);
		model.addAttribute("start_time", sst);
		model.addAttribute("end_time", set);
		return "/admin/news/list";
	}

}
