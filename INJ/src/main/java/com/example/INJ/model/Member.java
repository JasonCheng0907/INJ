package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 會員
 * 
 * @author jason
 */
public class Member implements Serializable {

	private static final long serialVersionUID = -6415659904587266106L;
	private String id;
	private String account;
	private String password;
	private String name;
	private String nickname;
	private String gender;
	private String email;
	private String city;
	private String area;
	private String address;
	private String tel;
	private String mobile;
	private Date birthday;
	private String church_id;
	private String belong_church;
	private String wash_year;
	private String file_name;
	private String personal_id;
	private String personal_id_type;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(String personalId) {
		personal_id = personalId;
	}

	public String getPersonal_id_type() {
		return personal_id_type;
	}

	public void setPersonal_id_type(String personalIdType) {
		personal_id_type = personalIdType;
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

	public String getBelong_church() {
		return belong_church;
	}

	public void setBelong_church(String belongChurch) {
		belong_church = belongChurch;
	}

	public String getWash_year() {
		return wash_year;
	}

	public void setWash_year(String washYear) {
		wash_year = washYear;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String fileName) {
		file_name = fileName;
	}

	public String getChurch_id() {
		return church_id;
	}

	public void setChurch_id(String churchId) {
		church_id = churchId;
	}

}
