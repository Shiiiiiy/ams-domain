package com.uws.domain.volunteer;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 志愿者荣誉实体类
 */
public class VolunteerHonorModel extends BaseModel {

	private static final long serialVersionUID = 2033175646275961094L;

	/**
	 * 荣誉名称
	 */
	private String honorName;

	/**
	 * 荣誉级别
	 */
	private Dic honorLevel;

	/**
	 * 获得荣誉时间
	 */
	private Date honorTime;
	
	/**
	 * 获得荣誉学年
	 */
	private Dic honorYear;
	
	/**
	 * 获得荣誉学期
	 */
	private Dic honorTerm;
	
	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	public String getHonorName() {
		return honorName;
	}

	public void setHonorName(String honorName) {
		this.honorName = honorName;
	}

	public Dic getHonorLevel() {
		return honorLevel;
	}

	public void setHonorLevel(Dic honorLevel) {
		this.honorLevel = honorLevel;
	}

	public Date getHonorTime() {
		return honorTime;
	}

	public void setHonorTime(Date honorTime) {
		this.honorTime = honorTime;
	}

	public Dic getHonorYear() {
		return honorYear;
	}

	public void setHonorYear(Dic honorYear) {
		this.honorYear = honorYear;
	}

	public Dic getHonorTerm() {
		return honorTerm;
	}

	public void setHonorTerm(Dic honorTerm) {
		this.honorTerm = honorTerm;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}