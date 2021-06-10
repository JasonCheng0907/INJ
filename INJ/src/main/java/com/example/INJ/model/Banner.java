package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Banner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String file_name;
	private String link;
	private String active;
	private String approve;
	private String target;
	private Timestamp start_time;
	private Timestamp end_time;
	private String recommend;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	public Banner() {
		super();
	}

	public Banner(String id, String name, String file_name, String link, String active, String approve, String target,
			Timestamp start_time, Timestamp end_time, String recommend, String creator, Timestamp create_time,
			String modifier, Timestamp modify_time) {
		super();
		this.id = id;
		this.name = name;
		this.file_name = file_name;
		this.link = link;
		this.active = active;
		this.approve = approve;
		this.target = target;
		this.start_time = start_time;
		this.end_time = end_time;
		this.recommend = recommend;
		this.creator = creator;
		this.create_time = create_time;
		this.modifier = modifier;
		this.modify_time = modify_time;
	}

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

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Timestamp getStart_time() {
		return start_time;
	}

	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}

	public Timestamp getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
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

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
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

	public void setModify_time(Timestamp modify_time) {
		this.modify_time = modify_time;
	}

}
