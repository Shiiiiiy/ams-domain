package com.uws.domain.sponsor;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 困难生奖助中的奖---校内无息借款SchoolLoan
 * @author liuchen
 *
 */
public class SchoolLoan extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = -6220621874753023710L;
    private String schoolLoanId;
    //困难生奖助实体
    private DifficultStudentAward studentAward;
    //申请金额
    private double applyMoney;
    //还款日期
    private Date returnTime;
    private String returnDate;
    //家长意见
    private String parentOpinion;
    //班主任意见
    private String teacherOpinion;
    //删除状态
    private Dic delStatus;
    
    
    
	public String getSchoolLoanId()
    {
    	return schoolLoanId;
    }
	public void setSchoolLoanId(String schoolLoanId)
    {
    	this.schoolLoanId = schoolLoanId;
    }
	public DifficultStudentAward getStudentAward()
    {
    	return studentAward;
    }
	public void setStudentAward(DifficultStudentAward studentAward)
    {
    	this.studentAward = studentAward;
    }
	
	public double getApplyMoney()
    {
    	return applyMoney;
    }
	public void setApplyMoney(double applyMoney)
    {
    	this.applyMoney = applyMoney;
    }
	public Date getReturnTime()
    {
    	return returnTime;
    }
	public void setReturnTime(Date returnTime)
    {
    	this.returnTime = returnTime;
    }
	
	public String getParentOpinion()
    {
    	return parentOpinion;
    }
	public void setParentOpinion(String parentOpinion)
    {
    	this.parentOpinion = parentOpinion;
    }
	public String getTeacherOpinion()
    {
    	return teacherOpinion;
    }
	public void setTeacherOpinion(String teacherOpinion)
    {
    	this.teacherOpinion = teacherOpinion;
    }
	public Dic getDelStatus()
    {
    	return delStatus;
    }
	public void setDelStatus(Dic delStatus)
    {
    	this.delStatus = delStatus;
    }
	public String getReturnDate()
    {
    	return returnDate;
    }
	public void setReturnDate(String returnDate)
    {
    	this.returnDate = returnDate;
    }
	
	
}