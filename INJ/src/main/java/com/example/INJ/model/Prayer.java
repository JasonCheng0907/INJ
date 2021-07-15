package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 禱告祭壇
 * 
 * @author jason
 */
public class Prayer implements Serializable {

	private static final long serialVersionUID = 1513389880426824066L;
	private String id;
	private String name;
	private String description;
	private String doorkeeper_id;
	private String category_id;
	private String church_id;
	private Timestamp play_date;
	private String play_time1;
	private String play_time2;
	private String file_name;// ppt檔
	private String file_name2;// 圖片
	private String file_name3;// 影片
	private String recommend;
	private String active;
	private Timestamp start_time;
	private Timestamp end_time;
	private String is_online;
	private Timestamp online_start_time;
	private Timestamp online_end_time;
	private String online_time1;
	private String online_time2;
	private String online_time3;
	private String online_time4;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private Category category;
	private Doorkeeper doorkeeper;
	private Church church;
	private String isShowLive;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoorkeeper_id() {
		return doorkeeper_id;
	}

	public void setDoorkeeper_id(String doorkeeperId) {
		doorkeeper_id = doorkeeperId;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String categoryId) {
		category_id = categoryId;
	}

	public Timestamp getPlay_date() {
		return play_date;
	}

	public void setPlay_date(Timestamp playDate) {
		play_date = playDate;
	}

	public String getPlay_time1() {
		return play_time1;
	}

	public void setPlay_time1(String playTime1) {
		play_time1 = playTime1;
	}

	public String getPlay_time2() {
		return play_time2;
	}

	public void setPlay_time2(String playTime2) {
		play_time2 = playTime2;
	}

	public Timestamp getStart_time() {
		return start_time;
	}

	public void setStart_time(Timestamp startTime) {
		start_time = startTime;
	}

	public Timestamp getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Timestamp endTime) {
		end_time = endTime;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String fileName) {
		file_name = fileName;
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

	public Category getCategory() {
		return category;
	}

	public void pushCategory(Category category) {
		this.category = category;
	}

	public Doorkeeper getDoorkeeper() {
		return doorkeeper;
	}

	public void pushDoorkeeper(Doorkeeper doorkeeper) {
		this.doorkeeper = doorkeeper;
	}

	public String getFile_name2() {
		return file_name2;
	}

	public void setFile_name2(String fileName2) {
		file_name2 = fileName2;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getChurch_id() {
		return church_id;
	}

	public void setChurch_id(String churchId) {
		church_id = churchId;
	}

	public Church getChurch() {
		return church;
	}

	public void pushChurch(Church church) {
		this.church = church;
	}

	public Timestamp getOnline_start_time() {
		return online_start_time;
	}

	public void setOnline_start_time(Timestamp onlineStartTime) {
		online_start_time = onlineStartTime;
	}

	public Timestamp getOnline_end_time() {
		return online_end_time;
	}

	public void setOnline_end_time(Timestamp onlineEndTime) {
		online_end_time = onlineEndTime;
	}

	public String getOnline_time1() {
		return online_time1;
	}

	public void setOnline_time1(String onlineTime1) {
		online_time1 = onlineTime1;
	}

	public String getOnline_time2() {
		return online_time2;
	}

	public void setOnline_time2(String onlineTime2) {
		online_time2 = onlineTime2;
	}

	public String getOnline_time3() {
		return online_time3;
	}

	public void setOnline_time3(String onlineTime3) {
		online_time3 = onlineTime3;
	}

	public String getOnline_time4() {
		return online_time4;
	}

	public void setOnline_time4(String onlineTime4) {
		online_time4 = onlineTime4;
	}

	public String getIs_online() {
		return is_online;
	}

	public void setIs_online(String isOnline) {
		is_online = isOnline;
	}

	public String getIsShowLive() {
		return isShowLive;
	}

	public void pushIsShowLive(String isShowLive) {
		this.isShowLive = isShowLive;
	}

	public String getFile_name3() {
		return file_name3;
	}

	public void setFile_name3(String fileName3) {
		file_name3 = fileName3;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
