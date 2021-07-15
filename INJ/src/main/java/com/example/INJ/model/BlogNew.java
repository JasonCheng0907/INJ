package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 部落格
 * 
 * @author jason
 *
 */
public class BlogNew implements Serializable {

	private static final long serialVersionUID = -5010401843691918806L;
	private String id;
	private String member_id;
	private String title;
	private String description;
	private String blog_theme_id;
	private int blog_views;
	private int blog_views_today;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private Member member;
	private BlogTheme blogTheme;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBlog_theme_id() {
		return blog_theme_id;
	}

	public void setBlog_theme_id(String blogThemeId) {
		blog_theme_id = blogThemeId;
	}

	public int getBlog_views() {
		return blog_views;
	}

	public void setBlog_views(int blogViews) {
		blog_views = blogViews;
	}

	public int getBlog_views_today() {
		return blog_views_today;
	}

	public void setBlog_views_today(int blogViewsToday) {
		blog_views_today = blogViewsToday;
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

	public BlogTheme getBlogTheme() {
		return blogTheme;
	}

	public void pushBlogTheme(BlogTheme blogTheme) {
		this.blogTheme = blogTheme;
	}

}
