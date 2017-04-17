package com.uws.domain.common;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/***
 * 学生学期平均分
 * @author Jiangbl
 * 
 */
public class StudentTermScore extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664129835451422640L;

	/**
	 * 学年
	 */
	private Dic year;
	
	/**
	 * 学期
	 */
	private Dic term;
	
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	
	/**
	 * 总分
	 */
	private String totalScore;
	
	/**
	 * 总科目数
	 */
	private String totalSubjects;
	
	/**
	 * 平均分
	 */
	private String aveScore;

	public Dic getYear() {
		return year;
	}

	public void setYear(Dic year) {
		this.year = year;
	}

	public Dic getTerm() {
		return term;
	}

	public void setTerm(Dic term) {
		this.term = term;
	}

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public String getTotalSubjects() {
		return totalSubjects;
	}

	public void setTotalSubjects(String totalSubjects) {
		this.totalSubjects = totalSubjects;
	}

	public String getAveScore() {
		return aveScore;
	}

	public void setAveScore(String aveScore) {
		this.aveScore = aveScore;
	}
}
