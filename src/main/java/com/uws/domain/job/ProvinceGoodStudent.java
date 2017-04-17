package com.uws.domain.job;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;
/**
 * 校优秀毕业生实体 ProvinceGoodStudent
 * @author pc
 *
 */
public class ProvinceGoodStudent extends BaseModel
{ 
    /**
     * 
     */
	private static final long serialVersionUID = -6494751908623589320L;
	    
	  //校优秀毕业生实体对象
	private SchoolGoodStudent schoolGoodStudent;
	  //状态
	private Dic status;
	  //审核意见
	private String approveReason;
	  //本人简历
	private String resume;
	  //主要事迹
	private String mainStory;
	//学生信息完善判断  1=提交 0=保存
	private String flag;
	
	//查询用
    private BaseAcademyModel college;
	private BaseMajorModel major;
	private BaseClassModel classId;
  
	public SchoolGoodStudent getSchoolGoodStudent()
	{
		return schoolGoodStudent;
	}
	public void setSchoolGoodStudent(SchoolGoodStudent schoolGoodStudent)
	{
		this.schoolGoodStudent = schoolGoodStudent;
	}
	public Dic getStatus()
	{
		return status;
	}
	public void setStatus(Dic status)
	{
		this.status = status;
	}
	public String getResume()
	{
		return resume;
	}
	public void setResume(String resume)
	{
		this.resume = resume;
	}
	public String getMainStory()
	{
		return mainStory;
	}
	public void setMainStory(String mainStory)
	{
		this.mainStory = mainStory;
	}
	public String getApproveReason()
    {
    	return approveReason;
    }
	public void setApproveReason(String approveReason)
    {
    	this.approveReason = approveReason;
    }
	public String getFlag()
    {
    	return flag;
    }
	public void setFlag(String flag)
    {
    	this.flag = flag;
    }
	public BaseAcademyModel getCollege()
    {
    	return college;
    }
	public void setCollege(BaseAcademyModel college)
    {
    	this.college = college;
    }
	public BaseMajorModel getMajor()
    {
    	return major;
    }
	public void setMajor(BaseMajorModel major)
    {
    	this.major = major;
    }
	public BaseClassModel getClassId()
    {
    	return classId;
    }
	public void setClassId(BaseClassModel classId)
    {
    	this.classId = classId;
    }
	
  
  
}
