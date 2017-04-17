package com.uws.domain.training;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

public class SeminarSubscribe extends BaseModel {
	private static final long serialVersionUID = 1727958962908564770L;
	/**
	 * 讲座id
	 */
	private SeminarManage seminarId;
	
	/**
	 * 申请人id
	 */
	private BaseTeacherModel appointUserId;
	
	/**
	 * 申请人所在学院
	 */
	private BaseAcademyModel appointAcademy;
	
	/**
	 *预约状态 
	 */
	private Dic appointStatus;
	/**
	 * 预期讲座时间
	 */
	private Date appointTime;
	
	/**
	 * 讲座开始时间
	 */
	private String beginDate;
	
	/**
	 * 讲座结束时间
	 */
	private String endDate;
	
	/**
	 * 预期讲座地点
	 */
	private String appointPlace;
	
	/**
	 * 预期讲座人数
	 */
	private Integer appointNum;
	
	/**
	 * 创建者
	 */
	private User creator;
	
	/**
	 * 预约人电话
	 */
	private String appointPhone;
	
	/**
	 * 预约人邮箱
	 */
	private String appointEmail;
	
	/**
	 * 预约人QQ
	 */
	private String appointQQ;
	
	public SeminarManage getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(SeminarManage seminarId) {
		this.seminarId = seminarId;
	}

	public BaseTeacherModel getAppointUserId() {
		return appointUserId;
	}

	public void setAppointUserId(BaseTeacherModel appointUserId) {
		this.appointUserId = appointUserId;
	}

	public BaseAcademyModel getAppointAcademy() {
		return appointAcademy;
	}

	public void setAppointAcademy(BaseAcademyModel appointAcademy) {
		this.appointAcademy = appointAcademy;
	}

	public Dic getAppointStatus() {
		return appointStatus;
	}

	public void setAppointStatus(Dic appointStatus) {
		this.appointStatus = appointStatus;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAppointPlace() {
		return appointPlace;
	}

	public void setAppointPlace(String appointPlace) {
		this.appointPlace = appointPlace;
	}

	public Integer getAppointNum() {
		return appointNum;
	}

	public void setAppointNum(Integer appointNum) {
		this.appointNum = appointNum;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getAppointPhone() {
		return appointPhone;
	}

	public void setAppointPhone(String appointPhone) {
		this.appointPhone = appointPhone;
	}

	public String getAppointEmail() {
		return appointEmail;
	}

	public void setAppointEmail(String appointEmail) {
		this.appointEmail = appointEmail;
	}

	public String getAppointQQ() {
		return appointQQ;
	}

	public void setAppointQQ(String appointQQ) {
		this.appointQQ = appointQQ;
	}
	
	
}
