package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 新聞
 * 
 * @author jason
 */
public class News implements Serializable {

	private static final long serialVersionUID = -8526032785637471540L;
	private String id;
	private String category_id;
	private String title;
	private String content;
	private String reporter;
	private String city;
	private Timestamp report_time;
	private String news_source;
	private String news_type;
	private String headline;
	private String file_name;
	private String active;
	private Timestamp start_time;
	private Timestamp end_time;
	private String forever;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	private NewsSource newsSource;
	private Category category;
	private String editor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getReport_time() {
		return report_time;
	}

	public void setReport_time(Timestamp reportTime) {
		report_time = reportTime;
	}

	public String getNews_source() {
		return news_source;
	}

	public void setNews_source(String newsSource) {
		news_source = newsSource;
	}

	public String getNews_type() {
		return news_type;
	}

	public void setNews_type(String newsType) {
		news_type = newsType;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String fileName) {
		file_name = fileName;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Timestamp getStart_time() {
		return start_time;
	}

	public void setStart_time(Timestamp startTime) {
		start_time = startTime;
	}

	public Timestamp getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Timestamp endTime) {
		end_time = endTime;
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

	public NewsSource getNewsSource() {
		return newsSource;
	}

	public void pushNewsSource(NewsSource newsSource) {
		this.newsSource = newsSource;
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

	public String getEditor() {
		return editor;
	}

	public void pushEditor(String editor) {
		this.editor = editor;
	}

	public String getForever() {
		return forever;
	}

	public void setForever(String forever) {
		this.forever = forever;
	}

}
