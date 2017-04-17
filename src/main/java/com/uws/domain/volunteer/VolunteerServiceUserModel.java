package com.uws.domain.volunteer;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

public class VolunteerServiceUserModel extends BaseModel {

	private static final long serialVersionUID = 985970641502246584L;
	
	private VolunteerServiceModel volunteerServicePo;
	
	private VolunteerBaseinfoModel volunteerPo;
	
	private Dic deleteStatus;

	public VolunteerServiceModel getVolunteerServicePo() {
		return volunteerServicePo;
	}

	public void setVolunteerServicePo(VolunteerServiceModel volunteerServicePo) {
		this.volunteerServicePo = volunteerServicePo;
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
