package com.uws.domain.reward;

import com.uws.core.base.BaseModel;

/**
 * @author zhangyb
 * @version:2015年8月11日 上午11:10:09
 * @Description:评优条件明细
 */
public class ConditionInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评优条件ID
	 */
	private AwardCondition conditionId;
	
	/**
	 * 条件名称
	 */
	private String conditionName;
	
	/**
	 * 条件所需值
	 */
	private String conditionValue;
	
	/**
	 * 条件文本名称
	 */
	private String textName;
	
	/**
	 * 比较方式
	 */
	private String compareMethod;
	
	/**
	 * 是否作为可比较条件：Y为是N为否
	 */
	private String checkOrNot;

	public AwardCondition getConditionId() {
		return conditionId;
	}

	public void setConditionId(AwardCondition conditionId) {
		this.conditionId = conditionId;
	}

	public String getConditionName() {
		return conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	public String getConditionValue() {
		return conditionValue;
	}

	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}

	public String getTextName() {
		return textName;
	}

	public void setTextName(String textName) {
		this.textName = textName;
	}

	public String getCompareMethod() {
		return compareMethod;
	}

	public void setCompareMethod(String compareMethod) {
		this.compareMethod = compareMethod;
	}

	public String getCheckOrNot() {
		return checkOrNot;
	}

	public void setCheckOrNot(String checkOrNot) {
		this.checkOrNot = checkOrNot;
	}
	

}
