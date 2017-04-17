package com.uws.domain.question;

import com.uws.core.base.BaseModel;

/**
 * 问卷统计—选项实体类（临时）
 */
public class QuestionStatisticOptionModel  extends BaseModel{
	
	private static final long serialVersionUID = -6959147168004066735L;

	/**
	 * 选项基本信息
	 */
	private QuestionOptionModel option;
	
	/**
	 * 选择人数
	 */
	private long num;	
	
	/**
	 * 占比
	 */
	private String percent;

	public QuestionOptionModel getOption() {
		return option;
	}

	public void setOption(QuestionOptionModel option) {
		this.option = option;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}
	
}
