package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;

public class SeminarSubscribeList extends BaseModel {
	private static final long serialVersionUID = -651840020025874466L;
	
	private SeminarManage seminarId;
	
	private BaseAcademyModel collegeId;
	
	private OuterUserInfo outerUserId;
	
	private Dic seminarStatus;
	
	private Dic appointStatus;

	public SeminarManage getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(SeminarManage seminarId) {
		this.seminarId = seminarId;
	}

	public BaseAcademyModel getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(BaseAcademyModel collegeId) {
		this.collegeId = collegeId;
	}

	public OuterUserInfo getOuterUserId() {
		return outerUserId;
	}

	public void setOuterUserId(OuterUserInfo outerUserId) {
		this.outerUserId = outerUserId;
	}

	public Dic getSeminarStatus() {
		return seminarStatus;
	}

	public void setSeminarStatus(Dic seminarStatus) {
		this.seminarStatus = seminarStatus;
	}

	public Dic getAppointStatus() {
		return appointStatus;
	}

	public void setAppointStatus(Dic appointStatus) {
		this.appointStatus = appointStatus;
	}

}
