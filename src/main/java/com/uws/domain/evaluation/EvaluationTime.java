package com.uws.domain.evaluation;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @description 测评设置时间实体
 * @author Jiangbl
 * @date 2015-8-14
 */
public class EvaluationTime extends BaseModel{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 学院
	 */
	private BaseAcademyModel college;	
	
	/**
	 * 学院id 查询条件 使用
	 */
	private String collegeId;
	
	/**
	 * 辅导员
	 */
	private User instructor;
	
	/**
	 * 辅导员id 查询条件 使用
	 */
	private String instructorId;
	
	/**
	 * 月份
	 */
	private Dic month;
	
	/**
	 * 月份id 查询条件 使用
	 */
	private String monthId; 
	
	/**
	 * 测评添加开始时间
	 */
	private Date addStartTime; 	
	
	/**
	 * 测评添加结束时间
	 */
	private Date addEndTime;	
	
	/**
	 * 修改开始时间
	 */
	private Date updateStartTime;
	
	/**
	 * 修改结束时间
	 */
	private Date updateEndTime;	
	
	/**
	 * 操作人
	 */
	private User creator;	
	
	/**
	 * 状态
	 */
	private Dic status;	
	
	
	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public User getInstructor() {
		return instructor;
	}

	public void setInstructor(User instructor) {
		this.instructor = instructor;
	}

	public Dic getMonth() {
		return month;
	}

	public void setMonth(Dic month) {
		this.month = month;
	}

	public Date getAddStartTime() {
		return addStartTime;
	}

	public void setAddStartTime(Date addStartTime) {
		this.addStartTime = addStartTime;
	}

	public Date getUpdateStartTime() {
		return updateStartTime;
	}

	public void setUpdateStartTime(Date updateStartTime) {
		this.updateStartTime = updateStartTime;
	}

	public Date getAddEndTime() {
		return addEndTime;
	}
	
	public void setAddEndTime(Date addEndTime) {
		this.addEndTime = addEndTime;
	}
	
	public Date getUpdateEndTime() {
		return updateEndTime;
	}
	
	public void setUpdateEndTime(Date updateEndTime) {
		this.updateEndTime = updateEndTime;
	}
	
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getMonthId() {
		return monthId;
	}

	public void setMonthId(String monthId) {
		this.monthId = monthId;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

}
