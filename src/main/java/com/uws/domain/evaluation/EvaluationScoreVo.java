package com.uws.domain.evaluation;

import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/****
 * 视图对象,用于奖惩模块的数据获取
 * @author Jiangbl
 * @date 2015-9-16
 */

public class EvaluationScoreVo {
	private String id;
	
	/**
	 * 学生 
	 */
	private StudentInfoModel student;	
	
	/**
	 * 学年
	 */
	private Dic year;
	
	/**
	 * 德育总分
	 */
	private String moralScoreSum;
	
	/**
	 * 智育总分
	 */
	private String intellectScoreSum;
	
	/**
	 * 文体总分
	 */
	private String cultrueScoreSum;
	
	/**
	 * 能力总分
	 */
	private String capacityScoreSum;
	
	/**
	 * 总分
	 */
	private String scoreSum;

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}

	public Dic getYear() {
		return year;
	}

	public void setYear(Dic year) {
		this.year = year;
	}

	public String getMoralScoreSum() {
		return moralScoreSum;
	}

	public void setMoralScoreSum(String moralScoreSum) {
		this.moralScoreSum = moralScoreSum;
	}

	public String getIntellectScoreSum() {
		return intellectScoreSum;
	}

	public void setIntellectScoreSum(String intellectScoreSum) {
		this.intellectScoreSum = intellectScoreSum;
	}

	public String getCultrueScoreSum() {
		return cultrueScoreSum;
	}

	public void setCultrueScoreSum(String cultrueScoreSum) {
		this.cultrueScoreSum = cultrueScoreSum;
	}

	public String getCapacityScoreSum() {
		return capacityScoreSum;
	}

	public void setCapacityScoreSum(String capacityScoreSum) {
		this.capacityScoreSum = capacityScoreSum;
	}

	public String getScoreSum() {
		return scoreSum;
	}

	public void setScoreSum(String scoreSum) {
		this.scoreSum = scoreSum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
