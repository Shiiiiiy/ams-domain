package com.uws.domain.integrate;
import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;

/**
 * 
 * @ClassName: StudentArmyInfoModel 
 * @Description: (学生参军信息实体类) 
 * @author wangjr
 * @date 2015-8-19 上午10:21:55 
 *
 */
public class StudentArmyInfoModel extends BaseModel {
 
	private static final long serialVersionUID = 1L;
	/**
	 * 实体类id
	 */
	private String id;
	/**
	 * 实体类学生
	 */
	private StudentInfoModel student;
	/**
	 * 实体类身份证号
	 */
	private String certificateCode;
	/**
	 * 实体类学生类别
	 */
	private String stuCategory;
	/**
	 * 实体类最后学历
	 */
	private String degrees;
	/**
	 * 实体类入学时间
	 */
	private String entranceDate;
	/**
	 * 实体类毕业时间
	 */
	private String graduationDate;
	/**
	 * 实体类参军时间
	 */
	private String armyDate;
	/**
	 * 实体类应缴学费
	 */
	private float tuitionFees;
	/**
	 * 实体类实缴学费
	 */
	private float paidFees;
	/**
	 * 实体类贷款金额
	 */
	private float loanAmount;
	/**
	 * 实体类学费补偿金额
	 */
	private float compensationAmount;
	/**
	 * 实体类贷款代偿金额小计
	 */
	private float loanCount;
	/**
	 * 实体类贷款代偿金额本金
	 */
	private float loanPrincipal;
	/**
	 * 实体类退役复学学费资助
	 */
	private float supportFees;
	/**
	 * 实体类备注
	 */
	private String remark;
	
	// 开始结束时间 用于查询
	private Date beginDate;
	private Date endDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StudentInfoModel getStudent() {
		return student;
	}
	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}
	public String getCertificateCode() {
		return certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}
	public String getStuCategory() {
		return stuCategory;
	}
	public void setStuCategory(String stuCategory) {
		this.stuCategory = stuCategory;
	}
	public String getEntranceDate() {
		return entranceDate;
	}
	public void setEntranceDate(String entranceDate) {
		this.entranceDate = entranceDate;
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getArmyDate() {
		return armyDate;
	}
	public void setArmyDate(String armyDate) {
		this.armyDate = armyDate;
	}
	public float getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(float tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	public float getPaidFees() {
		return paidFees;
	}
	public void setPaidFees(float paidFees) {
		this.paidFees = paidFees;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getCompensationAmount() {
		return compensationAmount;
	}
	public void setCompensationAmount(float compensationAmount) {
		this.compensationAmount = compensationAmount;
	}
	public float getLoanCount() {
		return loanCount;
	}
	public void setLoanCount(float loanCount) {
		this.loanCount = loanCount;
	}
	public float getLoanPrincipal() {
		return loanPrincipal;
	}
	public void setLoanPrincipal(float loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}
	public float getSupportFees() {
		return supportFees;
	}
	public void setSupportFees(float supportFees) {
		this.supportFees = supportFees;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDegrees() {
		return degrees;
	}
	public void setDegrees(String degrees) {
		this.degrees = degrees;
	}
	public Date getBeginDate()
    {
    	return beginDate;
    }
	public void setBeginDate(Date beginDate)
    {
    	this.beginDate = beginDate;
    }
	public Date getEndDate()
    {
    	return endDate;
    }
	public void setEndDate(Date endDate)
    {
    	this.endDate = endDate;
    }
}