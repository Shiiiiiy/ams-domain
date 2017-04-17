package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;
import com.uws.user.model.User;
/**
* 
* @Title: WorkOrgModel.java 
* @Package com.uws.domain.sponsor 
* @Description:用工部门实体对象
* @author zhangmx  
* @date 2015-7-31 上午9:41:53
*/
public class WorkOrgModel extends BaseModel{
	
	private static final long serialVersionUID = 6927698520287047236L;
	//主键ID
	private String workOrgId;	
	//学年
	private Dic schoolYear;
	//学期
	private Dic term;
	//用工部门
	private Org org;
	//用工部门名称
	private String orgName;
	//岗位数
	private Integer workJobNumber;
	//用工时间
	private Double workTime;
	//预算金额
	private Double budgetSalary;
	//申请理由
	private String applyReason;
	
	//状态（保存、提交）
	private Dic status;
	//删除状态
	private Dic delStatus;
	
	//下一节点办理人
	private User nextApprover;
	//流程审批状态
	private String approveStatus;
	//流程实例状态
	private String  processStatus;
	//审核理由
	private String approveReason;
	
	public String getWorkOrgId() {
		return workOrgId;
	}
	public void setWorkOrgId(String workOrgId) {
		this.workOrgId = workOrgId;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Dic getTerm() {
		return term;
	}
	public void setTerm(Dic term) {
		this.term = term;
	}
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public Integer getWorkJobNumber() {
		return workJobNumber;
	}
	public void setWorkJobNumber(Integer workJobNumber) {
		this.workJobNumber = workJobNumber;
	}
	public Double getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Double workTime) {
		this.workTime = workTime;
	}
	public Double getBudgetSalary() {
		return budgetSalary;
	}
	public void setBudgetSalary(Double budgetSalary) {
		this.budgetSalary = budgetSalary;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public String getApplyReason() {
		return applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
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
	public String getApproveReason() {
		return approveReason;
	}
	public void setApproveReason(String approveReason) {
		this.approveReason = approveReason;
	}

	
	

}
