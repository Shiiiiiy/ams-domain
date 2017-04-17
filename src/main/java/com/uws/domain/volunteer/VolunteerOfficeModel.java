package com.uws.domain.volunteer;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;

/**
 * 志愿者基地信息实体类
 */
public class VolunteerOfficeModel extends BaseModel {

	private static final long serialVersionUID = -5259144624801196221L;

	/**
	 * 学院
	 */
	private BaseAcademyModel college;

	/**
	 * 基地地址
	 */
	private String officeAddress;
	/**
	 * 成立时间
	 */
	private Date foundedTime;

	/**
	 * 基地负责人
	 */
	private String manager;

	/**
	 * 负责人电话
	 */
	private String managerPhone;

	/**
	 * 负责人QQ
	 */
	private String managerQQ;

	/**
	 * 其他联系方式
	 */
	private String otherWay;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Date getFoundedTime() {
		return foundedTime;
	}

	public void setFoundedTime(Date foundedTime) {
		this.foundedTime = foundedTime;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public String getManagerQQ() {
		return managerQQ;
	}

	public void setManagerQQ(String managerQQ) {
		this.managerQQ = managerQQ;
	}

	public String getOtherWay() {
		return otherWay;
	}

	public void setOtherWay(String otherWay) {
		this.otherWay = otherWay;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}