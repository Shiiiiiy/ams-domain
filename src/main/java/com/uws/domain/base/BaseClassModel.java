package com.uws.domain.base;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @ClassName: BaseClassModel
 * @Description: 基础班级实体
 * @author 联合永道
 * @date 2015-7-13 下午2:32:16
 * 
 */
public class BaseClassModel extends BaseModel
{
	private static final long serialVersionUID = -6091488734580179053L;

	private String className; // 班级名称
	private String code; // 班号
	private BaseMajorModel major; // 专业
	private String grade; // 年级
	private StudentInfoModel monitor; // 班长
	private BaseTeacherModel  headermaster; //班主任
	private String status;//毕业班状态
	private Dic isGraduatedDic;// 是否毕业班
	private String classInfo;//班级信息 查询控件显示用
	private Dic graduatedYearDic;// 毕业学年

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public BaseMajorModel getMajor()
	{
		return major;
	}

	public void setMajor(BaseMajorModel major)
	{
		this.major = major;
	}

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public StudentInfoModel getMonitor()
	{
		return monitor;
	}

	public void setMonitor(StudentInfoModel monitor)
	{
		this.monitor = monitor;
	}

	public BaseTeacherModel getHeadermaster()
    {
    	return headermaster;
    }

	public void setHeadermaster(BaseTeacherModel headermaster)
    {
    	this.headermaster = headermaster;
    }

	public String getStatus()
    {
    	return status;
    }

	public void setStatus(String status)
    {
    	this.status = status;
    }

	public Dic getIsGraduatedDic()
    {
    	return isGraduatedDic;
    }

	public void setIsGraduatedDic(Dic isGraduatedDic)
    {
    	this.isGraduatedDic = isGraduatedDic;
    }

	public String getClassInfo() 
	{
		return classInfo;
	}

	public void setClassInfo(String classInfo) 
	{
		this.classInfo = classInfo;
	}

	public Dic getGraduatedYearDic()
    {
    	return graduatedYearDic;
    }

	public void setGraduatedYearDic(Dic graduatedYearDic)
    {
    	this.graduatedYearDic = graduatedYearDic;
    }

}
