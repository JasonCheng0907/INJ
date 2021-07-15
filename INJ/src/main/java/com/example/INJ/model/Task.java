package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 功能
 * 
 * @author jason
 *
 */
public class Task implements Serializable {

	private static final long serialVersionUID = 592180766642480092L;
	private String id;
	private String uri;
	private String name;
	private String parent;
	private String creator;
	private Timestamp create_time;

	private List<Task> childs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
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

	public List getChilds() {
		return childs;
	}

	public void setChilds(List childs) {
		this.childs = childs;
	}

}