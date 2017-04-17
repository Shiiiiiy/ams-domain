package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
 * 困难生奖助中的奖---学校助学金AidGrant
 * @author liuchen
 *
 */
public class AidGrant extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 5402060459184666177L;
    private String aidGrantId;
    //困难生奖助实体
    private DifficultStudentAward studentAward;
    //助学金等级
    private Dic aidLevel;
    //是否获得本学年国家助学金
    private Dic isNationalAidAward;
    //补考是否及格
    private Dic isExamFail;
    //删除状态
    private Dic delStatus;
    
    
	public String getAidGrantId()
    {
    	return aidGrantId;
    }

	public void setAidGrantId(String aidGrantId)
    {
    	this.aidGrantId = aidGrantId;
    }

	public DifficultStudentAward getStudentAward()
    {
    	return studentAward;
    }

	public void setStudentAward(DifficultStudentAward studentAward)
    {
    	this.studentAward = studentAward;
    }

	public Dic getAidLevel()
    {
    	return aidLevel;
    }

	public void setAidLevel(Dic aidLevel)
    {
    	this.aidLevel = aidLevel;
    }

	public Dic getIsNationalAidAward()
    {
    	return isNationalAidAward;
    }

	public void setIsNationalAidAward(Dic isNationalAidAward)
    {
    	this.isNationalAidAward = isNationalAidAward;
    }

	public Dic getIsExamFail()
    {
    	return isExamFail;
    }

	public void setIsExamFail(Dic isExamFail)
    {
    	this.isExamFail = isExamFail;
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
