package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 群組
 * 
 * @author jason
 *
 */
public class Role implements Serializable {

	private static final long serialVersionUID = -644815747866747262L;
	public static final String ADMIN = "001"; // 管理者

	private String id;
	private String name;
	private String description;
	private String active;// 狀態 0:關閉 1:啟用
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private List tasks;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List getTasks() {
		return tasks;
	}

	public void setTasks(List tasks) {
		this.tasks = tasks;
	}

}