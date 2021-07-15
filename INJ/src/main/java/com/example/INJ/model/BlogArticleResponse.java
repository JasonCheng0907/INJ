package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 部落格文章回應
 * 
 * @author jason
 *
 */
public class BlogArticleResponse implements Serializable {

	private static final long serialVersionUID = 1624950070987100985L;
	private String id;
	private String blog_article_id;
	private String member_id;
	private String content;
	private String author_ip;
	private String creator;
	private Timestamp create_time;

	private Member member;
	private BlogArticle blogArticle;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlog_article_id() {
		return blog_article_id;
	}

	public void setBlog_article_id(String blogArticleId) {
		blog_article_id = blogArticleId;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String memberId) {
		member_id = memberId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor_ip() {
		return author_ip;
	}

	public void setAuthor_ip(String authorIp) {
		author_ip = authorIp;
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

	public Member getMember() {
		return member;
	}

	public void pushMember(Member member) {
		this.member = member;
	}

	public BlogArticle getBlogArticle() {
		return blogArticle;
	}

	public void pushBlogArticle(BlogArticle blogArticle) {
		this.blogArticle = blogArticle;
	}

}
