package com.uws.domain.activity;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 活动成员实体类
 */
public class ActivityMemberModel  extends BaseModel{

	private static final long serialVersionUID = 3090975757621692577L;
	
	/**
	 * 活动基本信息对象
	 */
	private ActivityBaseinfoModel activityPo;
	
	/**
	 * 活动成员
	 */
	private StudentInfoModel member;
	/**
	 * 学生id
	 */
	private String stuNumber;
	/**
	 * 审核状态
	 */
	private Dic approveStatus;
	/**
	 * 审核意见
	 */
	private String suggest;
	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	/**
	 * 报名方式
	 */
	private Dic registraForm;

	public ActivityBaseinfoModel getActivityPo() {
		return activityPo;
	}

	public void setActivityPo(ActivityBaseinfoModel activityPo) {
		this.activityPo = activityPo;
	}

	public StudentInfoModel getMember() {
		return member;
	}

	public void setMember(StudentInfoModel member) {
		this.member = member;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	public Dic getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Dic approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public Dic getRegistraForm() {
		return registraForm;
	}

	public void setRegistraForm(Dic registraForm) {
		this.registraForm = registraForm;
	}
	
}