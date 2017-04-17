package com.uws.domain.base;

import com.uws.core.base.BaseModel;
import com.uws.user.model.Org;

/**
 * 
 * @ClassName: BaseAcademyModel
 * @Description: 学院基础数据
 * @author 联合永道
 * @date 2015-7-28 下午2:21:08
 * 
 */
public class BaseAcademyModel extends BaseModel
{
	private static final long serialVersionUID = -6296402168134847076L;

	private String name;// 学院名称
	private String code;//单位号
	private Org org;// 所属单位

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

	public Org getOrg()
	{
		return org;
	}

	public void setOrg(Org org)
	{
		this.org = org;
	}
}
