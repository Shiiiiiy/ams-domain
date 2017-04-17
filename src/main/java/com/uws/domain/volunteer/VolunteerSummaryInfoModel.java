package com.uws.domain.volunteer;
import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;

/**
 * 志愿者基本信息实体类
 */
public class VolunteerSummaryInfoModel extends BaseModel {

	private static final long serialVersionUID = 693780383392602518L;

	/**
	 * 学生信息
	 */
	private BaseAcademyModel college;

	/**
	 * 志愿者总数
	 */
	private int volunteerNums;

	/**
	 * 参与培训人员总数
	 */
	private int trainingNums;
	/**
	 * 获得荣誉人员总数
	 */
	private int honorNums;

	/**
	 * 参与服务人员总数
	 */
	private int serviceNums;
	/**
	 * 志愿者服务时间
	 */
	private Double serviceHourNums;

	

	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public int getVolunteerNums() {
		return volunteerNums;
	}

	public void setVolunteerNums(int volunteerNums) {
		this.volunteerNums = volunteerNums;
	}

	public int getTrainingNums() {
		return trainingNums;
	}

	public void setTrainingNums(int trainingNums) {
		this.trainingNums = trainingNums;
	}

	public int getServiceNums() {
		return serviceNums;
	}

	public void setServiceNums(int serviceNums) {
		this.serviceNums = serviceNums;
	}

	public int getHonorNums() {
		return honorNums;
	}

	public void setHonorNums(int honorNums) {
		this.honorNums = honorNums;
	}

	public Double getServiceHourNums() {
		return serviceHourNums;
	}

	public void setServiceHourNums(Double serviceHourNums) {
		this.serviceHourNums = serviceHourNums;
	}

	
	
	
	
}