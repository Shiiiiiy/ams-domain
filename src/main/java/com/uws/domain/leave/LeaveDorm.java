package com.uws.domain.leave;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/***
 * 宿管
 * @author Jiangbl
 * date 2016-1-19
 */
public class LeaveDorm extends BaseModel{
	
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	
	/**
	 * 办理年份
	 */
	private Dic year;
	
	/***
	 * 状态
	 */
	private Dic status;

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

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

}
