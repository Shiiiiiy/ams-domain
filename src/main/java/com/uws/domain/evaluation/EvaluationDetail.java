package com.uws.domain.evaluation;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * @description 测评详细
 * @author Jiangbl
 * @date 2015-8-21
 */
public class EvaluationDetail extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 测评
	 */
	private EvaluationInfo evaluation;
	
	/**
	 * 加分事由
	 */
	private String reason;
	
	/**
	 * 分数
	 */
	private String score;
	
	/**
	 * 类型
	 */
	private Dic type;
	
	/**
	 * 序号
	 */
	private int seqNum;
	
	/***
	 * 以前几个属性都是用于测评导入
	 */
	private String college;
	private String major;
	private String classId;
	private String studentName;
	private String studentNo;
	private String yearId;
	private String termId;
	private String monthId;
	private String typeId;
	

	public EvaluationInfo getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationInfo evaluation) {
		this.evaluation = evaluation;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Dic getType() {
		return type;
	}

	public void setType(Dic type) {
		this.type = type;
	}

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getYearId() {
		return yearId;
	}

	public void setYearId(String yearId) {
		this.yearId = yearId;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getMonthId() {
		return monthId;
	}

	public void setMonthId(String monthId) {
		this.monthId = monthId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
