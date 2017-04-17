package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseClassModel;
import com.uws.sys.model.Dic;

/**
 * @className ProvinceGoodStudentClassView.java
 * @package com.uws.domain.job
 * @description 双困生按班级统计视图
 * @date 2015-11-19
 */
public class PoorStudentClassView implements Serializable {
	private static final long serialVersionUID = 9133505539671851826L;
	private BaseClassModel classModel;
	private Dic schoolYear;
	private Long approvePassNum;
	private Long approveRejectNum;
	private Long total;
	private Long graduation_total;//毕业生总人数
	private Long job;  //就业困难人数
	private Long family;//家庭困难
	private Long job_family;//就业困难和家庭困难
	private Long disability;//残疾
	private Long job_disability;//就业困难和残疾
	private Long family_disability;//家庭困难和残疾
	private Long job_family_disability;//就业困难、家庭困难和残疾
	
	public BaseClassModel getClassModel()
    {
    	return classModel;
    }
	public void setClassModel(BaseClassModel classModel)
    {
    	this.classModel = classModel;
    }
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Long getApprovePassNum() {
		return approvePassNum;
	}
	public void setApprovePassNum(Long approvePassNum) {
		this.approvePassNum = approvePassNum;
	}
	public Long getApproveRejectNum() {
		return approveRejectNum;
	}
	public void setApproveRejectNum(Long approveRejectNum) {
		this.approveRejectNum = approveRejectNum;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	
	
	
	public Long getGraduation_total()
    {
    	return graduation_total;
    }
	public void setGraduation_total(Long graduation_total)
    {
    	this.graduation_total = graduation_total;
    }
	public Long getJob()
    {
    	return job;
    }
	public void setJob(Long job)
    {
    	this.job = job;
    }
	public Long getFamily()
    {
    	return family;
    }
	public void setFamily(Long family)
    {
    	this.family = family;
    }
	public Long getJob_family()
    {
    	return job_family;
    }
	public void setJob_family(Long job_family)
    {
    	this.job_family = job_family;
    }
	public Long getDisability()
    {
    	return disability;
    }
	public void setDisability(Long disability)
    {
    	this.disability = disability;
    }
	public Long getJob_disability()
    {
    	return job_disability;
    }
	public void setJob_disability(Long job_disability)
    {
    	this.job_disability = job_disability;
    }
	public Long getFamily_disability()
    {
    	return family_disability;
    }
	public void setFamily_disability(Long family_disability)
    {
    	this.family_disability = family_disability;
    }
	public Long getJob_family_disability()
    {
    	return job_family_disability;
    }
	public void setJob_family_disability(Long job_family_disability)
    {
    	this.job_family_disability = job_family_disability;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classModel == null) ? 0 : classModel.hashCode());
		result = prime * result
				+ ((schoolYear == null) ? 0 : schoolYear.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		PoorStudentClassView other = (PoorStudentClassView) obj;
		if(classModel == null) {
			if (other.classModel != null)
				return false;
		}else if (!classModel.equals(other.classModel))
			return false;
		if(schoolYear == null) {
			if (other.schoolYear != null)
				return false;
		}else if (!schoolYear.equals(other.schoolYear))
			return false;
		return true;
	}
}
