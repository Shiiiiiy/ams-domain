package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
 * 困难生奖助中的奖---就业补助JobGrant
 * @author liuchen
 *
 */
public class JobGrant extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 4417332812786746379L;
    
    private String jobGrantId;
    //困难生奖助实体
    private DifficultStudentAward studentAward;
    //困难生类型
    private Dic difficultType;
    //就业去向
    private String employeeDesc;
    //删除状态
    private Dic delStatus;
    
    
    
	public String getJobGrantId()
    {
    	return jobGrantId;
    }
	public void setJobGrantId(String jobGrantId)
    {
    	this.jobGrantId = jobGrantId;
    }
	public DifficultStudentAward getStudentAward()
    {
    	return studentAward;
    }
	public void setStudentAward(DifficultStudentAward studentAward)
    {
    	this.studentAward = studentAward;
    }
	
	public Dic getDifficultType()
    {
    	return difficultType;
    }
	public void setDifficultType(Dic difficultType)
    {
    	this.difficultType = difficultType;
    }
	public String getEmployeeDesc()
    {
    	return employeeDesc;
    }
	public void setEmployeeDesc(String employeeDesc)
    {
    	this.employeeDesc = employeeDesc;
    }
	public Dic getDelStatus()
    {
    	return delStatus;
    }
	public void setDelStatus(Dic delStatus)
    {
    	this.delStatus = delStatus;
    }
    
    
    

}
