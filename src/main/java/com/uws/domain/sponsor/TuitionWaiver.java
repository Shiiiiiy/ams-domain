package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
 * 困难生奖助中的奖---学费减免TuitionWaiver
 * @author liuchen
 *
 */
public class TuitionWaiver extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 2299197216716270931L;
    private String tuitionWaiverId;
    //困难生奖助实体
    private DifficultStudentAward studentAward;
    //困难生类型
    private Dic difficultType;
    //申请减免金额
    private double applyReduceMoney;
    //经补考是否及格
    private Dic isExamFail;
    //综合测评是否中等以上
    private Dic iSEvaluateMidel;
    //删除状态
    private Dic delStatus;
    
    
	public String getTuitionWaiverId()
    {
    	return tuitionWaiverId;
    }

	public void setTuitionWaiverId(String tuitionWaiverId)
    {
    	this.tuitionWaiverId = tuitionWaiverId;
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

	public double getApplyReduceMoney()
    {
    	return applyReduceMoney;
    }

	public void setApplyReduceMoney(double applyReduceMoney){
    	
    	this.applyReduceMoney = applyReduceMoney;
    }

	public Dic getIsExamFail()
    {
    	return isExamFail;
    }

	public void setIsExamFail(Dic isExamFail)
    {
    	this.isExamFail = isExamFail;
    }

	public Dic getiSEvaluateMidel()
    {
    	return iSEvaluateMidel;
    }

	public void setiSEvaluateMidel(Dic iSEvaluateMidel)
    {
    	this.iSEvaluateMidel = iSEvaluateMidel;
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
