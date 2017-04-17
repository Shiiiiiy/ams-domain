package com.uws.domain.warning;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;

/**
 * 
 * @ClassName: StudyWarningModel
 * @Description: 学业预警详细信息
 * @author 联合永道
 * @date 2016-1-18 上午11:07:19
 * 
 */
public class StudyWarningModel extends BaseModel
{
	private static final long serialVersionUID = 3043029470619555726L;
	private StudentInfoModel student; // 预计学生
	private String studyWarning;// 学籍预警描述（存储文本）
	private Date warningDate;// 导入时间
	private String creator;// 创建人，导入人
	
	//学号,导入用
	private String studentNumber;

	public StudentInfoModel getStudent()
	{
		return student;
	}

	public void setStudent(StudentInfoModel student)
	{
		this.student = student;
	}

	public String getStudyWarning()
	{
		return studyWarning;
	}

	public void setStudyWarning(String studyWarning)
	{
		this.studyWarning = studyWarning;
	}

	public Date getWarningDate()
	{
		return warningDate;
	}

	public void setWarningDate(Date warningDate)
	{
		this.warningDate = warningDate;
	}

	public String getCreator()
	{
		return creator;
	}

	public void setCreator(String creator)
	{
		this.creator = creator;
	}

	public String getStudentNumber()
    {
    	return studentNumber;
    }

	public void setStudentNumber(String studentNumber)
    {
    	this.studentNumber = studentNumber;
    }

}
