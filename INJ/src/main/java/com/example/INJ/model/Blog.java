package com.example.INJ.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 部落格
 * 
 * @author jason
 *
 */
public class Blog implements Serializable {

	private static final long serialVersionUID = 1529806213700666452L;

	private Long id;

	private String userId;

	private int cateId;

	private String title;

	private String desc;

	private String userIntro;

	private String userDisplayName;

	private String userDisplayImage;

	private boolean famous;

	private String themeId;

	private long posts;

	private long views;

	private long comments;

	private long viewsToday;

	private Date createdOn;

	private boolean open;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isFamous() {
		return famous;
	}

	public void setFamous(boolean famous) {
		this.famous = famous;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUserIntro() {
		return userIntro;
	}

	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}

	public String getUserDisplayName() {
		return userDisplayName;
	}

	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}

	public String getUserDisplayImage() {
		return userDisplayImage;
	}

	public void setUserDisplayImage(String userDisplayImage) {
		this.userDisplayImage = userDisplayImage;
	}

	public long getPosts() {
		return posts;
	}

	public void setPosts(long posts) {
		this.posts = posts;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public long getViewsToday() {
		return viewsToday;
	}

	public void setViewsToday(long viewsToday) {
		this.viewsToday = viewsToday;
	}

	public long getComments() {
		return comments;
	}

	public void setComments(long comments) {
		this.comments = comments;
	}

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

}
