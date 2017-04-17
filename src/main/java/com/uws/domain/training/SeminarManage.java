package com.uws.domain.training;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 
 * @ClassName: SeminarManage
 * @Description: 讲座基本信息
 * @author 联合永道
 * @date 2015年10月27日 15:40:55
 * 
 */
public class SeminarManage extends BaseModel {

	private static final long serialVersionUID = 2017924450000250155L;
	/**
	 * 讲座名称
	 */
	private String seminarName;
	
	/**
	 * 讲座主题
	 */
	private String seminarTheme;
	
	/**
	 * 主讲人
	 */
	private OuterUserInfo outerUserId;
	
	/**
	 * 讲座状态
	 */
	private Dic seminarStatus;
	
	/**
	 * 讲座确定日期
	 */
	private Date seminarDate;
	
	/**
	 * 讲座开始时间
	 */
	private String beginDate;
	
	/**
	 * 讲座结束时间
	 */
	private String endDate;
	
	/**
	 * 讲座确定地点
	 */
	private String appointPlace;
	
	/**
	 * 讲座确定人数
	 */
	private int attendNum;
	
	/**
	 * 实到人数
	 */
	private int actualNum;
	
	/**
	 * 报名人数
	 */
	private int applyNum;
	
	/**
	 * 备注
	 */
	private String comment;
	
	/**
	 * 创建人
	 */
	private User creator;

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

	public Dic getSeminarStatus() {
		return seminarStatus;
	}

	public void setSeminarStatus(Dic seminarStatus) {
		this.seminarStatus = seminarStatus;
	}

	public Date getSeminarDate() {
		return seminarDate;
	}

	public void setSeminarDate(Date seminarDate) {
		this.seminarDate = seminarDate;
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

	public int getAttendNum() {
		return attendNum;
	}

	public void setAttendNum(int attendNum) {
		this.attendNum = attendNum;
	}

	public int getActualNum() {
		return actualNum;
	}

	public void setActualNum(int actualNum) {
		this.actualNum = actualNum;
	}

	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
