package com.uws.domain.league;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.domain.orientation.StudentInfoModel;

/**
 * 团支部视图实体类
 */
public class LeagueMemberServiceInfoModel extends BaseModel {

	private static final long serialVersionUID = -1288451358287012641L;

	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	
	/**
	 * 专业
	 */
	private BaseMajorModel major;
	
	/**
	 * 班级
	 */
	private BaseClassModel classId;
	
	/**
	 * 班主任
	 */
	private BaseTeacherModel headmaster;
	
	/**
	 * 团支书对象
	 */
	private StudentInfoModel secretary;
	
	/**
	 * 学生人数
	 */
	private int stunums;
	
	/**
	 * 团员人数
	 */
	private int membernums;
	
	public BaseAcademyModel getCollege() {
		return college;
	}
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	public BaseMajorModel getMajor() {
		return major;
	}
	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}
	public BaseClassModel getClassId() {
		return classId;
	}
	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}
	
	public BaseTeacherModel getHeadmaster() {
		return headmaster;
	}
	public void setHeadmaster(BaseTeacherModel headmaster) {
		this.headmaster = headmaster;
	}
	public StudentInfoModel getSecretary() {
		return secretary;
	}
	public void setSecretary(StudentInfoModel secretary) {
		this.secretary = secretary;
	}
	public int getStunums() {
		return stunums;
	}
	public void setStunums(int stunums) {
		this.stunums = stunums;
	}
	public int getMembernums() {
		return membernums;
	}
	public void setMembernums(int membernums) {
		this.membernums = membernums;
	}
	

	
}