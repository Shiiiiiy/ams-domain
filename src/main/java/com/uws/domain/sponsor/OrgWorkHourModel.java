package com.uws.domain.sponsor;

import java.util.HashSet;
import java.util.Set;
import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;
import com.uws.user.model.User;

/**
 * @className OrgWorkHourModel.java
 * @package com.uws.domain.sponsor
 * @description 用工工时部门信息
 * @author 
 * @date 2015-8-14  上午11:54:47
 */
public class OrgWorkHourModel extends BaseModel {
	private static final long serialVersionUID = 1L;
	private Org orgId;
	private String workYear;
	private String workMonth;
	private Dic status;
	private Dic submitStatus;
	private User nextApprover;
	private String approverStatus;
	private String processStatus;
	private Set<WorkHourModel> workHourModels = new HashSet<WorkHourModel>();
	private Dic schoolYear;
	private Dic schoolTerm;
	/////
	private String yearAndMonth;
	private String approve;
	public Org getOrgId() {
		return orgId;
	}
	public void setOrgId(Org orgId) {
		this.orgId = orgId;
	}
	public String getWorkYear() {
		return workYear;
	}
	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}
	public String getWorkMonth() {
		return workMonth;
	}
	public void setWorkMonth(String workMonth) {
		this.workMonth = workMonth;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public Dic getSubmitStatus() {
		return submitStatus;
	}
	public void setSubmitStatus(Dic submitStatus) {
		this.submitStatus = submitStatus;
	}
	public User getNextApprover() {
		return nextApprover;
	}
	public void setNextApprover(User nextApprover) {
		this.nextApprover = nextApprover;
	}
	public String getApproverStatus() {
		return approverStatus;
	}
	public void setApproverStatus(String approverStatus) {
		this.approverStatus = approverStatus;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public Set<WorkHourModel> getWorkHourModels() {
		return workHourModels;
	}
	public void setWorkHourModels(Set<WorkHourModel> workHourModels) {
		this.workHourModels = workHourModels;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Dic getSchoolTerm() {
		return schoolTerm;
	}
	public void setSchoolTerm(Dic schoolTerm) {
		this.schoolTerm = schoolTerm;
	}
	/////
	public String getYearAndMonth() {
		return yearAndMonth;
	}
	public void setYearAndMonth(String yearAndMonth) {
		this.yearAndMonth = yearAndMonth;
	}
	public String getApprove() {
		return approve;
	}
	public void setApprove(String approve) {
		this.approve = approve;
	}
}
