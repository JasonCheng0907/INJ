package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 部落格樣式
 * 
 * @author jason
 *
 */
public class BlogTheme implements Serializable {

	private static final long serialVersionUID = -3242849026091692836L;

	private String id;
	private String name;
	private Timestamp create_time;

	public static String Default_Theme_Name = "skin1";

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

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp createTime) {
		create_time = createTime;
	}

}
