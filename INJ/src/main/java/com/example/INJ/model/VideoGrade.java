package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 影片評分記錄
 * 
 * @author jason
 */
public class VideoGrade implements Serializable {

	private static final long serialVersionUID = -3356808672050066291L;
	private String id;
	private String member_id;
	private String video_id;
	private double grade;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String memberId) {
		member_id = memberId;
	}

	public String getVideo_id() {
		return video_id;
	}

	public void setVideo_id(String videoId) {
		video_id = videoId;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
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

}
