package com.uws.domain.activity;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 活动带队老师实体类
 */
public class ActivityTeacherModel extends BaseModel {

	private static final long serialVersionUID = -1322819603667240988L;

	/**
	 * 活动基本信息对象
	 */
	private ActivityBaseinfoModel activityPo;

	/**
	 * 带队老师
	 */
	private BaseTeacherModel leaderTeacher;

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
	public BaseTeacherModel getLeaderTeacher() {
		return leaderTeacher;
	}
	public void setLeaderTeacher(BaseTeacherModel leaderTeacher) {
		this.leaderTeacher = leaderTeacher;
	}
	public Dic getDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}