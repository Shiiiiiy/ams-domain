package com.uws.domain.leave;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/***
 * 水电费
 * @author Jiangbl
 * date 2016-1-19
 */
public class LifeInfo extends BaseModel{
	
	/**
     * 
     */
    private static final long serialVersionUID = 8467269033099726259L;
    
	/**
	 * 学生
	 */
	private StudentInfoModel student;
	private String stuNumber;
	
	/**
	 * 办理年份
	 */
	private Dic year;
	
	/***
	 * 状态
	 */
	private Dic status;

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}
    


	public Dic getYear()
    {
    	return year;
    }

	public void setYear(Dic year)
    {
    	this.year = year;
    }

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

	public String getStuNumber()
    {
    	return stuNumber;
    }

	public void setStuNumber(String stuNumber)
    {
    	this.stuNumber = stuNumber;
    }
	
	

}
