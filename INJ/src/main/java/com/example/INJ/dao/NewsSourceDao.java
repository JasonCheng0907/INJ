package com.example.INJ.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.example.INJ.model.NewsSource;

/**
 * 新聞來源
 * 
 * @author jason
 * @version 建立時間:2021年7月15日 下午5:10:32
 */
public interface NewsSourceDao {
	// 新增新聞來源
	void add(NewsSource newsSource) throws Exception;

	// 以id刪除新聞來源
	void delete(String id) throws Exception;

	// 修改新聞來源
	void update(NewsSource newsSource) throws Exception;

	// 查詢全部新聞來源
	List select(Model model) throws Exception;

}
