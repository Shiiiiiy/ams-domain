package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
* 
* @Title: WorkApplyFileModel.java 
* @Package com.uws.domain.sponsor 
* @Description: 岗位申请单实体对象
* @author zhangmx  
* @date 2015-8-10 上午9:41:53
*/
public class WorkApplyFileModel extends BaseModel {

	
	private static final long serialVersionUID = 965660916688491279L;
	//主键ID
	private String workApplyFileId;
	//联系电话
	private String phone;
	//联系QQ
	private String attachQQ;
	//联系邮箱
	private String attachEmail;
	//特长
	private String forte;
	//工作经历
	private String workExperience;
	//家庭成员
	private String familyCondition;
	//学年
	private Dic schoolYear;
	//学期
	private Dic term;
	//申请说明
	private String applyDesc;
	//删除状态
	private Dic delStatus;

	
	public String getWorkApplyFileId() {
		return workApplyFileId;
	}
	public void setWorkApplyFileId(String workApplyFileId) {
		this.workApplyFileId = workApplyFileId;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAttachQQ() {
		return attachQQ;
	}
	public void setAttachQQ(String attachQQ) {
		this.attachQQ = attachQQ;
	}
	public String getAttachEmail() {
		return attachEmail;
	}
	public void setAttachEmail(String attachEmail) {
		this.attachEmail = attachEmail;
	}
	public String getForte() {
		return forte;
	}
	public void setForte(String forte) {
		this.forte = forte;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	public String getFamilyCondition() {
		return familyCondition;
	}
	public void setFamilyCondition(String familyCondition) {
		this.familyCondition = familyCondition;
	}
	public String getApplyDesc() {
		return applyDesc;
	}
	public void setApplyDesc(String applyDesc) {
		this.applyDesc = applyDesc;
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
	
	public Dic getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(Dic delStatus) {
		this.delStatus = delStatus;
	}
	
	
}
