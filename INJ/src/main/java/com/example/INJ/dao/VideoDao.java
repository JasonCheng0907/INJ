package com.example.INJ.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.example.INJ.model.Video;

/**
 * @author jason
 * @version 建立時間:2021年8月12日 下午1:15:58
 */
public interface VideoDao {
	// 新增影片
	void add(Video video) throws Exception;

	// 以id刪除影片
	void delete(String id) throws Exception;

	// 修改影片
	void update(Video video) throws Exception;

	// 查詢全部影片
	List select(Model model) throws Exception;

	// 以id查詢資料
	List findById(String id) throws Exception;

	// 以關鍵字搜尋
	List findByKeywords(String keywords, Video video) throws Exception;
}
