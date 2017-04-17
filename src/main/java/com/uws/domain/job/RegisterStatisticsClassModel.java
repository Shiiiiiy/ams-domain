package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;

public class RegisterStatisticsClassModel extends BaseModel {

	private static final long serialVersionUID = 2817676144597019031L;
	
	/**
	 *就业学年 
	 */
	private Dic employmentYear;
	
	/**
	 * 封装  改变
	 */
	private String range;
	
	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	
	/**
	 * 专业
	 */
	private BaseMajorModel major;
	
	/**
	 * 班级
	 */
	private BaseClassModel classId;
	
	
	/**
	 * 报到证总人数
	 */
	private int total;
	
	/**
	 * 报到证补办审核中的人数
	 */
	private int submit;
	
	/**
	 * 报到证补办审核通过的人数
	 */
	private int pass;
	
	/**
	 * 报到证补办拒绝的人数
	 */
	private int refuse;
	
	/**
	 * 报到证补办率
	 */
	private double percentage;
	
	public Dic getEmploymentYear() {
		return employmentYear;
	}

	public void setEmploymentYear(Dic employmentYear) {
		this.employmentYear = employmentYear;
	}

	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public BaseMajorModel getMajor() {
		return major;
	}

	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}

	public BaseClassModel getClassId() {
		return classId;
	}

	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getRefuse() {
		return refuse;
	}

	public void setRefuse(int refuse) {
		this.refuse = refuse;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getSubmit() {
		return submit;
	}

	public void setSubmit(int submit) {
		this.submit = submit;
	}
}
