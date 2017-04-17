package com.uws.domain.warning;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 
* @ClassName: WarningForwardModel 
* @Description: 预警上报信息
* @author 联合永道
* @date 2015-12-29 下午3:09:05 
*
 */
public class WarningForwardModel extends BaseModel
{
    private static final long serialVersionUID = 4388530591539820955L;
    
	private BaseAcademyModel college; // 学院
	private Dic warningType; //预警类型
	private Dic yearDic;//预警学年
	private Dic termDic;//预警学期
	private User creator;//创建人
	private User updateUser;//最后更新人
	private Date warningDate;// 预警上报时间
	private Integer fileNumber;//附件数量
	
	public BaseAcademyModel getCollege()
    {
    	return college;
    }
	public void setCollege(BaseAcademyModel college)
    {
    	this.college = college;
    }
	public Dic getWarningType()
    {
    	return warningType;
    }
	public void setWarningType(Dic warningType)
    {
    	this.warningType = warningType;
    }
	public Dic getYearDic()
    {
    	return yearDic;
    }
	public void setYearDic(Dic yearDic)
    {
    	this.yearDic = yearDic;
    }
	public Dic getTermDic()
    {
    	return termDic;
    }
	public void setTermDic(Dic termDic)
    {
    	this.termDic = termDic;
    }
	public User getCreator()
    {
    	return creator;
    }
	public void setCreator(User creator)
    {
    	this.creator = creator;
    }
	public User getUpdateUser()
    {
    	return updateUser;
    }
	public void setUpdateUser(User updateUser)
    {
    	this.updateUser = updateUser;
    }
	public Date getWarningDate()
    {
    	return warningDate;
    }
	public void setWarningDate(Date warningDate)
    {
    	this.warningDate = warningDate;
    }
	public Integer getFileNumber()
    {
    	return fileNumber;
    }
	public void setFileNumber(Integer fileNumber)
    {
    	this.fileNumber = fileNumber;
    }
	
}
