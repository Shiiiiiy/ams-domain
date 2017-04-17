package com.uws.domain.integrate;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @ClassName: BaseClassModel
 * @Description: 审核班长设置 视图表
 * @author 联合永道
 * @date 2015-7-13 下午2:32:16
 * 
 */
public class ClassMonitorSetModel extends BaseModel
{
	private static final long serialVersionUID = -6091488734580179053L;

	private String className; // 班级民称
	private String code; // 班号
	private BaseMajorModel major; // 专业
	private String grade; // 年级
	private StudentInfoModel monitor; // 班长
	private BaseTeacherModel headermaster; //班主任
	private String setId;//设置Id
	private StudentInfoModel student;
	private Dic status;
	
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

	public String getSetId() {
		return setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

	
}
