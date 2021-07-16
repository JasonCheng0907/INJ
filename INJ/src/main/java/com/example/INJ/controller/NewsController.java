package com.example.INJ.controller;

import java.nio.ByteBuffer;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String getNewsList() throws Exception {
		return "/admin/news/list";
	}

	@RequestMapping("edit")
	public String getNewsEdit() throws Exception {
		return "/admin/news/edit";
	}

	@RequestMapping("save")
	public String getNewsSave() throws Exception {
		return "/admin/news/save";
	}

	@GetMapping(value = "deleteNews")
	@ResponseBody
	public String delete(@RequestParam(name = "newsID") String id) throws Exception {
		newsImpl.delete(id);
		return "刪除成功";
	}
}
