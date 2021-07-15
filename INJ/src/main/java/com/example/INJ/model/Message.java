package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 影片分享、新聞留言版
 * 
 * @author jason
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 4135946158981336636L;
	private String id;
	private String member_id;
	private String video_id;
	private String news_id;
	private String content;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private Member member;
	private Video video;
	private News news;

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

	public String getVideo_id() {
		return video_id;
	}

	public void setVideo_id(String videoId) {
		video_id = videoId;
	}

	public String getNews_id() {
		return news_id;
	}

	public void setNews_id(String newsId) {
		news_id = newsId;
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

	public Member getMember() {
		return member;
	}

	public void pushMember(Member member) {
		this.member = member;
	}

	public Video getVideo() {
		return video;
	}

	public void pushVideo(Video video) {
		this.video = video;
	}

	public News getNews() {
		return news;
	}

	public void pushNews(News news) {
		this.news = news;
	}

}
