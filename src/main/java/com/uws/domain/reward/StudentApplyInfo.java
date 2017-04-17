package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 *@author:zhangyb
 *@version:2015年8月21日 上午11:09:30
 *@Description:学生申请明细表
 *
 */
public class StudentApplyInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 申请学生Id
	 */
	private StudentInfoModel studentId;
	private String studentIdStr;
	private String stuName;
	
	
	/**
	 * 导入所用学院
	 */
	private String academyIdStr;
	/**
	 * 导入所用序号
	 */
	private String serialNum;
	
	/**
	 * 评奖评优类型ID
	 */
	private AwardType awardTypeId;
	private String awardTypeIdStr;
	private String secondAwardName;
	
	/**
	 * 评奖评优编码
	 */
	private String awardTypeCode;
	
	/**
	 * 申请状态
	 */
	private Dic applyStatus;
	
	/**
	 * 申请来源（自己已有权限申请或者导入或者管理员添加的权限）
	 */
	private Dic applySource;
	
	/**
	 * 是否满足申请条件
	 */
	private Dic meetCondition;
	
	/**
	 * 学年
	 */
	private Dic schoolYear;
	
	/**
	 * 银行卡账号
	 */
	private String bankAccount;
	
	/**
	 * 主要事迹
	 */
	private String mainEvent;
	
	/**
	 * 不符合要求事项
	 */
	private String misMatchThing;
	
	/**
	 * 特别加分理由
	 */
	private String specialReason;
	
	/**
	 * 个人学年表现
	 */
	private String personalPerformance;
	
	/**
	 * 申报理由
	 */
	private String applyReason;
	
	/**
	 * 下一节点办理人
	 */
	private User nextApprover;
	
	/**
	 * 流程审批状态
	 */
	private String approveStatus;
	
	/**
	 *流程实例状态 
	 */
	private String processStatus;
	
	/**
	 * 审批意见
	 */
	private String approveMessage;
	
	

	public StudentInfoModel getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}

	public AwardType getAwardTypeId() {
		return awardTypeId;
	}

	public void setAwardTypeId(AwardType awardTypeId) {
		this.awardTypeId = awardTypeId;
	}

	public Dic getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Dic applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Dic getApplySource() {
		return applySource;
	}

	public void setApplySource(Dic applySource) {
		this.applySource = applySource;
	}

	public Dic getMeetCondition() {
		return meetCondition;
	}

	public void setMeetCondition(Dic meetCondition) {
		this.meetCondition = meetCondition;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getMainEvent() {
		return mainEvent;
	}

	public void setMainEvent(String mainEvent) {
		this.mainEvent = mainEvent;
	}

	public String getMisMatchThing() {
		return misMatchThing;
	}

	public void setMisMatchThing(String misMatchThing) {
		this.misMatchThing = misMatchThing;
	}

	public String getSpecialReason() {
		return specialReason;
	}

	public void setSpecialReason(String specialReason) {
		this.specialReason = specialReason;
	}

	public String getPersonalPerformance() {
		return personalPerformance;
	}

	public void setPersonalPerformance(String personalPerformance) {
		this.personalPerformance = personalPerformance;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public User getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(User nextApprover) {
		this.nextApprover = nextApprover;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getApproveMessage() {
		return approveMessage;
	}

	public void setApproveMessage(String approveMessage) {
		this.approveMessage = approveMessage;
	}

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getStudentIdStr() {
		return studentIdStr;
	}

	public void setStudentIdStr(String studentIdStr) {
		this.studentIdStr = studentIdStr;
	}

	public String getAwardTypeIdStr() {
		return awardTypeIdStr;
	}

	public void setAwardTypeIdStr(String awardTypeIdStr) {
		this.awardTypeIdStr = awardTypeIdStr;
	}

	public String getSecondAwardName() {
		return secondAwardName;
	}

	public void setSecondAwardName(String secondAwardName) {
		this.secondAwardName = secondAwardName;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getAwardTypeCode() {
		return awardTypeCode;
	}

	public void setAwardTypeCode(String awardTypeCode) {
		this.awardTypeCode = awardTypeCode;
	}

	public String getAcademyIdStr() {
		return academyIdStr;
	}

	public void setAcademyIdStr(String academyIdStr) {
		this.academyIdStr = academyIdStr;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	
	
}
