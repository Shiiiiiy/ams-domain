package com.uws.domain.sponsor;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 困难生奖助实体信息 StudentAward
 * @author liuchen
 *
 */
public class DifficultStudentAward extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6390687716346869367L;
	//困难生信息对象
	private DifficultStudentInfo difficultStudentInfo;
	//学年
	private Dic schoolYear;
	//家庭经济情况
	private Dic familyFinance;
	//家庭情况（成员，工作情况等）
	private String familyCondition;
	//奖助类型
    private Dic awardType;
    //申请理由
    private String applyReason;
    //申请时间
    private Date applyTime;
    //状态
    private Dic status;
    //删除状态
  	private Dic delStatus;
  	//下一节点办理人
  	private User nextApprover;
  	//流程审批状态
  	private String approveStatus;
  	//流程实例状态
  	private String  processStatus;
  	//审核意见
  	private String approveReason;
  	
  	
  	
  	
	
	public DifficultStudentInfo getDifficultStudentInfo()
    {
    	return difficultStudentInfo;
    }
	public void setDifficultStudentInfo(DifficultStudentInfo difficultStudentInfo)
    {
    	this.difficultStudentInfo = difficultStudentInfo;
    }
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Dic getFamilyFinance() {
		return familyFinance;
	}
	public void setFamilyFinance(Dic familyFinance) {
		this.familyFinance = familyFinance;
	}
	public String getFamilyCondition() {
		return familyCondition;
	}
	public void setFamilyCondition(String familyCondition) {
		this.familyCondition = familyCondition;
	}
	public Dic getAwardType() {
		return awardType;
	}
	public void setAwardType(Dic awardType) {
		this.awardType = awardType;
	}
	public String getApplyReason() {
		return applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
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
	public String getApproveReason()
    {
    	return approveReason;
    }
	public void setApproveReason(String approveReason)
    {
    	this.approveReason = approveReason;
    }
  	
  	
  	
  	
}
