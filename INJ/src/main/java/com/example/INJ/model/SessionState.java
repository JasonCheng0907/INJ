package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class SessionState implements Serializable {
	private static final long serialVersionUID = 1661270515882521506L;
	private String sessionId;
	private String memId;
	private Timestamp opDate;
	private String ip;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public Timestamp getOpDate() {
		return opDate;
	}

	public void setOpDate(Timestamp opDate) {
		this.opDate = opDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
