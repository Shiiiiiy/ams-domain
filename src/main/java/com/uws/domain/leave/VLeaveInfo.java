package com.uws.domain.leave;

import com.uws.domain.orientation.StudentInfoModel;

public class VLeaveInfo{
	
	private String id;
	
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	
	/**
	 * 宿管
	 */
	private LeaveDorm dorm;
	
	/**
	 * 水电
	 */
	private LifeInfo life;
	
	/**
	 * 党团关系
	 */
	private CaucusHandle caucus;
	
	/**
	 * 二级学院
	 */
	private CollegeHandle college;
	
	/**
	 * 办理年份
	 */
	private String yearId;
	
	/***
	 * 状态
	 */
	private String status;
	
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

	public LeaveDorm getDorm() {
		return dorm;
	}

	public void setDorm(LeaveDorm dorm) {
		this.dorm = dorm;
	}

	public LifeInfo getLife() {
		return life;
	}

	public void setLife(LifeInfo life) {
		this.life = life;
	}

	public CaucusHandle getCaucus() {
		return caucus;
	}

	public void setCaucus(CaucusHandle caucus) {
		this.caucus = caucus;
	}

	public CollegeHandle getCollege() {
		return college;
	}

	public void setCollege(CollegeHandle college) {
		this.college = college;
	}

	public String getYearId() {
		return yearId;
	}

	public void setYearId(String yearId) {
		this.yearId = yearId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
