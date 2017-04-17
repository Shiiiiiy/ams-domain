package com.uws.domain.sponsor;


import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @Title: NationalLoan.java
 * @Package com.uws.domain.sponsor
 * @Description: 国家助学贷款实体对象
 * @author xuzh
 * @date 2015-7-30 上午10:41:53
 */
public class NationalLoanModel extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4187336377253010925L;
	// 学生对象
	private StudentInfoModel studentInfo;
	// 借款金额
	private Double loanAmount;
	// 借款学年
	private Dic loanYear;
	// 学费金额
	private Double studyFee;
	// 生活费金额
	private Double livingFee;
	// 贷款期限
	private String loanNumYear;
	// 银行卡类型
	private Dic cardType;
	// 银行账号
	private String cardNum;
	// 申请日期
	private Date applyDate;
	// 状态
	private Dic status;
	
	public StudentInfoModel getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfoModel studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Dic getLoanYear() {
		return loanYear;
	}

	public void setLoanYear(Dic loanYear) {
		this.loanYear = loanYear;
	}

	public Double getStudyFee() {
		return studyFee;
	}

	public void setStudyFee(Double studyFee) {
		this.studyFee = studyFee;
	}

	public Double getLivingFee() {
		return livingFee;
	}

	public void setLivingFee(Double livingFee) {
		this.livingFee = livingFee;
	}

	public String getLoanNumYear() {
		return loanNumYear;
	}

	public void setLoanNumYear(String loanNumYear) {
		this.loanNumYear = loanNumYear;
	}

	public Dic getCardType() {
		return cardType;
	}

	public void setCardType(Dic cardType) {
		this.cardType = cardType;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

}
