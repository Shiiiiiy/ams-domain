package com.uws.domain.reward;

import java.util.List;
import com.uws.core.base.BaseModel;

/**
 * @author zhangyb
 * @version:2015年8月11日 上午11:03:05
 * @Description:评优条件
 */
public class AwardCondition extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评优类型ID
	 */
	private AwardType awardId;
	
	/**
	 * 二级奖项名称
	 */
	private String secondAwardName;
	
	/**
	 * 单项奖名称
	 */
	private String singleAwardName;
	
	/**
	 * 评优条件明细List
	 */
	private List<ConditionInfo> conInfoList;
	
	/**
	 * 评优限额明细List
	 */
	private List<QuotaInfo> quotaInfoList;

	public AwardType getAwardId() {
		return awardId;
	}

	public void setAwardId(AwardType awardId) {
		this.awardId = awardId;
	}

	public String getSecondAwardName() {
		return secondAwardName;
	}

	public void setSecondAwardName(String secondAwardName) {
		this.secondAwardName = secondAwardName;
	}

	public String getSingleAwardName() {
		return singleAwardName;
	}

	public void setSingleAwardName(String singleAwardName) {
		this.singleAwardName = singleAwardName;
	}

	public List<ConditionInfo> getConInfoList() {
		return conInfoList;
	}

	public void setConInfoList(List<ConditionInfo> conInfoList) {
		this.conInfoList = conInfoList;
	}

	public List<QuotaInfo> getQuotaInfoList() {
		return quotaInfoList;
	}

	public void setQuotaInfoList(List<QuotaInfo> quotaInfoList) {
		this.quotaInfoList = quotaInfoList;
	}
	


}
