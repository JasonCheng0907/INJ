package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 影片資料
 * 
 * @author jason
 */
public class Video implements Serializable {

	private static final long serialVersionUID = 25608346368451755L;
	private String id;
	private String name;
	private String member_id;
	private String category_id;
	private String description;
	private Timestamp video_time;
	private String active;
	private String approve;
	private String file_name;// 圖片
	private String file_name2;// 影片
	private String youtube_code;
	private Timestamp start_time;
	private Timestamp end_time;
	private String forever;
	private int view_times;
	private String recommend;
	private String index_recommend;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private String avg_grade;// 平均分數
	private Category category;
	private String editor;

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

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String categoryId) {
		category_id = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getVideo_time() {
		return video_time;
	}

	public void setVideo_time(Timestamp videoTime) {
		video_time = videoTime;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String fileName) {
		file_name = fileName;
	}

	public String getFile_name2() {
		return file_name2;
	}

	public void setFile_name2(String fileName2) {
		file_name2 = fileName2;
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

	public int getView_times() {
		return view_times;
	}

	public void setView_times(int viewTimes) {
		view_times = viewTimes;
	}

	public Category getCategory() {
		return category;
	}

	public void pushCategory(Category category) {
		this.category = category;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getIndex_recommend() {
		return index_recommend;
	}

	public void setIndex_recommend(String indexRecommend) {
		index_recommend = indexRecommend;
	}

	public String getYoutube_code() {
		return youtube_code;
	}

	public void setYoutube_code(String youtubeCode) {
		youtube_code = youtubeCode;
	}

	public String getAvg_grade() {
		return avg_grade;
	}

	public void setAvg_grade(String avgGrade) {
		avg_grade = avgGrade;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String memberId) {
		member_id = memberId;
	}

	public String getEditor() {
		return editor;
	}

	public void pushEditor(String editor) {
		this.editor = editor;
	}

	public String getForever() {
		return forever;
	}

	public void setForever(String forever) {
		this.forever = forever;
	}

}
