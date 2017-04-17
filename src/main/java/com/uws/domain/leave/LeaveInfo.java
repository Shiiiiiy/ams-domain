package com.uws.domain.leave;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

public class LeaveInfo extends BaseModel{
	
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	
	/**
	 * 办理年份
	 */
	private String year;
	
	/***
	 * 图书馆办理状态
	 */
	private Dic library; 
	
	/***
	 * 教务处办理状态
	 */
	private Dic edu;
	
	/***
	 * 宿舍办理状态
	 */
	private Dic dorm;
	
	/***
	 * 财务办理状态
	 */
	private Dic finance;
	
	/***
	 * 党团关系办理状态
	 */
	private Dic caucus;
	
	/***
	 * 二级学院办理状态
	 */
	private Dic college;

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Dic getLibrary() {
		return library;
	}

	public void setLibrary(Dic library) {
		this.library = library;
	}

	public Dic getEdu() {
		return edu;
	}

	public void setEdu(Dic edu) {
		this.edu = edu;
	}

	public Dic getDorm() {
		return dorm;
	}

	public void setDorm(Dic dorm) {
		this.dorm = dorm;
	}

	public Dic getFinance() {
		return finance;
	}

	public void setFinance(Dic finance) {
		this.finance = finance;
	}

	public Dic getCaucus() {
		return caucus;
	}

	public void setCaucus(Dic caucus) {
		this.caucus = caucus;
	}

	public Dic getCollege() {
		return college;
	}

	public void setCollege(Dic college) {
		this.college = college;
	}
}
