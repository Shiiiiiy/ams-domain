package com.uws.domain.volunteer;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 志愿者服务实体类
 */
public class VolunteerServiceModel extends BaseModel {

	private static final long serialVersionUID = 987284120884268292L;

	/**
	 * 服务日期
	 */
	private Date serviceDate;

	/**
	 * 服务时长
	 */
	private double serviceHour;
	/**
	 * 参加服务的人数
	 */
	private int serviceStuNums;
	/**
	 * 服务记录
	 */
	private String serviceRecord;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	/**
	 * 用于列表查询
	 */
	private String serviceHourStr;
	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public double getServiceHour() {
		return serviceHour;
	}

	public void setServiceHour(double serviceHour) {
		this.serviceHour = serviceHour;
	}
	
	public String getServiceRecord() {
		return serviceRecord;
	}

	public void setServiceRecord(String serviceRecord) {
		this.serviceRecord = serviceRecord;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getServiceHourStr() {
		return serviceHourStr;
	}

	public void setServiceHourStr(String serviceHourStr) {
		this.serviceHourStr = serviceHourStr;
	}

	public int getServiceStuNums() {
		return serviceStuNums;
	}

	public void setServiceStuNums(int serviceStuNums) {
		this.serviceStuNums = serviceStuNums;
	}
	
}