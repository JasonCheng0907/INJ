package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 部落格文章
 * 
 * @author jason
 *
 */
public class BlogArticle implements Serializable {

	private static final long serialVersionUID = -2913569863047026886L;
	private String id;
	private String member_id;
	private String blog_id;
	private String blog_category_id;
	private String title;
	private String content;
	private String active;
	private String status;
	private int views;
	private int views_today;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private BlogCategoryNew blogCategoryNew;
	private Member member;
	private List<BlogArticleResponse> blogArticleResponseList;
	private int blogArticleResponseCount;
	private String previewImg;

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

	public String getBlog_category_id() {
		return blog_category_id;
	}

	public void setBlog_category_id(String blogCategoryId) {
		blog_category_id = blogCategoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getViews_today() {
		return views_today;
	}

	public void setViews_today(int viewsToday) {
		views_today = viewsToday;
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

	public BlogCategoryNew getBlogCategoryNew() {
		return blogCategoryNew;
	}

	public void pushBlogCategoryNew(BlogCategoryNew blogCategoryNew) {
		this.blogCategoryNew = blogCategoryNew;
	}

	public Member getMember() {
		return member;
	}

	public void pushMember(Member member) {
		this.member = member;
	}

	public List<BlogArticleResponse> getBlogArticleResponseList() {
		return blogArticleResponseList;
	}

	public void pushBlogArticleResponseList(List<BlogArticleResponse> blogArticleResponseList) {
		this.blogArticleResponseList = blogArticleResponseList;
	}

	public int getBlogArticleResponseCount() {
		return blogArticleResponseCount;
	}

	public void pushBlogArticleResponseCount(int blogArticleResponseCount) {
		this.blogArticleResponseCount = blogArticleResponseCount;
	}

	public String getPreviewImg() {
		return previewImg;
	}

	public void pushPreviewImg(String previewImg) {
		this.previewImg = previewImg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
