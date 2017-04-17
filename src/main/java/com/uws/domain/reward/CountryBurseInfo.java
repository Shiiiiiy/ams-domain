package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/** 
* @ClassName: CountryBurseInfo 
* @Description: TODO 国家奖助实体
* @author zhangyb 
* @date 2015年8月27日 上午10:56:03  
*/
public class CountryBurseInfo extends BaseModel {

	private static final long serialVersionUID = -7683235619328609834L;
	
	/**
	 * 学生对象
	 */
	private StudentInfoModel stuId;
	
	/**
	 * 学号
	 */
	private String stuNum;
	
	/**
	 * 学生姓名
	 */
	private String stuName;
	
	/**
	 * 学年
	 */
	private Dic schoolYear;
	
	private String schoolYearStr;
	
	/**
	 * 奖学金金额
	 */
	private double amount;
	
	/**
	 * 奖学金名称
	 */
	private Dic burseName;
	private String burseNameStr;
	
	/**
	 * 资助档次
	 */
	private Dic helpGrade;
	private String helpGradeStr;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	private String comments;

	public StudentInfoModel getStuId() {
		return stuId;
	}

	public void setStuId(StudentInfoModel stuId) {
		this.stuId = stuId;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getSchoolYearStr() {
		return schoolYearStr;
	}

	public void setSchoolYearStr(String schoolYearStr) {
		this.schoolYearStr = schoolYearStr;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Dic getBurseName() {
		return burseName;
	}

	public void setBurseName(Dic burseName) {
		this.burseName = burseName;
	}

	public String getBurseNameStr() {
		return burseNameStr;
	}

	public void setBurseNameStr(String burseNameStr) {
		this.burseNameStr = burseNameStr;
	}

	public Dic getHelpGrade() {
		return helpGrade;
	}

	public void setHelpGrade(Dic helpGrade) {
		this.helpGrade = helpGrade;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getHelpGradeStr() {
		return helpGradeStr;
	}

	public void setHelpGradeStr(String helpGradeStr) {
		this.helpGradeStr = helpGradeStr;
	}

	
}
