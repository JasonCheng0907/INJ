package com.example.INJ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jason
 * @version 建立時間:2021年7月14日 下午1:49:55
 */
@Controller
@RequestMapping("/admin/news")
public class NewsController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("newsList")
	public String getNewsList() {
		return "/admin/news/newsList";
	}

	@RequestMapping("newsEdit")
	public String getNewsEdit() {
		return "/admin/news/newsEdit";
	}
}
