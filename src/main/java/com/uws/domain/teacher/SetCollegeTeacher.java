package com.uws.domain.teacher;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseTeacherModel;

public class SetCollegeTeacher extends BaseModel{
	/**
	 * 版本
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	/**
	 * 测评辅导员
	 */
	private BaseTeacherModel evaCounsellor;
	/**
	 * 资助辅导员
	 */
	private BaseTeacherModel subCounsellor;
	/**
	 * 就业辅导员
	 */
	private BaseTeacherModel careerCounsellor;
	/**
	 * 学院get()方法
	 * @return
	 */
	public BaseAcademyModel getCollege() {
		return college;
	}
	/**
	 * 学院set()方法
	 * @param college
	 */
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	/**
	 * 测评辅导员get()方法
	 * @return
	 */
	public BaseTeacherModel getEvaCounsellor() {
		return evaCounsellor;
	}
	/**
	 * 测评辅导员set()方法
	 * @param evaCounsellor
	 */
	public void setEvaCounsellor(BaseTeacherModel evaCounsellor) {
		this.evaCounsellor = evaCounsellor;
	}
	/**
	 * 资助辅导员get()方法
	 * @return
	 */
	public BaseTeacherModel getSubCounsellor() {
		return subCounsellor;
	}
	/**
	 * 资助辅导员set()方法
	 * @param subCounsellor
	 */
	public void setSubCounsellor(BaseTeacherModel subCounsellor) {
		this.subCounsellor = subCounsellor;
	}
	/**
	 * 就业辅导员get()方法
	 * @return
	 */
	public BaseTeacherModel getCareerCounsellor() {
		return careerCounsellor;
	}
	/**
	 * 就业辅导员set()方法
	 * @param careerCounsellor
	 */
	public void setCareerCounsellor(BaseTeacherModel careerCounsellor) {
		this.careerCounsellor = careerCounsellor;
	}
	
}
