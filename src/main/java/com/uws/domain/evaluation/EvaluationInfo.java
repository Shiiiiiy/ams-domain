package com.uws.domain.evaluation;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @description 测评
 * @author Jiangbl
 * @date 2015-8-21
 */
public class EvaluationInfo extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1981474619928630809L;

	/**
	 * 学生 
	 */
	private StudentInfoModel student;	
	
	/**
	 * 学年
	 */
	private Dic year;
	private String yearId;
	
	/**
	 * 学期
	 */
	private Dic term;
	private String termId;
	
	/**
	 * 测评月份
	 */
	private Dic month;
	
	/**
	 * 测评人
	 */
	private User assist;
	
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
	
	/**
	 * 状态
	 */
	private Dic status;
	
	/**
	 * 用于查询  学院id 
	 */
	private String collageId;	
	
	/**
	 * 用于查询 专业id
	 */
	private String majorId;		
	
	/**
	 * 用于查询 班级id
	 */
	private String eClassId;	
	
	/**
	 * 用于查询 
	 */
	private String userName;
	
	/**
	 * 用于查询 测评id
	 */
	private String monthId;
	
	
	/***
	 * 以前几个属性都是用于测评导入
	 */
	private String studentNo;//学号
	private String studentName;//姓名
	private String typeId;//类型
	private String reason;//事由
	
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

	public Dic getTerm() {
		return term;
	}

	public void setTerm(Dic term) {
		this.term = term;
	}

	public Dic getMonth() {
		return month;
	}

	public void setMonth(Dic month) {
		this.month = month;
	}

	public User getAssist() {
		return assist;
	}

	public void setAssist(User assist) {
		this.assist = assist;
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

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

	public String getCollageId() {
		return collageId;
	}

	public void setCollageId(String collageId) {
		this.collageId = collageId;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String geteClassId() {
		return eClassId;
	}

	public void seteClassId(String eClassId) {
		this.eClassId = eClassId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
