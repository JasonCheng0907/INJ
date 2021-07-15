package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 志工
 * 
 * @author jason
 */
public class Volunteer implements Serializable {

	private static final long serialVersionUID = -6765035202303795720L;
	private String id;
	private String contact;
	private String name;
	private String gender;
	private String email;
	private String city;
	private String area;
	private String address;
	private String tel;
	private Date birthday;
	private String personal_id;
	private String church_id;
	private String belong_church;
	private String introducer;
	private String christian;
	private String occupation;
	private String job_title;
	private String service_units;
	private String emergency_contact;
	private String emergency_contact_tel;
	private String service_domain;
	private String free_time;
	private String service_experience;
	private String memo;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getChurch_id() {
		return church_id;
	}

	public void setChurch_id(String churchId) {
		church_id = churchId;
	}

	public String getBelong_church() {
		return belong_church;
	}

	public void setBelong_church(String belongChurch) {
		belong_church = belongChurch;
	}

	public String getIntroducer() {
		return introducer;
	}

	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}

	public String getChristian() {
		return christian;
	}

	public void setChristian(String christian) {
		this.christian = christian;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String jobTitle) {
		job_title = jobTitle;
	}

	public String getService_units() {
		return service_units;
	}

	public void setService_units(String serviceUnits) {
		service_units = serviceUnits;
	}

	public String getEmergency_contact() {
		return emergency_contact;
	}

	public void setEmergency_contact(String emergencyContact) {
		emergency_contact = emergencyContact;
	}

	public String getEmergency_contact_tel() {
		return emergency_contact_tel;
	}

	public void setEmergency_contact_tel(String emergencyContactTel) {
		emergency_contact_tel = emergencyContactTel;
	}

	public String getService_domain() {
		return service_domain;
	}

	public void setService_domain(String serviceDomain) {
		service_domain = serviceDomain;
	}

	public String getFree_time() {
		return free_time;
	}

	public void setFree_time(String freeTime) {
		free_time = freeTime;
	}

	public String getService_experience() {
		return service_experience;
	}

	public void setService_experience(String serviceExperience) {
		service_experience = serviceExperience;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
