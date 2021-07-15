package com.example.INJ.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 部落格文章回應
 *
 * @author jason
 *
 */
public class BlogComment implements Serializable {

	private static final long serialVersionUID = 6141370928071809479L;

	private long id;

	private long blogId;

	private long postId;

	private String member_id;

	private String author;

	private String email;

	private String ip;

	private String content;

	private Date createdOn;

	private String reply;

	private Date replyOn;

	private String userDisplayImage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getReplyOn() {
		return replyOn;
	}

	public void setReplyOn(Date replyOn) {
		this.replyOn = replyOn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUserDisplayImage() {
		return userDisplayImage;
	}

	public void setUserDisplayImage(String userDisplayImage) {
		this.userDisplayImage = userDisplayImage;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String memberId) {
		member_id = memberId;
	}

}
