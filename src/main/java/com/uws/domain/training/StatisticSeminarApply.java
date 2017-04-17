package com.uws.domain.training;

import java.util.Date;

import com.uws.core.base.BaseModel;

public class StatisticSeminarApply extends BaseModel{
	private static final long serialVersionUID = 5473692980488850180L;
	
	private String seminarId;
	
	private String seminarName;
	
	private String seminarTheme;
	
	private OuterUserInfo outerUserId;
	
	private Date seminarDate;
	private String seminarDateStr;
	
	private String appointPlace;
	
	private Integer attendNum;
	
	private Integer totalNum;

	public String getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(String seminarId) {
		this.seminarId = seminarId;
	}

	public String getSeminarName() {
		return seminarName;
	}

	public void setSeminarName(String seminarName) {
		this.seminarName = seminarName;
	}

	public String getSeminarTheme() {
		return seminarTheme;
	}

	public void setSeminarTheme(String seminarTheme) {
		this.seminarTheme = seminarTheme;
	}

	public OuterUserInfo getOuterUserId() {
		return outerUserId;
	}

	public void setOuterUserId(OuterUserInfo outerUserId) {
		this.outerUserId = outerUserId;
	}

	public Date getSeminarDate() {
		return seminarDate;
	}

	public void setSeminarDate(Date seminarDate) {
		this.seminarDate = seminarDate;
	}

	public String getSeminarDateStr() {
		return seminarDateStr;
	}

	public void setSeminarDateStr(String seminarDateStr) {
		this.seminarDateStr = seminarDateStr;
	}

	public String getAppointPlace() {
		return appointPlace;
	}

	public void setAppointPlace(String appointPlace) {
		this.appointPlace = appointPlace;
	}

	public Integer getAttendNum() {
		return attendNum;
	}

	public void setAttendNum(Integer attendNum) {
		this.attendNum = attendNum;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
}
