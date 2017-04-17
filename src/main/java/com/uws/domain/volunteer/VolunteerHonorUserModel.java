package com.uws.domain.volunteer;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

public class VolunteerHonorUserModel extends BaseModel {

	private static final long serialVersionUID = 4548039386742123969L;
	
	private VolunteerHonorModel volunteerHonorPo;
	
	private VolunteerBaseinfoModel volunteerPo;
	
	private Dic deleteStatus;

	public VolunteerHonorModel getVolunteerHonorPo() {
		return volunteerHonorPo;
	}

	public void setVolunteerHonorPo(VolunteerHonorModel volunteerHonorPo) {
		this.volunteerHonorPo = volunteerHonorPo;
	}

	public VolunteerBaseinfoModel getVolunteerPo() {
		return volunteerPo;
	}

	public void setVolunteerPo(VolunteerBaseinfoModel volunteerPo) {
		this.volunteerPo = volunteerPo;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
}
