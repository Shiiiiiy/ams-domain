package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

public class AgreementModel extends BaseModel {
	private static final long serialVersionUID = 2817676144597019031L;
	
	private Dic employmentYear;
	
	private String stuName;
	private String stuNumber;
	private StudentInfoModel student;
	
	private BaseAcademyModel college;
	private BaseMajorModel major;
	private BaseClassModel classId;
	
	//人事主管部门名称
	private String humanDepartment;
	//已签订就业协议单位
	private String employmentDepartment;
	//申请补办理由
	private String applyReason;

	private String agreementCode;
	private String newAgreementCode;

	private Dic status;

	public String getAgreementCode() {
		return agreementCode;
	}

	public String getApplyReason() {
		return applyReason;
	}
	public BaseClassModel getClassId() {
		return classId;
	}
	
	public BaseAcademyModel getCollege() {
		return college;
	}
	
	public String getEmploymentDepartment() {
		return employmentDepartment;
	}

	public Dic getEmploymentYear() {
		return employmentYear;
	}

	public String getHumanDepartment() {
		return humanDepartment;
	}

	public BaseMajorModel getMajor() {
		return major;
	}
	public String getNewAgreementCode() {
		return newAgreementCode;
	}
	
	public Dic getStatus() {
		return status;
	}
	public StudentInfoModel getStudent() {
		return student;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public String getStuNumber() {
		return stuNumber;
	}

	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}
	
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}
	
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public void setEmploymentDepartment(String employmentDepartment) {
		this.employmentDepartment = employmentDepartment;
	}
	
	public void setEmploymentYear(Dic employmentYear) {
		this.employmentYear = employmentYear;
	}

	public void setHumanDepartment(String humanDepartment) {
		this.humanDepartment = humanDepartment;
	}
	
	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}
	
	public void setNewAgreementCode(String newAgreementCode) {
		this.newAgreementCode = newAgreementCode;
	}
	
	public void setStatus(Dic status) {
		this.status = status;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	
}
