package com.uws.domain.sponsor;

import java.util.List;

/**
 * @className WorkHourModelList.java
 * @package com.uws.domain.sponsor
 * @description 用于批量提交
 * @author Administrator
 * @date 2015-8-17  下午1:51:09
 */
public class WorkHourModelList {
	private OrgWorkHourModel orgWorkHourModel;
	private List<WorkHourModel> workHourList;
	public List<WorkHourModel> getWorkHourList() {
		return workHourList;
	}
	public void setWorkHourList(List<WorkHourModel> workHourList) {
		this.workHourList = workHourList;
	}
	public OrgWorkHourModel getOrgWorkHourModel() {
		return orgWorkHourModel;
	}
	public void setOrgWorkHourModel(OrgWorkHourModel orgWorkHourModel) {
		this.orgWorkHourModel = orgWorkHourModel;
	}
}
