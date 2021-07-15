package com.example.INJ.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.example.INJ.model.News;

/**
 * 新聞功能
 * 
 * @author jason
 * @version 建立時間:2021年7月15日 下午2:54:28
 */
public interface NewsDao {
	// 新增新聞
	void add(News news) throws Exception;

	// 以id刪除新聞
	void delete(String id) throws Exception;

	// 修改新聞
	void update(News news) throws Exception;

	// 查詢全部新聞
	List select(Model model) throws Exception;

	// 以id查詢資料
	List findById(String id) throws Exception;
}
