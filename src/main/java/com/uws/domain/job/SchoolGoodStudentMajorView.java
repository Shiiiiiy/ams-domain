package com.uws.domain.job;

import java.io.Serializable;
import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;

/**
 * @className SchoolGoodStudentMajorViewID.java
 * @package com.uws.domain.job
 * @description 按专业统计视图
 * @date 2015-11-17  下午3:04:19
 */
public class SchoolGoodStudentMajorView implements Serializable {
	private static final long serialVersionUID = -414770263067320566L;
	private BaseMajorModel major;
	private Dic schoolYear;
	private Long approvePassNum;
	private Long approveRejectNum;
	private Long total;
	public BaseMajorModel getMajor() {
		return major;
	}
	public void setMajor(BaseMajorModel major) {
		this.major = major;
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
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((schoolYear == null) ? 0 : schoolYear.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchoolGoodStudentMajorView other = (SchoolGoodStudentMajorView) obj;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (schoolYear == null) {
			if (other.schoolYear != null)
				return false;
		} else if (!schoolYear.equals(other.schoolYear))
			return false;
		return true;
	}
}
