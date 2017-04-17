package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
/**
 * 困难生奖助中的奖---单项励志奖学金InspirationalAward
 * @author liuchen
 *
 */
public class InspirationalAward extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 6829536193136017414L;
    private String inspirationalAwardId;
    //困难生奖助信息实体
    private DifficultStudentAward studentAward;
    //获奖类型(学习进步奖,综合技能竞赛奖,社会实践优秀奖,创新创业助力奖)
    private Dic awardKind;
    //上学年国家励志奖学金
    private Dic nationalInspirationalAward;
    //行知奖学金
    private Dic xingZhiAward;
    //删除状态
    private Dic delStatus;
    
    
    
	public String getInspirationalAwardId()
    {
    	return inspirationalAwardId;
    }
	public void setInspirationalAwardId(String inspirationalAwardId)
    {
    	this.inspirationalAwardId = inspirationalAwardId;
    }
	public DifficultStudentAward getStudentAward()
    {
    	return studentAward;
    }
	public void setStudentAward(DifficultStudentAward studentAward)
    {
    	this.studentAward = studentAward;
    }
	
	public Dic getAwardKind()
    {
    	return awardKind;
    }
	public void setAwardKind(Dic awardKind)
    {
    	this.awardKind = awardKind;
    }
	public Dic getNationalInspirationalAward()
    {
    	return nationalInspirationalAward;
    }
	public void setNationalInspirationalAward(Dic nationalInspirationalAward)
    {
    	this.nationalInspirationalAward = nationalInspirationalAward;
    }
	public Dic getXingZhiAward()
    {
    	return xingZhiAward;
    }
	public void setXingZhiAward(Dic xingZhiAward)
    {
    	this.xingZhiAward = xingZhiAward;
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
