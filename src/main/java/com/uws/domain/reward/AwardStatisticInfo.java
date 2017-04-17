package com.uws.domain.reward;

import com.uws.core.base.BaseModel;

/** 
* @ClassName: AwardStatisticInfo 
* @Description: TODO 评奖评优统计信息 
* @author zhangyb 
* @date 2015年9月10日 上午11:27:32  
*/
public class AwardStatisticInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 一等奖人数
	 */
	private String firstAwardNum;
	
	/**
	 * 二等奖人数
	 */
	private String secondAwardNum;
	
	/**
	 * 三等奖人数
	 */
	private String thirdAwardNum;
	
	/**
	 * 三好学生人数
	 */
	private String threeGoodNum;
	
	/**
	 * 优秀学生干部人数
	 */
	private String stuLeaderNum;
	
	/**
	 * 先进班集体数量
	 */
	private String goodClassNum;

	public String getFirstAwardNum() {
		return firstAwardNum;
	}

	public void setFirstAwardNum(String firstAwardNum) {
		this.firstAwardNum = firstAwardNum;
	}

	public String getSecondAwardNum() {
		return secondAwardNum;
	}

	public void setSecondAwardNum(String secondAwardNum) {
		this.secondAwardNum = secondAwardNum;
	}

	public String getThirdAwardNum() {
		return thirdAwardNum;
	}

	public void setThirdAwardNum(String thirdAwardNum) {
		this.thirdAwardNum = thirdAwardNum;
	}

	public String getThreeGoodNum() {
		return threeGoodNum;
	}

	public void setThreeGoodNum(String threeGoodNum) {
		this.threeGoodNum = threeGoodNum;
	}

	public String getStuLeaderNum() {
		return stuLeaderNum;
	}

	public void setStuLeaderNum(String stuLeaderNum) {
		this.stuLeaderNum = stuLeaderNum;
	}

	public String getGoodClassNum() {
		return goodClassNum;
	}

	public void setGoodClassNum(String goodClassNum) {
		this.goodClassNum = goodClassNum;
	}

}
