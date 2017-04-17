package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;

/**
 * @className ProvinceGoodStudentCollegeView.java
 * @package com.uws.domain.job
 * @description 校优秀毕业生按学院统计视图
 * @date 2015-11-16  下午5:48:55
 */
public class ProvinceGoodStudentCollegeView implements Serializable {
	
	/**
     * 
     */
    private static final long serialVersionUID = 7373784866830364100L;
    
	private Dic schoolYear;
	private BaseAcademyModel college;
	private Long approvePassNum;
	private Long approveRejectNum;
	private Long total;
	
	
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public BaseAcademyModel getCollege() {
		return college;
	}
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
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
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + ((schoolYear == null) ? 0 : schoolYear.hashCode());
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
		ProvinceGoodStudentCollegeView other = (ProvinceGoodStudentCollegeView) obj;
		if(college == null) {
			  if(other.college != null)
				return false;
		}else if(!college.equals(other.college))
			    return false;
		if(schoolYear == null) {
			  if(other.schoolYear != null)
				return false;
		}else if(!schoolYear.equals(other.schoolYear))
			    return false;
		   return true;
	}
}
