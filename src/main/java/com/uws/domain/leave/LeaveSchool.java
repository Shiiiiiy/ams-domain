package com.uws.domain.leave;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;

public class LeaveSchool extends BaseModel
{

	private static final long serialVersionUID = -7758689584474833278L;

	/**
	 * 学生
	 */
	private StudentInfoModel student;

	/**
	 * 办理年份
	 */
	private String year;

	/***
	 * 图书馆办理状态
	 */
	private String library;

	/**
	 * 借书数量
	 */
	private String bookCount;

	/***
	 * 宿舍办理状态
	 */
	private String dorm;

	/***
	 * 财务办理状态
	 */
	private String finance;

	/**
	 * 财务余额
	 */
	private String balance;

	/***
	 * 党团关系办理状态
	 */
	private String caucus;

	/***
	 * 二级学院办理状态
	 */
	private String college;

	/***
	 * 保卫处办理状态（户口迁移）
	 */
	private String security;

	private String oneCard;

	/**
	 * 办理状态
	 */
	private String status;

	/**
	 * 毕业状态
	 */
	private String graduateStatus;

	/**
	 * 离校原因
	 */
	private String reason;

	/**
	 * 办理开始时间
	 */
	private Date startDate;

	/**
	 * 办理结束时间
	 */
	private Date endDate;

	public StudentInfoModel getStudent()
	{
		return student;
	}

	public void setStudent(StudentInfoModel student)
	{
		this.student = student;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public String getLibrary()
	{
		return library;
	}

	public void setLibrary(String library)
	{
		this.library = library;
	}

	public String getBookCount()
	{
		return bookCount;
	}

	public void setBookCount(String bookCount)
	{
		this.bookCount = bookCount;
	}

	public String getDorm()
	{
		return dorm;
	}

	public void setDorm(String dorm)
	{
		this.dorm = dorm;
	}

	public String getFinance()
	{
		return finance;
	}

	public void setFinance(String finance)
	{
		this.finance = finance;
	}

	public String getBalance()
	{
		return balance;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public String getCaucus()
	{
		return caucus;
	}

	public void setCaucus(String caucus)
	{
		this.caucus = caucus;
	}

	public String getCollege()
	{
		return college;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public String getSecurity()
	{
		return security;
	}

	public void setSecurity(String security)
	{
		this.security = security;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public String getGraduateStatus()
	{
		return graduateStatus;
	}

	public void setGraduateStatus(String graduateStatus)
	{
		this.graduateStatus = graduateStatus;
	}

	public String getOneCard()
	{
		return oneCard;
	}

	public void setOneCard(String oneCard)
	{
		this.oneCard = oneCard;
	}

}
