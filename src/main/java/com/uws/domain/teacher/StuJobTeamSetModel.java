package com.uws.domain.teacher;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;

/**
 * @author houyue
 * @version:2015年8月25日 10:49:05
 * @Description:辅导员对应关系表
 */
public class StuJobTeamSetModel extends BaseModel {

	private static final long serialVersionUID = -275698981866084908L;

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
	private BaseClassModel klass;

	/**
	 * 教师
	 */
	private BaseTeacherModel teacher;

	/**
	 * 教师类型
	 */
	private Dic teacherType;

	/**
	 * 创建时间
	 */
	private Date creatTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public Dic getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(Dic teacherType) {
		this.teacherType = teacherType;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public BaseClassModel getKlass() {
		return klass;
	}

	public void setKlass(BaseClassModel klass) {
		this.klass = klass;
	}

	public BaseTeacherModel getTeacher() {
		return teacher;
	}

	public void setTeacher(BaseTeacherModel teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the major
	 */
	public BaseMajorModel getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}
}
