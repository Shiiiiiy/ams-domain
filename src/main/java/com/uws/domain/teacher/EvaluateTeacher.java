package com.uws.domain.teacher;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;

/**
 * @className EvaluateTeacher.java
 * @package com.uws.domain.teacher
 * @description
 * @author houyue
 * @date 2015-8-28 下午3:16:05
 */
public class EvaluateTeacher extends BaseModel {
	private static final long serialVersionUID = 747504099338495165L;
	/**
	 * BaseTeacher实体
	 */
	private BaseTeacherModel teacher;
	/**
	 * BaseAcademy实体
	 */
	private BaseAcademyModel college;
	/**
	 * 学年
	 */
	private Dic schoolYear;
	/**
	 * 学期
	 */
	private Dic schoolTerm;
	/**
	 * 工作时间
	 */
	private String workTime;
	/**
	 * 现任职位
	 */
	private String presentJob;
	/**
	 * 工作总结
	 */
	private String yearWorkSummary;
	/**
	 * 所获荣誉
	 */
	private String honour;
	/**
	 * 审核状态
	 */
	private Dic status;
	/**
	 * 二级学院审核得分
	 */
	private Double collegeAuditScroe;
	/**
	 * 二级学院审核评定等级
	 */
	private Dic collegeAuditLevel;
	/**
	 * 二级学院审核意见
	 */
	private String collegeAuditOpinion;
	/**
	 * 二级学院审核人
	 */
	private String collegeAuditAuditor;
	/**
	 * 二级学院审核状态
	 */
	private String collegeAuditStatus;
	/**
	 * 学生处审核得分
	 */
	private Double stuAffairsAuditScore;
	/**
	 * 学生处审核评定等级
	 */
	private Dic stuAffairsAuditLevel;
	/**
	 * 学生处审核意见
	 */
	private String stuAffairsAuditOpinion;
	/**
	 * 学生处审核人
	 */
	private String stuAffairsAuditor;
	/**
	 * 学生处审核状态
	 */
	private String stuAffairsAuditStatus;

	/**
	 * 教师基础表的get方法
	 * 
	 * @return BaseTeacherModel
	 */
	public BaseTeacherModel getTeacher() {
		return teacher;
	}

	/**
	 * 教师基础表的set方法
	 * 
	 * @param teacher
	 */
	public void setTeacher(BaseTeacherModel teacher) {
		this.teacher = teacher;
	}

	/**
	 * 学院表id的set方法
	 * @return
	 */
	public BaseAcademyModel getCollege() {
		return college;
	}

	/**
	 * 学院表id的set方法
	 * @param college
	 */
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	/**
	 * 学年的get方法
	 * 
	 * @return Dic
	 */
	public Dic getSchoolYear() {
		return schoolYear;
	}

	/**
	 * 学年的set方法
	 * 
	 * @param schoolYear
	 */
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	/**
	 * 学期的get方法
	 * 
	 * @return Dic
	 */
	public Dic getSchoolTerm() {
		return schoolTerm;
	}

	/**
	 * 学期的set方法
	 * 
	 * @param schoolTerm
	 */
	public void setSchoolTerm(Dic schoolTerm) {
		this.schoolTerm = schoolTerm;
	}

	/**
	 * 工作时间的get方法
	 * 
	 * @return String
	 */
	public String getWorkTime() {
		return workTime;
	}

	/**
	 * 工作时间的set方法
	 * 
	 * @param workTime
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	/**
	 * 现任职位的get方法
	 * @return String
	 */
	public String getPresentJob() {
		return presentJob;
	}

	/**
	 * 现任职位的set方法
	 * @param presentJob
	 */
	public void setPresentJob(String presentJob) {
		this.presentJob = presentJob;
	}

	/**
	 * 学年工作总结的get方法
	 * 
	 * @return String
	 */
	public String getYearWorkSummary() {
		return yearWorkSummary;
	}

	/**
	 * 学年工作总结的set方法
	 * 
	 * @param yearWorkSummary
	 */
	public void setYearWorkSummary(String yearWorkSummary) {
		this.yearWorkSummary = yearWorkSummary;
	}

	/**
	 * 所获荣誉的get方法
	 * 
	 * @return String
	 */
	public String getHonour() {
		return honour;
	}

	/**
	 * 所获荣誉的set方法
	 * 
	 * @param honour
	 */
	public void setHonour(String honour) {
		this.honour = honour;
	}
	/**
	 * 二级学院审核得分的get方法
	 * 
	 * @return
	 */
	public Double getCollegeAuditScroe() {
		return collegeAuditScroe;
	}
	/**
	 * 状态的get方法
	 * 
	 * @return Dic
	 */
	public Dic getStatus() {
		return status;
	}
	/**
	 * 状态的set方法
	 * 
	 * @param status
	 */
	public void setStatus(Dic status) {
		this.status = status;
	}
	/**
	 * 二级学院审核得分的set方法
	 * 
	 * @param collegeAuditScroe
	 */
	public void setCollegeAuditScroe(Double collegeAuditScroe) {
		this.collegeAuditScroe = collegeAuditScroe;
	}

	/**
	 * 二级学院审核评定等级的get方法
	 * 
	 * @return
	 */
	public Dic getCollegeAuditLevel() {
		return collegeAuditLevel;
	}

	/**
	 * 二级学院审核评定等级的set方法
	 * 
	 * @param collegeAuditLevel
	 */
	public void setCollegeAuditLevel(Dic collegeAuditLevel) {
		this.collegeAuditLevel = collegeAuditLevel;
	}

	/**
	 * 二级学院审核意见的get方法
	 * 
	 * @return
	 */
	public String getCollegeAuditOpinion() {
		return collegeAuditOpinion;
	}

	/**
	 * 二级学院审核意见的set方法
	 * 
	 * @param collegeAuditOpinion
	 */
	public void setCollegeAuditOpinion(String collegeAuditOpinion) {
		this.collegeAuditOpinion = collegeAuditOpinion;
	}

	/**
	 * 二级学院审核人的get方法
	 * 
	 * @return
	 */
	public String getCollegeAuditAuditor() {
		return collegeAuditAuditor;
	}

	/**
	 * 二级学院审核人的set方法
	 * 
	 * @param collegeAuditAuditor
	 */
	public void setCollegeAuditAuditor(String collegeAuditAuditor) {
		this.collegeAuditAuditor = collegeAuditAuditor;
	}

	/**
	 * 学生处审核得分的get方法
	 * 
	 * @return
	 */
	public Double getStuAffairsAuditScore() {
		return stuAffairsAuditScore;
	}

	/**
	 * 学生处审核得分的set方法
	 * 
	 * @param stuAffairsAuditScore
	 */
	public void setStuAffairsAuditScore(Double stuAffairsAuditScore) {
		this.stuAffairsAuditScore = stuAffairsAuditScore;
	}

	/**
	 * 学生处审核评定等级的get方法
	 * 
	 * @return
	 */
	public Dic getStuAffairsAuditLevel() {
		return stuAffairsAuditLevel;
	}

	/**
	 * 学生处审核评定等级的set方法
	 * 
	 * @param stuAffairsAuditLevel
	 */
	public void setStuAffairsAuditLevel(Dic stuAffairsAuditLevel) {
		this.stuAffairsAuditLevel = stuAffairsAuditLevel;
	}

	/**
	 * 学生处审核意见的get方法
	 * 
	 * @return
	 */
	public String getStuAffairsAuditOpinion() {
		return stuAffairsAuditOpinion;
	}

	/**
	 * 学生处审核意见的set方法
	 * 
	 * @param stuAffairsAuditOpinion
	 */
	public void setStuAffairsAuditOpinion(String stuAffairsAuditOpinion) {
		this.stuAffairsAuditOpinion = stuAffairsAuditOpinion;
	}

	/**
	 * 学生处审核人的get方法
	 * 
	 * @return
	 */
	public String getStuAffairsAuditor() {
		return stuAffairsAuditor;
	}

	/**
	 * 学生处审核人的set方法
	 * 
	 * @param stuAffairsAuditor
	 */
	public void setStuAffairsAuditor(String stuAffairsAuditor) {
		this.stuAffairsAuditor = stuAffairsAuditor;
	}

	/**
	 * 二级学院审核状态get方法
	 * @return String
	 */
	public String getCollegeAuditStatus() {
		return collegeAuditStatus;
	}

	/**
	 * 二级学院审核状态set方法
	 * @param collegeAuditStatus
	 */
	public void setCollegeAuditStatus(String collegeAuditStatus) {
		this.collegeAuditStatus = collegeAuditStatus;
	}

	/**
	 * 学生处审核状态get方法
	 * @return
	 */
	public String getStuAffairsAuditStatus() {
		return stuAffairsAuditStatus;
	}

	/**
	 * 学生处审核状态set方法
	 * @param stuAffairsAuditStatus
	 */
	public void setStuAffairsAuditStatus(String stuAffairsAuditStatus) {
		this.stuAffairsAuditStatus = stuAffairsAuditStatus;
	}

}
