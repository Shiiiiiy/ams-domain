package com.uws.domain.leave;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

public class CollegeHandle extends BaseModel
{
	/**
     * 
     */
    private static final long serialVersionUID = -5784120973433856550L;
    
    
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	private String stuNumber;
	
	/**
	 * 办理年份
	 */
	private Dic handleYear;
	
	/***
	 * 状态
	 */
	private Dic handleStatus;

	public StudentInfoModel getStudent()
    {
    	return student;
    }

	public void setStudent(StudentInfoModel student)
    {
    	this.student = student;
    }

	public String getStuNumber()
    {
    	return stuNumber;
    }

	public void setStuNumber(String stuNumber)
    {
    	this.stuNumber = stuNumber;
    }

	public Dic getHandleYear()
    {
    	return handleYear;
    }

	public void setHandleYear(Dic handleYear)
    {
    	this.handleYear = handleYear;
    }

	public Dic getHandleStatus()
    {
    	return handleStatus;
    }

	public void setHandleStatus(Dic handleStatus)
    {
    	this.handleStatus = handleStatus;
    }

	
   
}
