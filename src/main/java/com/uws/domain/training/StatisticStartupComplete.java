package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

public class StatisticStartupComplete extends BaseModel {

	private static final long serialVersionUID = -6687283953457002610L;
	
	private Dic schoolYear;
	
	private String className;
	
	private String classTheme;
	
	private Dic classType;
	
	private Dic classStatus;
	
	private String teacherName;
	
	private Dic completeStatus;
	
	private Integer completeNum;
	
	private Integer uncompleteNum;
	
	private Integer sumNum;

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassTheme() {
		return classTheme;
	}

	public void setClassTheme(String classTheme) {
		this.classTheme = classTheme;
	}

	public Dic getClassType() {
		return classType;
	}

	public void setClassType(Dic classType) {
		this.classType = classType;
	}

	public Dic getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(Dic classStatus) {
		this.classStatus = classStatus;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Dic getCompleteStatus() {
		return completeStatus;
	}

	public void setCompleteStatus(Dic completeStatus) {
		this.completeStatus = completeStatus;
	}

	public Integer getCompleteNum() {
		return completeNum;
	}

	public void setCompleteNum(Integer completeNum) {
		this.completeNum = completeNum;
	}

	public Integer getUncompleteNum() {
		return uncompleteNum;
	}

	public void setUncompleteNum(Integer uncompleteNum) {
		this.uncompleteNum = uncompleteNum;
	}

	public Integer getSumNum() {
		return sumNum;
	}

	public void setSumNum(Integer sumNum) {
		this.sumNum = sumNum;
	}
	
}
