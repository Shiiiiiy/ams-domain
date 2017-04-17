
package com.uws.domain.sponsor;


import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 
* @ClassName: OriginLoanModel 
* @Description: (生源地助学贷款实体类) 
* @author xuzh
* @date 2015-8-11 上午11:33:18 
*
 */
 
public class OriginLoanModel extends BaseModel {

	/**
	 * @Fields serialVersionUID : 序列化
	 */ 
	private static final long serialVersionUID = 1L;
	// 学生对象
	private StudentInfoModel studentInfo;
	private String stuNumber;
	private String stuName;
	
	//贷款学年
	private Dic loanYear; 
	//贷款银行
	private String loanBank;
	// 贷款次数
	private int countLoan;
	// 合同金额
	private float contractAmount;
	//入学年份
	private String enterYear;
	// 欠缴费用总额
	private float paymentAmount;
	//毕业日期
	private Date graduationDate;
	//状态
	private Dic status;
		
	public StudentInfoModel getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(StudentInfoModel studentInfo) {
		this.studentInfo = studentInfo;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Dic getLoanYear() {
		return loanYear;
	}
	public void setLoanYear(Dic loanYear) {
		this.loanYear = loanYear;
	}
	public String getLoanBank() {
		return loanBank;
	}
	public void setLoanBank(String loanBank) {
		this.loanBank = loanBank;
	}
	public int getCountLoan() {
		return countLoan;
	}
	public void setCountLoan(int countLoan) {
		this.countLoan = countLoan;
	}
	public float getContractAmount() {
		return contractAmount;
	}
	public void setContractAmount(float contractAmount) {
		this.contractAmount = contractAmount;
	}
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getEnterYear() {
		return enterYear;
	}
	public void setEnterYear(String enterYear) {
		this.enterYear = enterYear;
	}
	public Date getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
}