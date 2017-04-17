package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @author: houyue
 * @version: 2015年10月15日 16:39:38
 * @Description: 讲师导师信息维护表
 *
 */
public class OuterUserInfo extends BaseModel {
	private static final long serialVersionUID = -275698981866084908L;
	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 用户编号
	 */
	private String userCode;
	
	/**
	 * 性别
	 */
	private Dic gender;
	
	/**
	 * 单位
	 */
	private String unit;
	
	/**
	 * 职位
	 */
	private String duty;
	
	/**
	 * 用户简介
	 */
	private String userProfile;
	
	/**
	 * 用户类型
	 */
	private Dic userType;
	
	/**
	 * 用户信息启用状态
	 */
	private Dic userStatus;
	
	/**
	 * 手机号码
	 */
	private String phoneNum;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 参与项目
	 */
	private Dic participateProject;
	
	private String participateProjectStr;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Dic getGender() {
		return gender;
	}

	public void setGender(Dic gender) {
		this.gender = gender;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	public Dic getUserType() {
		return userType;
	}

	public void setUserType(Dic userType) {
		this.userType = userType;
	}

	public Dic getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Dic userStatus) {
		this.userStatus = userStatus;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Dic getParticipateProject() {
		return participateProject;
	}

	public void setParticipateProject(Dic participateProject) {
		this.participateProject = participateProject;
	}

	public String getParticipateProjectStr() {
		return participateProjectStr;
	}

	public void setParticipateProjectStr(String participateProjectStr) {
		this.participateProjectStr = participateProjectStr;
	}
	
	
	
}