package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.domain.sponsor.DifficultStudentInfo;
import com.uws.sys.model.Dic;
/**
 * 双困生实体类 PoorStudent 
 * @author pc
 *
 */
public class PoorStudent extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = -2003206047981775633L;
    //困难生实体
    private DifficultStudentInfo difficultStudentInfo;
    //学生对象
    private StudentInfoModel studentInfo;
    //学年
    private Dic schoolYear;
    //困难类别
    private Dic difficultType; 
    //是否就业困难
    private Dic isJobDifficult;
    //其他困难
    private Dic otherDifficult;
    //困难原因
    private String reason;
    //状态（保存，待审核，审核通过，审核不通过）
    private Dic status;
    //审核意见
    private String approveReason;
    //查询用
    private BaseAcademyModel strCollege;
   	private BaseMajorModel strMajor;
   	private BaseClassModel strClassId;
	
	
	/**
	 * 
	 * @Title: PoorStudent.java 
	 * @Package com.uws.domain.job 
	 * @Description:get() 和set（）
	 * @author LiuChen 
	 * @date 2015-12-8 下午7:10:05
	 */
	public DifficultStudentInfo getDifficultStudentInfo()
    {
    	return difficultStudentInfo;
    }
	public void setDifficultStudentInfo(DifficultStudentInfo difficultStudentInfo)
    {
    	this.difficultStudentInfo = difficultStudentInfo;
    }
	public Dic getIsJobDifficult()
    {
    	return isJobDifficult;
    }
	public void setIsJobDifficult(Dic isJobDifficult)
    {
    	this.isJobDifficult = isJobDifficult;
    }
	public Dic getOtherDifficult()
    {
    	return otherDifficult;
    }
	public void setOtherDifficult(Dic otherDifficult)
    {
    	this.otherDifficult = otherDifficult;
    }
	public String getReason()
    {
    	return reason;
    }
	public void setReason(String reason)
    {
    	this.reason = reason;
    }
	public Dic getStatus()
    {
    	return status;
    }
	public void setStatus(Dic status)
    {
    	this.status = status;
    }
	public String getApproveReason()
    {
    	return approveReason;
    }
	public void setApproveReason(String approveReason)
    {
    	this.approveReason = approveReason;
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
	public StudentInfoModel getStudentInfo()
    {
    	return studentInfo;
    }
	public void setStudentInfo(StudentInfoModel studentInfo)
    {
    	this.studentInfo = studentInfo;
    }
	public Dic getDifficultType()
    {
    	return difficultType;
    }
	public void setDifficultType(Dic difficultType)
    {
    	this.difficultType = difficultType;
    }
	public Dic getSchoolYear()
    {
    	return schoolYear;
    }
	public void setSchoolYear(Dic schoolYear)
    {
    	this.schoolYear = schoolYear;
    }
    

    
	
    
    
    

}
