package com.uws.domain.base;

import java.io.Serializable;

/**
 * 
* @ClassName: JsonModel 
* @author 联合永道
* @date 2015-7-30 下午5:20:43 
*
 */
public class JsonModel implements Serializable
{
	private static final long serialVersionUID = -3473652946440814994L;
	private String id;
	private String name;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
