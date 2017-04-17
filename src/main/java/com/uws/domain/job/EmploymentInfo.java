package com.uws.domain.job;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
/**
 * EmploymentInfo 就业管理信息model
 * @author liuchen 
 *
 */
public class EmploymentInfo extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = -2197552859400071994L;
    
    private StudentInfoModel student;
    private String stuNumber;//学号用于导入
    private String schoolCode; //学校代码
    private String majorFrom; //专业方向
    private String examNumber;  //考生号
    private String sourceLandCode;//生源地代码
    private Dic education;       //学历
    private Dic schoolLength;    //学制
    private Dic isWork;         //是否在职
    private Dic normalType;    //师范生类别
    private Dic isIndependent; //是否独立
    private Dic cultureType;  //培养方式
    private Dic recruitStudentType;  //招生类别
    private String directional;     //定向或委培单位
    private Dic difficultType;   //困难类别
    private Date graduationYear; //毕业年份
    private Dic schoolYear;
    private Date enterDate; //入学年月
    private String enterTime;
    private Date graduateDate;//毕业年月
    private String graduateTime;
    private BaseAcademyModel strCollege;
   	private BaseMajorModel strMajor;
   	private BaseClassModel strClassId;
    
	public StudentInfoModel getStudent()
    {
    	return student;
    }
	public void setStudent(StudentInfoModel student)
    {
    	this.student = student;
    }
	public Dic getSchoolYear()
    {
    	return schoolYear;
    }
	public void setSchoolYear(Dic schoolYear)
    {
    	this.schoolYear = schoolYear;
    }
	public String getSchoolCode()
    {
    	return schoolCode;
    }
	public void setSchoolCode(String schoolCode)
    {
    	this.schoolCode = schoolCode;
    }
	public String getMajorFrom()
    {
    	return majorFrom;
    }
	public void setMajorFrom(String majorFrom)
    {
    	this.majorFrom = majorFrom;
    }
	public String getExamNumber()
    {
    	return examNumber;
    }
	public void setExamNumber(String examNumber)
    {
    	this.examNumber = examNumber;
    }
	
	public String getSourceLandCode()
    {
    	return sourceLandCode;
    }
	public void setSourceLandCode(String sourceLandCode)
    {
    	this.sourceLandCode = sourceLandCode;
    }
	public Dic getEducation()
    {
    	return education;
    }
	public void setEducation(Dic education)
    {
    	this.education = education;
    }
	
	public Dic getSchoolLength()
    {
    	return schoolLength;
    }
	public void setSchoolLength(Dic schoolLength)
    {
    	this.schoolLength = schoolLength;
    }
	public Dic getIsWork()
    {
    	return isWork;
    }
	public void setIsWork(Dic isWork)
    {
    	this.isWork = isWork;
    }
	public Dic getNormalType()
    {
    	return normalType;
    }
	public void setNormalType(Dic normalType)
    {
    	this.normalType = normalType;
    }
	public Dic getIsIndependent()
    {
    	return isIndependent;
    }
	public void setIsIndependent(Dic isIndependent)
    {
    	this.isIndependent = isIndependent;
    }
	public Dic getCultureType()
    {
    	return cultureType;
    }
	public void setCultureType(Dic cultureType)
    {
    	this.cultureType = cultureType;
    }
	public Dic getRecruitStudentType()
    {
    	return recruitStudentType;
    }
	public void setRecruitStudentType(Dic recruitStudentType)
    {
    	this.recruitStudentType = recruitStudentType;
    }
	public String getDirectional()
    {
    	return directional;
    }
	public void setDirectional(String directional)
    {
    	this.directional = directional;
    }
	public Dic getDifficultType()
    {
    	return difficultType;
    }
	public void setDifficultType(Dic difficultType)
    {
    	this.difficultType = difficultType;
    }
	public Date getGraduationYear()
    {
    	return graduationYear;
    }
	public void setGraduationYear(Date graduationYear)
    {
    	this.graduationYear = graduationYear;
    }
	public String getStuNumber()
    {
    	return stuNumber;
    }
	public void setStuNumber(String stuNumber)
    {
    	this.stuNumber = stuNumber;
    }
	public BaseAcademyModel getStrCollege()
    {
    	return strCollege;
    }
	public void setStrCollege(BaseAcademyModel strCollege)
    {
    	this.strCollege = strCollege;
    }
	public BaseMajorModel getStrMajor()
    {
    	return strMajor;
    }
	public void setStrMajor(BaseMajorModel strMajor)
    {
    	this.strMajor = strMajor;
    }
	public BaseClassModel getStrClassId()
    {
    	return strClassId;
    }
	public void setStrClassId(BaseClassModel strClassId)
    {
    	this.strClassId = strClassId;
    }
	public Date getEnterDate()
    {
    	return enterDate;
    }
	public void setEnterDate(Date enterDate)
    {
    	this.enterDate = enterDate;
    }
	public Date getGraduateDate()
    {
    	return graduateDate;
    }
	public void setGraduateDate(Date graduateDate)
    {
    	this.graduateDate = graduateDate;
    }
	public String getEnterTime()
    {
    	return enterTime;
    }
	public void setEnterTime(String enterTime)
    {
    	this.enterTime = enterTime;
    }
	public String getGraduateTime()
    {
    	return graduateTime;
    }
	public void setGraduateTime(String graduateTime)
    {
    	this.graduateTime = graduateTime;
    }
    
    

    
	
	
    
    
}
