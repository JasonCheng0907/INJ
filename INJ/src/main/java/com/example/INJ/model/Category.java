package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 分類
 * 
 * @author jason
 */
public class Category implements Serializable {

	private static final long serialVersionUID = -3475928813063150688L;
	private String id;
	private String block_id;
	private String base_category_id;
	private String name;
	private String description;
	private String active;
	private String file_name1;
	private String file_name2;
	private String file_name3;
	private String file_name4;
	private String file_name5;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private List<News> news;
	private List postList;
	private List<Prayer> prayerList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlock_id() {
		return block_id;
	}

	public void setBlock_id(String blockId) {
		block_id = blockId;
	}

	public String getBase_category_id() {
		return base_category_id;
	}

	public void setBase_category_id(String baseCategoryId) {
		base_category_id = baseCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp createTime) {
		create_time = createTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Timestamp getModify_time() {
		return modify_time;
	}

	public void setModify_time(Timestamp modifyTime) {
		modify_time = modifyTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<News> getNews() {
		return news;
	}

	public void pushNews(List<News> news) {
		this.news = news;
	}

	public List getPostList() {
		return postList;
	}

	public void pushPostList(List postList) {
		this.postList = postList;
	}

	public List<Prayer> getPrayerList() {
		return prayerList;
	}

	public void pushPrayerList(List<Prayer> prayerList) {
		this.prayerList = prayerList;
	}

	public String getFile_name1() {
		return file_name1;
	}

	public void setFile_name1(String fileName1) {
		file_name1 = fileName1;
	}

	public String getFile_name2() {
		return file_name2;
	}

	public void setFile_name2(String fileName2) {
		file_name2 = fileName2;
	}

	public String getFile_name3() {
		return file_name3;
	}

	public void setFile_name3(String fileName3) {
		file_name3 = fileName3;
	}

	public String getFile_name4() {
		return file_name4;
	}

	public void setFile_name4(String fileName4) {
		file_name4 = fileName4;
	}

	public String getFile_name5() {
		return file_name5;
	}

	public void setFile_name5(String fileName5) {
		file_name5 = fileName5;
	}

}
