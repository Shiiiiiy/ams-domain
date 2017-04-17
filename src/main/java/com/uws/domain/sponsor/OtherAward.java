package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
 * 困难生奖助中的奖---就其他奖助，不包括在5个奖项内（校内无息借款，学费减免，单项励志奖学金，学校助学金，就业补助）
 * @author liuchen
 *
 */
public class OtherAward extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 4417332812786746379L;
    
    private String otherAwardId;
    //困难生奖助实体
    private DifficultStudentAward studentAward;
    //困难生类型
    private Dic difficultType;
    //删除状态
    private Dic delStatus;
    
    
    


	public String getOtherAwardId()
    {
    	return otherAwardId;
    }
	public void setOtherAwardId(String otherAwardId)
    {
    	this.otherAwardId = otherAwardId;
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

	public Dic getDelStatus()
    {
    	return delStatus;
    }
	public void setDelStatus(Dic delStatus)
    {
    	this.delStatus = delStatus;
    }
    
    
    

}
