package com.uws.domain.teacher;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.domain.orientation.StudentInfoModel;

/**
 * @author houyue
 * @version:2015年8月25日 10:49:05
 * @Description:班级信息视图
 */
public class SetClassTeacher extends BaseModel
{

	private static final long serialVersionUID = -275698981866084908L;

	/**
	 * 班级
	 */
	private BaseClassModel klass;
	/**
	 * 年级
	 */
	private String grade;

	/**
	 * 专业
	 */
	private BaseMajorModel major;
	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	/**
	 * 班主任
	 */
	private BaseTeacherModel headMaster;
	private String headMasterName;
	/**
	 * 教学辅导员
	 */
	private BaseTeacherModel teacherCounsellor;
	private String teacherCounsellorName;

	private StudentInfoModel monitor;
	private String monitorName;

	public BaseClassModel getKlass()
	{
		return klass;
	}

	public void setKlass(BaseClassModel klass)
	{
		this.klass = klass;
	}

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public BaseMajorModel getMajor()
	{
		return major;
	}

	public void setMajor(BaseMajorModel major)
	{
		this.major = major;
	}

	public BaseAcademyModel getCollege()
	{
		return college;
	}

	public void setCollege(BaseAcademyModel college)
	{
		this.college = college;
	}

	public BaseTeacherModel getHeadMaster()
	{
		return headMaster;
	}

	public void setHeadMaster(BaseTeacherModel headMaster)
	{
		this.headMaster = headMaster;
	}

	public BaseTeacherModel getTeacherCounsellor()
	{
		return teacherCounsellor;
	}

	public void setTeacherCounsellor(BaseTeacherModel teacherCounsellor)
	{
		this.teacherCounsellor = teacherCounsellor;
	}

	public StudentInfoModel getMonitor()
	{
		return monitor;
	}

	public void setMonitor(StudentInfoModel monitor)
	{
		this.monitor = monitor;
	}

	public String getHeadMasterName()
	{
		return headMasterName;
	}

	public void setHeadMasterName(String headMasterName)
	{
		this.headMasterName = headMasterName;
	}

	public String getTeacherCounsellorName()
	{
		return teacherCounsellorName;
	}

	public void setTeacherCounsellorName(String teacherCounsellorName)
	{
		this.teacherCounsellorName = teacherCounsellorName;
	}

	public String getMonitorName()
	{
		return monitorName;
	}

	public void setMonitorName(String monitorName)
	{
		this.monitorName = monitorName;
	}

}