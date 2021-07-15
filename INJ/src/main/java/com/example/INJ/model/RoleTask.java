package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author jason
 *
 */
public class RoleTask implements Serializable {

	private static final long serialVersionUID = -6947597452229410795L;
	private String id;
	private String role_id;
	private String task_id;
	private String creator;
	private Timestamp create_time;

	private Task task;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
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

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}