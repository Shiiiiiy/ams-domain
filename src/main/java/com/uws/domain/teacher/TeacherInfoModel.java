package com.uws.domain.teacher;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;

/**
 * @author houyue
 * @version:2015年8月25日 10:49:05
 * @Description:教师基本信息
 */
public class TeacherInfoModel extends BaseModel {

	private static final long serialVersionUID = -275698981866084908L;

	/**
	 * 教师ID
	 */
	private BaseTeacherModel teacher;

	/**
	 * 联系电话
	 */
	private String cellphone;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 邮编
	 */
	private String postCode;

	/**
	 * 工作经历
	 */
	private String experience;

	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 荣誉
	 */
	private String honour;
	
	/**
	 * 授课风格
	 */
	private String teachingStyle;
	/**
	 * 工作电话
	 */
	private String phoneNumber;
	/**
	 * 创建时间
	 */
	private Date creatTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	
	public BaseTeacherModel getTeacher() {
		return teacher;
	}

	public void setTeacher(BaseTeacherModel teacher) {
		this.teacher = teacher;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHonour() {
		return honour;
	}

	public void setHonour(String honour) {
		this.honour = honour;
	}

	public String getTeachingStyle() {
		return teachingStyle;
	}

	public void setTeachingStyle(String teachingStyle) {
		this.teachingStyle = teachingStyle;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
