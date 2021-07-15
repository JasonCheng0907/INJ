package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 心情日記
 * 
 * @author jason
 *
 */
public class BlogDaily implements Serializable {

	private static final long serialVersionUID = -3505043637530477081L;
	private String id;
	private String blog_daily_id;
	private String member_id;
	private String blog_id;
	private String category_id;
	private String content;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private Category category;
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

	public String getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(String blogId) {
		blog_id = blogId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String categoryId) {
		category_id = categoryId;
	}

	public Category getCategory() {
		return category;
	}

	public void pushCategory(Category category) {
		this.category = category;
	}

	public Member getMember() {
		return member;
	}

	public void pushMember(Member member) {
		this.member = member;
	}

	public String getBlog_daily_id() {
		return blog_daily_id;
	}

	public void setBlog_daily_id(String blogDailyId) {
		blog_daily_id = blogDailyId;
	}

}
