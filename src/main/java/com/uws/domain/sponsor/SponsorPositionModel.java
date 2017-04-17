package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
* 
* @Title: SponsorPositionModel.java 
* @Package com.uws.domain.sponsor 
* @Description: 岗位实体对象
* @author zhangmx  
* @date 2015-8-17 上午9:41:53
*/
public class SponsorPositionModel extends BaseModel {

	private static final long serialVersionUID = -4705754304235101725L;
	//主键ID
	private String positionId;	
	//岗位名称
	private String workName;
	//用工部门
	private WorkOrgModel workOrg;
	//岗位人数
	private Integer workNumber;
	//工作描述
	private String workDesc;
	//岗位薪资
	private Double workSalary;
	//删除状态
	private Dic delStatus;
	
	
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public WorkOrgModel getWorkOrg() {
		return workOrg;
	}
	public void setWorkOrg(WorkOrgModel workOrg) {
		this.workOrg = workOrg;
	}
	public Integer getWorkNumber() {
		return workNumber;
	}
	public void setWorkNumber(Integer workNumber) {
		this.workNumber = workNumber;
	}
	public String getWorkDesc() {
		return workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}
	public Double getWorkSalary() {
		return workSalary;
	}
	public void setWorkSalary(Double workSalary) {
		this.workSalary = workSalary;
	}
	
	public Dic getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(Dic delStatus) {
		this.delStatus = delStatus;
	}
	
	
}
