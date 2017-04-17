package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;
import com.uws.user.model.User;

/**
 * @Title TemporaryWorkStudyModel.java
 * @Package com.uws.domain.sponsor
 * @Description  临时工勤工助学实体
 * @author lizj
 * @date 2015-7-31  上午11:22:14
 */
public class TemporaryWorkStudyModel extends BaseModel {
	private static final long serialVersionUID = 1985678980339474847L;
	/**
	 * 学生（全校学生）
	 */
	private StudentInfoModel studentId;
	/**
	 * 用工部门
	 */
	private Org orgId;
	/**
	 * 用工部门名称
	 */
	private String orgName;
	/**
	 * 工作月份
	 */
	private String workMonth;
	/**
	 * 工时
	 */
	private float workHour;
	/**
	 * 工时薪资
	 */
	private double workSalary;
	/**
	 * 总薪资
	 */
	private double totalSalary;
	/**
	 * 开户行
	 */
	private String bank;
	/**
	 * 卡号
	 */
	private String cardNum;
	/**
	 * 工作表现
	 */
	private String workPerformance;
	/**
	 * 学年
	 */
	private Dic schoolYear;
	/**
	 * 学期
	 */
	private Dic schoolTerm;
	/**
	 * 状态
	 */
	private Dic status;
	/**
	 * 操作人（教师）
	 */
	private User operator;
	
	///////Excel 读取使用
	/**
	 * excel行号stuName
	 */
	private String sortId;
	/**
	 * 学号
	 */
	private String stuNo;
	/**
	 * 姓名className
	 */
	private String stuName;
	/**
	 * 班级
	 */
	private String className;
	/**
	 * 学院
	 */
	private String collegeName;
	
	public StudentInfoModel getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}
	public Org getOrgId() {
		return orgId;
	}
	public void setOrgId(Org orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getWorkMonth() {
		return workMonth;
	}
	public void setWorkMonth(String workMonth) {
		this.workMonth = workMonth;
	}
	public float getWorkHour() {
		return workHour;
	}
	public void setWorkHour(float workHour) {
		this.workHour = workHour;
	}
	public double getWorkSalary() {
		return workSalary;
	}
	public void setWorkSalary(double workSalary) {
		this.workSalary = workSalary;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Dic getSchoolTerm() {
		return schoolTerm;
	}
	public void setSchoolTerm(Dic schoolTerm) {
		this.schoolTerm = schoolTerm;
	}
	public String getWorkPerformance() {
		return workPerformance;
	}
	public void setWorkPerformance(String workPerformance) {
		this.workPerformance = workPerformance;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public User getOperator() {
		return operator;
	}
	public void setOperator(User operator) {
		this.operator = operator;
	}
	///////
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	public String getSortId() {
		return sortId;
	}
	public void setSortId(String sortId) {
		this.sortId = sortId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	////重写equals方法，用于判断导入时是否存在相同的学号
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return false;
		}
		if(obj == null){
			return false;
		}
		TemporaryWorkStudyModel model = (TemporaryWorkStudyModel) obj;
		if(this.stuNo == null){
			if(model.stuNo != null){
				return false;
			}
		}else{
			if(!this.stuNo.equals(model.stuNo)){
				return false;
			}
		}
		return true;
	}
}
