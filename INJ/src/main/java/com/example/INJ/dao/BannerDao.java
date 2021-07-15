package com.example.INJ.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.example.INJ.model.Banner;

/**
 * 廣告功能
 * 
 * @author jason
 */
public interface BannerDao {
	// 新增廣告
	void addBanner(Banner banner) throws Exception;

	// 以網址刪除廣告
	void delete(String link) throws Exception;

	// 修改廣告
	void update(Banner banner) throws Exception;

	// 查詢全部廣告
	List selectBanner(Model model) throws Exception;

	// 以ID查詢資料
	List findById(String id) throws Exception;
}
