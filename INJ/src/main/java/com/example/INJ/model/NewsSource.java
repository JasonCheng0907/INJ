package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 新聞來源
 * 
 * @author jason
 */
public class NewsSource implements Serializable {

	private static final long serialVersionUID = 5560902412582676139L;
	private String id;
	private String name;
	private String file_name;
	private String active;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
