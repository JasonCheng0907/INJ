package com.example.INJ.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 部落格文章
 *
 * @author jason
 *
 */
public class BlogPost implements Serializable {

	private static final long serialVersionUID = 2280009197312697856L;

	private long id;

	private long blogId;

	private String author; // 作者

	private String authorNickname;

	private Date postDate;// 發表日期

	private String content; // 文章內容

	private String title; // 文章標題

	private Integer postCategoryId;// 文章分類

	private String postCategoryName; // 文章分類名稱

	private String blogCategoryId;

	private String excerpt; // 引用

	private String password;// 密碼

	private Date modifiedDate;// 修改日期

	private String postType;

	private long commentCount;

	private boolean visible;

	private int views;

	private int viewsToday;

	private String previewImg;

	public static String TYPE_POST = "post";

	public static String TYPE_TALK = "talk";

	private String userDisplayImage;

	public String getPreviewImg() {
		return previewImg;
	}

	public void setPreviewImg(String previewImg) {
		this.previewImg = previewImg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getViewsToday() {
		return viewsToday;
	}

	public void setViewsToday(int viewsToday) {
		this.viewsToday = viewsToday;
	}

	public Integer getPostCategoryId() {
		return postCategoryId;
	}

	public void setPostCategoryId(Integer postCategoryId) {
		this.postCategoryId = postCategoryId;
	}

	public String getBlogCategoryId() {
		return blogCategoryId;
	}

	public void setBlogCategoryId(String blogCategoryId) {
		this.blogCategoryId = blogCategoryId;
	}

	public String getPostCategoryName() {
		return postCategoryName;
	}

	public void setPostCategoryName(String postCategoryName) {
		this.postCategoryName = postCategoryName;
	}

	public String getAuthorNickname() {
		return authorNickname;
	}

	public void setAuthorNickname(String authorNickname) {
		this.authorNickname = authorNickname;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getUserDisplayImage() {
		return userDisplayImage;
	}

	public void setUserDisplayImage(String userDisplayImage) {
		this.userDisplayImage = userDisplayImage;
	}

}
