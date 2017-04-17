package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 *@author:zhangyb
 *@version:2015年8月21日 上午11:20:03
 *@Description: 班级评奖评优申请
 */
public class ClassApplyInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评奖评优类型ID
	 */
	private AwardType awardTypeId;
	private String awardTypeIdStr;
	
	/**
	 * 奖项名称编码
	 */
	private String awardTypeCode;
	
	/**
	 * 班级ID
	 */
	private BaseClassModel classId;
	private String classIdStr;
	private String classIdName;
	
	/**
	 * 导入用学院ID
	 */
	private String academyIdStr;
	
	/**
	 * 申请状态
	 */
	private Dic applyStatus;
	
	/**
	 * 申请来源（班主任已有权限申请/手动添加权限申请/导入）
	 */
	private Dic applySource;
	
	/**
	 * 是否满足申请条件
	 */
	private Dic meetCondition;
	
	/**
	 * 银行卡账号
	 */
	private String bankAccount;
	
	/**
	 * 班级获奖情况
	 */
	private String classAwardInfo;
	
	/**
	 * 主要成绩
	 */
	private String mainResult;
	
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

	public String getClassAwardInfo() {
		return classAwardInfo;
	}

	public void setClassAwardInfo(String classAwardInfo) {
		this.classAwardInfo = classAwardInfo;
	}

	public String getMainResult() {
		return mainResult;
	}

	public void setMainResult(String mainResult) {
		this.mainResult = mainResult;
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

	public BaseClassModel getClassId() {
		return classId;
	}

	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}


	public String getAwardTypeIdStr() {
		return awardTypeIdStr;
	}

	public void setAwardTypeIdStr(String awardTypeIdStr) {
		this.awardTypeIdStr = awardTypeIdStr;
	}

	public String getClassIdStr() {
		return classIdStr;
	}

	public void setClassIdStr(String classIdStr) {
		this.classIdStr = classIdStr;
	}

	public String getAcademyIdStr() {
		return academyIdStr;
	}

	public void setAcademyIdStr(String academyIdStr) {
		this.academyIdStr = academyIdStr;
	}

	public String getClassIdName() {
		return classIdName;
	}

	public void setClassIdName(String classIdName) {
		this.classIdName = classIdName;
	}

	public String getAwardTypeCode() {
		return awardTypeCode;
	}

	public void setAwardTypeCode(String awardTypeCode) {
		this.awardTypeCode = awardTypeCode;
	}

	
	
	
}
