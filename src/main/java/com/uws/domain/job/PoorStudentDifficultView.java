package com.uws.domain.job;

import java.io.Serializable;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.domain.sponsor.DifficultStudentInfo;
import com.uws.sys.model.Dic;


public class PoorStudentDifficultView extends BaseModel implements Serializable
{

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String pId;
    
    //困难生实体
    private DifficultStudentInfo difficultStudentInfo;
    //学生对象
    private StudentInfoModel studentInfo;
    //学年
    private Dic schoolYear;
    //困难类别
    private Dic difficultType; 
    //困难原因
    private String reason;
    //状态（保存，待审核，审核通过，审核不通过）
    private Dic status;
    
    private String difficultId;
    
	public DifficultStudentInfo getDifficultStudentInfo()
    {
    	return difficultStudentInfo;
    }
	public void setDifficultStudentInfo(DifficultStudentInfo difficultStudentInfo)
    {
    	this.difficultStudentInfo = difficultStudentInfo;
    }
	public StudentInfoModel getStudentInfo()
    {
    	return studentInfo;
    }
	public void setStudentInfo(StudentInfoModel studentInfo)
    {
    	this.studentInfo = studentInfo;
    }
	public Dic getSchoolYear()
    {
    	return schoolYear;
    }
	public void setSchoolYear(Dic schoolYear)
    {
    	this.schoolYear = schoolYear;
    }
	public Dic getDifficultType()
    {
    	return difficultType;
    }
	public void setDifficultType(Dic difficultType)
    {
    	this.difficultType = difficultType;
    }
	public String getReason()
    {
    	return reason;
    }
	public void setReason(String reason)
    {
    	this.reason = reason;
    }
	public Dic getStatus()
    {
    	return status;
    }
	public void setStatus(Dic status)
    {
    	this.status = status;
    }
	public String getpId()
    {
    	return pId;
    }
	public void setpId(String pId)
    {
    	this.pId = pId;
    }
	public String getDifficultId()
    {
    	return difficultId;
    }
	public void setDifficultId(String difficultId)
    {
    	this.difficultId = difficultId;
    }
    
    
    
    
    

}
