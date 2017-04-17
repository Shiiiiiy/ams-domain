package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;

/**
 * @author zhangyb
 * @version:2015年8月11日 上午11:15:32
 * @Description:评优条件人员限额明细
 */
public class QuotaInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评优条件ID
	 */
	private AwardCondition conditionId;
	
	/**
	 * 学院ID
	 */
	private BaseAcademyModel academyId;
	
	/**
	 * 分配的名额数
	 */
	private String num;
	
	/**
	 * 分配的金额
	 */
	private String amount;

	public AwardCondition getConditionId() {
		return conditionId;
	}

	public void setConditionId(AwardCondition conditionId) {
		this.conditionId = conditionId;
	}

	public BaseAcademyModel getAcademyId() {
		return academyId;
	}

	public void setAcademyId(BaseAcademyModel academyId) {
		this.academyId = academyId;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}
