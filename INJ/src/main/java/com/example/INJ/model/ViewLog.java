package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 首頁點閱次數
 * 
 * @author jason
 */
public class ViewLog implements Serializable {

	private static final long serialVersionUID = -127367392625478292L;
	private String ip;
	private Timestamp view_time;
	private String member_id;
	private String path;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getView_time() {
		return view_time;
	}

	public void setView_time(Timestamp viewTime) {
		view_time = viewTime;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String memberId) {
		member_id = memberId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
