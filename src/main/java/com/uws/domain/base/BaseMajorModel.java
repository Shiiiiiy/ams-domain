package com.uws.domain.base;

import com.uws.core.base.BaseModel;

/**
 * 
 * @ClassName: BaseMajorModel
 * @Description: 基础专业实体
 * @author 联合永道
 * @date 2015-7-13 下午2:33:43
 * 
 */
public class BaseMajorModel extends BaseModel
{
	private static final long serialVersionUID = -4716640426247229154L;

	private String majorCode;// 专业代码
	private String majorName;// 专业名称
	private BaseAcademyModel collage;// 学院
	private String categoryCode;// 学科门类
	private String schoolYear;// 学制
	private String majorInfo;//专业信息 查询控件显示用
	
	public String getMajorCode()
	{
		return majorCode;
	}

	public void setMajorCode(String majorCode)
	{
		this.majorCode = majorCode;
	}

	public String getMajorName()
	{
		return majorName;
	}

	public void setMajorName(String majorName)
	{
		this.majorName = majorName;
	}

	public BaseAcademyModel getCollage()
    {
    	return collage;
    }

	public void setCollage(BaseAcademyModel collage)
    {
    	this.collage = collage;
    }

	public String getCategoryCode()
	{
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode)
	{
		this.categoryCode = categoryCode;
	}

	public String getSchoolYear()
	{
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear)
	{
		this.schoolYear = schoolYear;
	}

	public String getMajorInfo()
    {
    	return majorInfo;
    }

	public void setMajorInfo(String majorInfo)
    {
    	this.majorInfo = majorInfo;
    }
	
	
}
