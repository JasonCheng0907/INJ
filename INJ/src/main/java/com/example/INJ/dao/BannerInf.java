package com.example.INJ.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.example.INJ.model.Banner;

public interface BannerInf {
	// 新增廣告
	void addBanner(Model model);

	// 以網址刪除廣告
	void delete(String link);

	// 修改廣告
	void update(Banner banner);

	// 查詢廣告
	List selectBanner(Model model);

}
