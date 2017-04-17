package com.uws.domain.integrate;

import java.io.Serializable;

/**
 * 
* @ClassName: StudentSchoolCount 
* @Description: 按学校统计学生数量 
* @author 联合永道
* @date 2016-5-16 下午4:45:29 
*
 */
public class StudentSchoolCount implements Serializable
{

	private static final long serialVersionUID = -4181990151921459337L;

	private String id;
	private double boy;
	private double girl;
	private String grade;
	private double totalCount;

	public String getId()
    {
    	return id;
    }

	public void setId(String id)
    {
    	this.id = id;
    }

	public double getBoy()
    {
    	return boy;
    }

	public void setBoy(double boy)
    {
    	this.boy = boy;
    }

	public double getGirl()
    {
    	return girl;
    }

	public void setGirl(double girl)
    {
    	this.girl = girl;
    }

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public double getTotalCount()
	{
		return totalCount;
	}

	public void setTotalCount(double totalCount)
	{
		this.totalCount = totalCount;
	}

}
