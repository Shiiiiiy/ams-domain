package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;

public class RegisterStatisticsCollegeModel extends BaseModel {

	private static final long serialVersionUID = 2817676144597019031L;
	
	/**
	 *就业学年 
	 */
	private Dic employmentYear;
	
	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	
	/**
	 * 报到证总人数
	 */
	private int totalNumber;
	
	/**
	 * 未申请的人数
	 */
	private int normal;
	
	

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
	 * 总的人数
	 */
	private int total;

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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	
	public int getSubmit() {
		return submit;
	}

	public void setSubmit(int submit) {
		this.submit = submit;
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

	public void setNormal(int normal) {
		this.normal = normal;
	}
	
	public int getNormal() {
		return normal;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
