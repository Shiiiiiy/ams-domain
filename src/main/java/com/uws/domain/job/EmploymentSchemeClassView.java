package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseClassModel;
import com.uws.sys.model.Dic;

/**
 * @className EmploymentSchemeClassView.java
 * @package com.uws.domain.job
 * @description
 * @date 2016-1-6  下午4:25:26
 */
public class EmploymentSchemeClassView extends EmploymentSchemeView implements Serializable{
	private static final long serialVersionUID = -3216430353807805255L;
	private BaseClassModel clazz;
	public BaseClassModel getClazz() {
		return clazz;
	}
	public void setClazz(BaseClassModel clazz) {
		this.clazz = clazz;
	}
}
