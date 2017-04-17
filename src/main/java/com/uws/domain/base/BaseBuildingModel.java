package com.uws.domain.base;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 
* @ClassName: BaseBuildingModel 
* @Description: 宿舍楼信息
* @author 联合永道
* @date 2015-9-6 下午4:03:37 
*
 */
public class BaseBuildingModel extends BaseModel
{
	private static final long serialVersionUID = 4179082588536539249L;
	private String name;
	private String campusName;
	private Dic campus; // 暂时无用，扩展用

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCampusName()
	{
		return campusName;
	}

	public void setCampusName(String campusName)
	{
		this.campusName = campusName;
	}

	public Dic getCampus()
	{
		return campus;
	}

	public void setCampus(Dic campus)
	{
		this.campus = campus;
	}

}
