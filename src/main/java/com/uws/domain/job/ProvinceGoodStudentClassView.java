package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseClassModel;
import com.uws.sys.model.Dic;

/**
 * @className ProvinceGoodStudentClassView.java
 * @package com.uws.domain.job
 * @description 按班级统计视图
 * @date 2015-11-19
 */
public class ProvinceGoodStudentClassView implements Serializable {
	private static final long serialVersionUID = 9133505539671851826L;
	private BaseClassModel classModel;
	private Dic schoolYear;
	private Long approvePassNum;
	private Long approveRejectNum;
	private Long total;
	
	
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
		ProvinceGoodStudentClassView other = (ProvinceGoodStudentClassView) obj;
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
