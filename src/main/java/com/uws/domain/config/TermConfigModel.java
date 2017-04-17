package com.uws.domain.config;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @ClassName: TimeConfigModel
 * @Description: 学期设置 定义实体类
 * @author 联合永道
 * @date 2015-8-13 上午10:24:43
 * 
 */

public class TermConfigModel extends BaseModel
{
	private static final long serialVersionUID = 7662502210911410815L;

	private Dic yearDic; // 学年
	private Dic termDic; // 学期
	private Date beginDate; // 学期开始时间
	private Date endDate; // 学期结束时间

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

}
