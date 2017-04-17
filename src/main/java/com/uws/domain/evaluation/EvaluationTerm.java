package com.uws.domain.evaluation;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @Description 综合测评测评学期设置
 * @author Jiangbl
 * @date 2015-8-13
 */
public class EvaluationTerm extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 学期
	 */
	private Dic term;
	
	/**
	 * 月份
	 */
	private Dic month;

	public Dic getTerm() {
		return term;
	}

	public void setTerm(Dic term) {
		this.term = term;
	}

	public Dic getMonth() {
		return month;
	}

	public void setMonth(Dic month) {
		this.month = month;
	}	
}
