package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

public class SeminarApply extends BaseModel {

	private static final long serialVersionUID = 1776741929866579963L;
	/**
	 * 讲座id
	 */
	private SeminarManage seminarId;
	/**
	 * 报名学生id
	 */
	private StudentInfoModel studentId;
	
	/**
	 * 报名状态
	 */
	private Dic applyStatus;

	/**
	 * 创建者
	 */
	private User creator;
	
	public SeminarManage getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(SeminarManage seminarId) {
		this.seminarId = seminarId;
	}

	public StudentInfoModel getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}

	public Dic getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Dic applyStatus) {
		this.applyStatus = applyStatus;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}
}
