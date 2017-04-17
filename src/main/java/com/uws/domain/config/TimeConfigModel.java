package com.uws.domain.config;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: TimeConfigModel
 * @Description: 时间设置 定义实体类
 * @author 联合永道
 * @date 2015-8-13 上午10:24:43
 * 
 */

public class TimeConfigModel extends BaseModel
{
	private static final long serialVersionUID = -1270111408656581881L;

	private String name;
	private String code;
	private Date beginDate;
	private Date endDate;
	private User creator;
	private User updateUser;
	private BaseAcademyModel college;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public Date getBeginDate()
	{
		return beginDate;
	}

	public void setBeginDate(Date beginDate)
	{
		this.beginDate = beginDate;
	}

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
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

	public BaseAcademyModel getCollege()
    {
    	return college;
    }

	public void setCollege(BaseAcademyModel college)
    {
    	this.college = college;
    }

}
