package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @className SchoolGoodStudent.java
 * @package com.uws.domain.job
 * @description
 * @date 2015-11-6  下午4:34:26
 */
public class SchoolGoodStudent extends BaseModel {
	private static final long serialVersionUID = 7123268963338369761L;
	private AgreementModel agreementModel;
	private StudentInfoModel studentId;//学生
	private Dic schoolYear;//学年
	private String post;//职务
	private String computerLevel;//计算机等级
	private int classNumber;//班级人数
	private String englishLevel;//外语水平
	private String approveStatus;//审核状态
	private String approveReason;//审核意见
	private int classSort;//班级排名
	private float avgScore;//入学以来总成绩平均分
	private Dic status;
	private Dic submitStatus;
	private User creator;
	private String performance;//在校期间表现
	private String honor;//曾获荣誉
	//////
	private String stuId;
	public AgreementModel getAgreementModel() {
		return agreementModel;
	}
	public void setAgreementModel(AgreementModel agreementModel) {
		this.agreementModel = agreementModel;
	}
	public StudentInfoModel getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getComputerLevel() {
		return computerLevel;
	}
	public void setComputerLevel(String computerLevel) {
		this.computerLevel = computerLevel;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getEnglishLevel() {
		return englishLevel;
	}
	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getApproveReason() {
		return approveReason;
	}
	public void setApproveReason(String approveReason) {
		this.approveReason = approveReason;
	}
	public int getClassSort() {
		return classSort;
	}
	public void setClassSort(int classSort) {
		this.classSort = classSort;
	}
	public float getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(float avgScore) {
		this.avgScore = avgScore;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public Dic getSubmitStatus() {
		return submitStatus;
	}
	public void setSubmitStatus(Dic submitStatus) {
		this.submitStatus = submitStatus;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getHonor() {
		return honor;
	}
	public void setHonor(String honor) {
		this.honor = honor;
	}
	public SchoolGoodStudent(String stuId,String approveStatus) {
		this.stuId = stuId;
		this.approveStatus = approveStatus;
	}
	public SchoolGoodStudent() { }
	//////
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
}
