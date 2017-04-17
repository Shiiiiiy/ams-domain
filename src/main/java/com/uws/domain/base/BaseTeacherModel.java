package com.uws.domain.base;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Org;

/**
 * 
 * @ClassName: BaseTeacherModel
 * @Description: 教职工同步数据
 * @author 联合永道
 * @date 2015-8-7 上午10:57:45
 * 
 */
public class BaseTeacherModel extends BaseModel
{
	private static final long serialVersionUID = -336888188985390268L;

	private String name;
	private String code;
	private Org org; 			//组织机构，所属单位
	private Dic gender;			//性别
	private Date birthday;		//出生日期
	private String nativePlace;	//籍贯
	private String nation;		//民族 
	private String idNumber;	//身份证号 
	private String studyLevel;	//学历级别
	private String degreeName;	//文化程度
	private String workHireDate;//工作入职日期
	private String status;		//

	
	public String teacherInfo;
	
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

	public Dic getGender()
	{
		return gender;
	}

	public void setGender(Dic gender)
	{
		this.gender = gender;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String getNativePlace()
	{
		return nativePlace;
	}

	public void setNativePlace(String nativePlace)
	{
		this.nativePlace = nativePlace;
	}

	public String getNation()
	{
		return nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	public String getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}

	public String getStudyLevel()
	{
		return studyLevel;
	}

	public void setStudyLevel(String studyLevel)
	{
		this.studyLevel = studyLevel;
	}

	public String getDegreeName()
	{
		return degreeName;
	}

	public void setDegreeName(String degreeName)
	{
		this.degreeName = degreeName;
	}

	public String getWorkHireDate()
	{
		return workHireDate;
	}

	public void setWorkHireDate(String workHireDate)
	{
		this.workHireDate = workHireDate;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getTeacherInfo()
    {
    	return teacherInfo;
    }

	public void setTeacherInfo(String teacherInfo)
    {
    	this.teacherInfo = teacherInfo;
    }

}
