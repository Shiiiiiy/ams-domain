package com.uws.domain.warning;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
/**
 * 
 * @author 心理预警实体类 PsychologyWarning
 *
 */
public class PsychologyWarning extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = -5312085823002674242L;
    private String number;//序号
    //学生信息实体
    private StudentInfoModel student;
    private String stuNumber;//学号用于导入
    //独生子女（是/否）
    private Dic onlyChild;
    //童年寄养经历（有 /无）
    private Dic childFoster;
    //心理问题类型评估（添加具体类型）
    private Dic psychologyAssessment;
    //问题程度评估（一般；较重；严重；）
    private Dic problemAssessment;
    //是否因心理疾病住院或服药(住院/服药)
    private Dic isHospitalMedication;
    //危险行为评估（轻度/中度及以上 )
    private Dic dangerAssessment;
    //学院关注意见（重点/一般）
    private Dic collegeOpinion;
    //心理中心关注意见（重点/一般）
    private Dic psychologyOpinion;
    //备注
    private String comments;
    
    
    
	public StudentInfoModel getStudent()
    {
    	return student;
    }
	public void setStudent(StudentInfoModel student)
    {
    	this.student = student;
    }
	public Dic getOnlyChild()
    {
    	return onlyChild;
    }
	public void setOnlyChild(Dic onlyChild)
    {
    	this.onlyChild = onlyChild;
    }
	public Dic getChildFoster()
    {
    	return childFoster;
    }
	public void setChildFoster(Dic childFoster)
    {
    	this.childFoster = childFoster;
    }
	
	public Dic getPsychologyAssessment()
    {
    	return psychologyAssessment;
    }
	public void setPsychologyAssessment(Dic psychologyAssessment)
    {
    	this.psychologyAssessment = psychologyAssessment;
    }
	public Dic getProblemAssessment()
    {
    	return problemAssessment;
    }
	public void setProblemAssessment(Dic problemAssessment)
    {
    	this.problemAssessment = problemAssessment;
    }
	public Dic getDangerAssessment()
    {
    	return dangerAssessment;
    }
	public void setDangerAssessment(Dic dangerAssessment)
    {
    	this.dangerAssessment = dangerAssessment;
    }
	public Dic getCollegeOpinion()
    {
    	return collegeOpinion;
    }
	public void setCollegeOpinion(Dic collegeOpinion)
    {
    	this.collegeOpinion = collegeOpinion;
    }
	public Dic getPsychologyOpinion()
    {
    	return psychologyOpinion;
    }
	public void setPsychologyOpinion(Dic psychologyOpinion)
    {
    	this.psychologyOpinion = psychologyOpinion;
    }
	public Dic getIsHospitalMedication()
    {
    	return isHospitalMedication;
    }
	public void setIsHospitalMedication(Dic isHospitalMedication)
    {
    	this.isHospitalMedication = isHospitalMedication;
    }
	public String getComments()
    {
    	return comments;
    }
	public void setComments(String comments)
    {
    	this.comments = comments;
    }
	public String getStuNumber()
    {
    	return stuNumber;
    }
	public void setStuNumber(String stuNumber)
    {
    	this.stuNumber = stuNumber;
    }
	public String getNumber()
    {
    	return number;
    }
	public void setNumber(String number)
    {
    	this.number = number;
    }
    
    
    
}
