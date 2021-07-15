package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 部落格長老
 * 
 * @author jason
 */
public class Presbyter implements Serializable {

	private static final long serialVersionUID = 382794353727688564L;
	private String id;
	private String member_id;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private Member member;

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

	public Member getMember() {
		return member;
	}

	public void pushMember(Member member) {
		this.member = member;
	}

}
