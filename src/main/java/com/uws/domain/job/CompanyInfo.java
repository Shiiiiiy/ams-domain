package com.uws.domain.job;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;
import com.uws.user.model.User;

/**
 * @className CompanyInfo.java
 * @package com.uws.domain.job
 * @description
 * @date 2015-10-21  下午2:32:18
 */
public class CompanyInfo extends BaseModel {
	private static final long serialVersionUID = 788332701127154884L;
	private Org college;//所属学院
	private String companyName;//企业名称
	private Dic companyProerty;//企业性质
	private String address;//企业详细地址
	private String contactPerson;//联系人
	private String contactPhone;//联系人电话
	private String contactPost;//联系人职务
	private String phoneNum;//联系人手机号码
	private String needWork;//需求岗位
	private Dic isSchoolCompanyProtocol;//是否签订校企合作协议
	private Dic isBatchWork;//是否批量就业单位
	private Dic delState;//删除状态
	private User creator;//创建人
	private Date updateDate;//手动更新时间
	/////////
	private String collegeText;//导入所属学院数据
	private String updateDateText;
	public Org getCollege() {
		return college;
	}
	public void setCollege(Org college) {
		this.college = college;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Dic getCompanyProerty() {
		return companyProerty;
	}
	public void setCompanyProerty(Dic companyProerty) {
		this.companyProerty = companyProerty;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPost() {
		return contactPost;
	}
	public void setContactPost(String contactPost) {
		this.contactPost = contactPost;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getNeedWork() {
		return needWork;
	}
	public void setNeedWork(String needWork) {
		this.needWork = needWork;
	}
	public Dic getIsSchoolCompanyProtocol() {
		return isSchoolCompanyProtocol;
	}
	public void setIsSchoolCompanyProtocol(Dic isSchoolCompanyProtocol) {
		this.isSchoolCompanyProtocol = isSchoolCompanyProtocol;
	}
	public Dic getIsBatchWork() {
		return isBatchWork;
	}
	public void setIsBatchWork(Dic isBatchWork) {
		this.isBatchWork = isBatchWork;
	}
	public Dic getDelState() {
		return delState;
	}
	public void setDelState(Dic delState) {
		this.delState = delState;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/////////
	public String getCollegeText() {
		return collegeText;
	}
	public void setCollegeText(String collegeText) {
		this.collegeText = collegeText;
	}
	public String getUpdateDateText() {
		return updateDateText;
	}
	public void setUpdateDateText(String updateDateText) {
		this.updateDateText = updateDateText;
	}
}
