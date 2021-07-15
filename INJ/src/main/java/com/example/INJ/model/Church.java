package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 教會
 * 
 * @author jason
 */
public class Church implements Serializable {

	private static final long serialVersionUID = 4016518020918694185L;
	private String id;
	private String name;
	private String city;
	private String area;
	private String address;
	private double in_lat;
	private double in_lng;
	private String tel;
	private String web_site;
	private String active;
	private String creator;
	private Timestamp create_time;
	private String modifier;
	private Timestamp modify_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWeb_site() {
		return web_site;
	}

	public void setWeb_site(String webSite) {
		web_site = webSite;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
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

	public double getIn_lat() {
		return in_lat;
	}

	public void setIn_lat(double inLat) {
		in_lat = inLat;
	}

	public double getIn_lng() {
		return in_lng;
	}

	public void setIn_lng(double inLng) {
		in_lng = inLng;
	}

}
