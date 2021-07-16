package com.example.INJ.controller;

import java.nio.ByteBuffer;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String List() throws Exception {
		return "/admin/newsSource/list";
	}

	@RequestMapping("edit")
	public String Edit() throws Exception {
		return "/admin/newsSource/edit";
	}

	@RequestMapping("save")
	public String Save() throws Exception {
		return "/admin/newsSource/save";
	}

	@GetMapping(value = "deleteNewsSource")
	@ResponseBody
	public String delete(@RequestParam(name = "newsSourceID") String id) throws Exception {
		newsSourceImpl.delete(id);
		return "刪除成功";
	}
}
