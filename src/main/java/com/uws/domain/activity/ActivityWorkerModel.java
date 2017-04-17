package com.uws.domain.activity;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;

/**
 * 活动工作人员实体类
 */
public class ActivityWorkerModel extends BaseModel {

	private static final long serialVersionUID = -1322819603667240988L;

	/**
	 * 活动基本信息对象
	 */
	private ActivityBaseinfoModel activityPo;

	/**
	 * 工作人员
	 */
	private BaseTeacherModel workerPo;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	public ActivityBaseinfoModel getActivityPo() {
		return activityPo;
	}

	public void setActivityPo(ActivityBaseinfoModel activityPo) {
		this.activityPo = activityPo;
	}

	public BaseTeacherModel getWorkerPo() {
		return workerPo;
	}

	public void setWorkerPo(BaseTeacherModel workerPo) {
		this.workerPo = workerPo;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}