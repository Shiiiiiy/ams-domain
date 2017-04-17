package com.uws.domain.reward;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @author zhangyb
 * @version:2015年8月11日 上午10:22:14
 * @Description:评优申请审批信息
 */
public class AwardApprove extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评优申请ID:学生申请ID or 班级申请ID
	 */
	private String applyId;
	
	/**
	 * 申请类型
	 */
	private Dic applyType;
	
	/**
	 * 申请时间
	 */
	private Date applyTime;
	
	/**
	 * 审批意见
	 */
	private String approveMessage;
	
	/**
	 * 审批结果
	 */
	private Dic approveResult;
	
	/**
	 * 审批人
	 */
	private User approveUser;
	
	/**
	 * 审批时间
	 */
	private Date approveTime;
	
	/**
	 * 下一节点办理人
	 */
	private User nextApprover;
	
	/**
	 * 流程审批状态
	 */
	private Dic approveStatus;
	
	/**
	 * 流程实例状态
	 */
	private Dic processStatus;

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public Dic getApplyType() {
		return applyType;
	}

	public void setApplyType(Dic applyType) {
		this.applyType = applyType;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getApproveMessage() {
		return approveMessage;
	}

	public void setApproveMessage(String approveMessage) {
		this.approveMessage = approveMessage;
	}

	public Dic getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(Dic approveResult) {
		this.approveResult = approveResult;
	}

	public User getApproveUser() {
		return approveUser;
	}

	public void setApproveUser(User approveUser) {
		this.approveUser = approveUser;
	}

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public User getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(User nextApprover) {
		this.nextApprover = nextApprover;
	}

	public Dic getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Dic approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Dic getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Dic processStatus) {
		this.processStatus = processStatus;
	}
	
	

}
