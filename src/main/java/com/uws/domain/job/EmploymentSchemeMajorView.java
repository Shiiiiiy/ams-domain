package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;

/**
 * @className EmploymentSchemeClassView.java
 * @package com.uws.domain.job
 * @description
 * @date 2016-1-6  下午4:25:26
 */
public class EmploymentSchemeMajorView extends EmploymentSchemeView implements Serializable{
	private static final long serialVersionUID = -1646740037353958970L;
	private BaseMajorModel major;
	public BaseMajorModel getMajor() {
		return major;
	}
	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}
}
