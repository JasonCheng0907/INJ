package com.example.INJ.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 建國一百年活動
 * 
 * @author jason
 */
public class Event implements Serializable {

	private static final long serialVersionUID = 25608346368451755L;
	private String id;
	private String title;
	private String focus_news_1;
	private String focus_news_link_1;
	private String focus_news_2;
	private String focus_news_link_2;
	private String focus_news_3;
	private String focus_news_link_3;
	private String banner_path_1;
	private String banner_link_1;
	private String banner_path_2;
	private String banner_link_2;
	private String banner_path_3;
	private String banner_link_3;
	private String banner_path_4;
	private String banner_link_4;
	private String banner_path_5;
	private String banner_link_5;
	private String banner_path_6;
	private String banner_link_6;
	private String banner_path_7;
	private String banner_link_7;
	private String banner_path_8;
	private String banner_link_8;
	private String sponsor_path_1;
	private String sponsor_link_1;
	private String sponsor_title_1;
	private String sponsor_path_2;
	private String sponsor_link_2;
	private String sponsor_path_3;
	private String sponsor_link_3;
	private String organizer_path_1;
	private String organizer_link_1;
	private String organizer_title_1;
	private String organizer_path_2;
	private String organizer_link_2;
	private String organizer_path_3;
	private String organizer_link_3;
	private String organizer_path_4;
	private String organizer_link_4;
	private String organizer_path_5;
	private String organizer_link_5;
	private String organizer_path_6;
	private String organizer_link_6;
	private String organizer_path_7;
	private String organizer_link_7;
	private String organizer_path_8;
	private String organizer_link_8;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFocus_news_1() {
		return focus_news_1;
	}

	public void setFocus_news_1(String focusNews_1) {
		focus_news_1 = focusNews_1;
	}

	public String getFocus_news_link_1() {
		return focus_news_link_1;
	}

	public void setFocus_news_link_1(String focusNewsLink_1) {
		focus_news_link_1 = focusNewsLink_1;
	}

	public String getFocus_news_2() {
		return focus_news_2;
	}

	public void setFocus_news_2(String focusNews_2) {
		focus_news_2 = focusNews_2;
	}

	public String getFocus_news_link_2() {
		return focus_news_link_2;
	}

	public void setFocus_news_link_2(String focusNewsLink_2) {
		focus_news_link_2 = focusNewsLink_2;
	}

	public String getFocus_news_3() {
		return focus_news_3;
	}

	public void setFocus_news_3(String focusNews_3) {
		focus_news_3 = focusNews_3;
	}

	public String getFocus_news_link_3() {
		return focus_news_link_3;
	}

	public void setFocus_news_link_3(String focusNewsLink_3) {
		focus_news_link_3 = focusNewsLink_3;
	}

	public String getBanner_path_1() {
		return banner_path_1;
	}

	public void setBanner_path_1(String bannerPath_1) {
		banner_path_1 = bannerPath_1;
	}

	public String getBanner_path_2() {
		return banner_path_2;
	}

	public void setBanner_path_2(String bannerPath_2) {
		banner_path_2 = bannerPath_2;
	}

	public String getBanner_path_3() {
		return banner_path_3;
	}

	public void setBanner_path_3(String bannerPath_3) {
		banner_path_3 = bannerPath_3;
	}

	public String getBanner_path_4() {
		return banner_path_4;
	}

	public void setBanner_path_4(String bannerPath_4) {
		banner_path_4 = bannerPath_4;
	}

	public String getBanner_path_5() {
		return banner_path_5;
	}

	public void setBanner_path_5(String bannerPath_5) {
		banner_path_5 = bannerPath_5;
	}

	public String getBanner_path_6() {
		return banner_path_6;
	}

	public void setBanner_path_6(String bannerPath_6) {
		banner_path_6 = bannerPath_6;
	}

	public String getBanner_path_7() {
		return banner_path_7;
	}

	public void setBanner_path_7(String bannerPath_7) {
		banner_path_7 = bannerPath_7;
	}

	public String getBanner_path_8() {
		return banner_path_8;
	}

	public void setBanner_path_8(String bannerPath_8) {
		banner_path_8 = bannerPath_8;
	}

	public String getSponsor_path_1() {
		return sponsor_path_1;
	}

	public void setSponsor_path_1(String sponsorPath_1) {
		sponsor_path_1 = sponsorPath_1;
	}

	public String getSponsor_link_1() {
		return sponsor_link_1;
	}

	public void setSponsor_link_1(String sponsorLink_1) {
		sponsor_link_1 = sponsorLink_1;
	}

	public String getSponsor_path_2() {
		return sponsor_path_2;
	}

	public void setSponsor_path_2(String sponsorPath_2) {
		sponsor_path_2 = sponsorPath_2;
	}

	public String getSponsor_path_3() {
		return sponsor_path_3;
	}

	public void setSponsor_path_3(String sponsorPath_3) {
		sponsor_path_3 = sponsorPath_3;
	}

	public String getOrganizer_path_1() {
		return organizer_path_1;
	}

	public void setOrganizer_path_1(String organizerPath_1) {
		organizer_path_1 = organizerPath_1;
	}

	public String getOrganizer_link_1() {
		return organizer_link_1;
	}

	public void setOrganizer_link_1(String organizerLink_1) {
		organizer_link_1 = organizerLink_1;
	}

	public String getOrganizer_path_2() {
		return organizer_path_2;
	}

	public void setOrganizer_path_2(String organizerPath_2) {
		organizer_path_2 = organizerPath_2;
	}

	public String getOrganizer_path_3() {
		return organizer_path_3;
	}

	public void setOrganizer_path_3(String organizerPath_3) {
		organizer_path_3 = organizerPath_3;
	}

	public String getOrganizer_path_4() {
		return organizer_path_4;
	}

	public void setOrganizer_path_4(String organizerPath_4) {
		organizer_path_4 = organizerPath_4;
	}

	public String getOrganizer_path_5() {
		return organizer_path_5;
	}

	public void setOrganizer_path_5(String organizerPath_5) {
		organizer_path_5 = organizerPath_5;
	}

	public String getOrganizer_path_6() {
		return organizer_path_6;
	}

	public void setOrganizer_path_6(String organizerPath_6) {
		organizer_path_6 = organizerPath_6;
	}

	public String getOrganizer_path_7() {
		return organizer_path_7;
	}

	public void setOrganizer_path_7(String organizerPath_7) {
		organizer_path_7 = organizerPath_7;
	}

	public String getOrganizer_path_8() {
		return organizer_path_8;
	}

	public void setOrganizer_path_8(String organizerPath_8) {
		organizer_path_8 = organizerPath_8;
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

	public String getSponsor_link_2() {
		return sponsor_link_2;
	}

	public void setSponsor_link_2(String sponsorLink_2) {
		sponsor_link_2 = sponsorLink_2;
	}

	public String getSponsor_link_3() {
		return sponsor_link_3;
	}

	public void setSponsor_link_3(String sponsorLink_3) {
		sponsor_link_3 = sponsorLink_3;
	}

	public String getOrganizer_link_2() {
		return organizer_link_2;
	}

	public void setOrganizer_link_2(String organizerLink_2) {
		organizer_link_2 = organizerLink_2;
	}

	public String getOrganizer_link_3() {
		return organizer_link_3;
	}

	public void setOrganizer_link_3(String organizerLink_3) {
		organizer_link_3 = organizerLink_3;
	}

	public String getOrganizer_link_4() {
		return organizer_link_4;
	}

	public void setOrganizer_link_4(String organizerLink_4) {
		organizer_link_4 = organizerLink_4;
	}

	public String getOrganizer_link_5() {
		return organizer_link_5;
	}

	public void setOrganizer_link_5(String organizerLink_5) {
		organizer_link_5 = organizerLink_5;
	}

	public String getOrganizer_link_6() {
		return organizer_link_6;
	}

	public void setOrganizer_link_6(String organizerLink_6) {
		organizer_link_6 = organizerLink_6;
	}

	public String getOrganizer_link_7() {
		return organizer_link_7;
	}

	public void setOrganizer_link_7(String organizerLink_7) {
		organizer_link_7 = organizerLink_7;
	}

	public String getOrganizer_link_8() {
		return organizer_link_8;
	}

	public void setOrganizer_link_8(String organizerLink_8) {
		organizer_link_8 = organizerLink_8;
	}

	public String getBanner_link_1() {
		return banner_link_1;
	}

	public void setBanner_link_1(String bannerLink_1) {
		banner_link_1 = bannerLink_1;
	}

	public String getBanner_link_2() {
		return banner_link_2;
	}

	public void setBanner_link_2(String bannerLink_2) {
		banner_link_2 = bannerLink_2;
	}

	public String getBanner_link_3() {
		return banner_link_3;
	}

	public void setBanner_link_3(String bannerLink_3) {
		banner_link_3 = bannerLink_3;
	}

	public String getBanner_link_4() {
		return banner_link_4;
	}

	public void setBanner_link_4(String bannerLink_4) {
		banner_link_4 = bannerLink_4;
	}

	public String getBanner_link_5() {
		return banner_link_5;
	}

	public void setBanner_link_5(String bannerLink_5) {
		banner_link_5 = bannerLink_5;
	}

	public String getBanner_link_6() {
		return banner_link_6;
	}

	public void setBanner_link_6(String bannerLink_6) {
		banner_link_6 = bannerLink_6;
	}

	public String getBanner_link_7() {
		return banner_link_7;
	}

	public void setBanner_link_7(String bannerLink_7) {
		banner_link_7 = bannerLink_7;
	}

	public String getBanner_link_8() {
		return banner_link_8;
	}

	public void setBanner_link_8(String bannerLink_8) {
		banner_link_8 = bannerLink_8;
	}

	public String getSponsor_title_1() {
		return sponsor_title_1;
	}

	public void setSponsor_title_1(String sponsorTitle_1) {
		sponsor_title_1 = sponsorTitle_1;
	}

	public String getOrganizer_title_1() {
		return organizer_title_1;
	}

	public void setOrganizer_title_1(String organizerTitle_1) {
		organizer_title_1 = organizerTitle_1;
	}

}
