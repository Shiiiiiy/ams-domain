package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;

/**
 * @className EmploymentSchemeClassView.java
 * @package com.uws.domain.job
 * @description
 * @date 2016-1-6  下午4:25:26
 */
public class EmploymentSchemeCollegeView extends EmploymentSchemeView implements Serializable{
	private static final long serialVersionUID = -2378934471761096263L;
	private BaseAcademyModel college;
	public BaseAcademyModel getCollege() {
		return college;
	}
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
}
