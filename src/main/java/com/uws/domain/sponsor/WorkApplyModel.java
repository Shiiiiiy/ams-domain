package com.uws.domain.sponsor;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
* 
* @Title: WorkApplyModel.java 
* @Package com.uws.domain.sponsor 
* @Description: 岗位申请实体对象
* @author zhangmx  
* @date 2015-8-10 上午9:41:53
*/

public class WorkApplyModel extends BaseModel{

	private static final long serialVersionUID = -1329517441078209740L;
	//主键ID
	private String workApplyId;
	//勤工助学岗位
	private SponsorPositionModel sponsorPosition;
	//困难生对象
	private DifficultStudentInfo difficultStudentInfo;
	//岗位申请单对象
	private WorkApplyFileModel applyFile;
	
	//确认状态
	private Date confirmDate;
	//离岗时间
	private Date dismissDate;
	
	//状态
	private Dic status;
	//删除状态
	private Dic delStatus;
	//岗位状态
	private Dic postStatus;
	
	//下一节点办理人
	private User nextApprover;
	//流程审批状态
	private String approveStatus;
	//流程实例状态
	private String  processStatus;
	//审核意见
	private String approveReason;
	
	public String getWorkApplyId() {
		return workApplyId;
	}
	public void setWorkApplyId(String workApplyId) {
		this.workApplyId = workApplyId;
	}
	public SponsorPositionModel getSponsorPosition() {
		return sponsorPosition;
	}
	public void setSponsorPosition(SponsorPositionModel sponsorPosition) {
		this.sponsorPosition = sponsorPosition;
	}
	public DifficultStudentInfo getDifficultStudentInfo() {
		return difficultStudentInfo;
	}
	public void setDifficultStudentInfo(DifficultStudentInfo difficultStudentInfo) {
		this.difficultStudentInfo = difficultStudentInfo;
	}
	public WorkApplyFileModel getApplyFile() {
		return applyFile;
	}
	public void setApplyFile(WorkApplyFileModel applyFile) {
		this.applyFile = applyFile;
	}

	
	
	public Date getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public Dic getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(Dic delStatus) {
		this.delStatus = delStatus;
	}
	
	public Dic getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(Dic postStatus) {
		this.postStatus = postStatus;
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
	public String getApproveReason() {
		return approveReason;
	}
	public void setApproveReason(String approveReason) {
		this.approveReason = approveReason;
	}
	public Date getDismissDate() {
		return dismissDate;
	}
	public void setDismissDate(Date dismissDate) {
		this.dismissDate = dismissDate;
	}
	
	
	

}
