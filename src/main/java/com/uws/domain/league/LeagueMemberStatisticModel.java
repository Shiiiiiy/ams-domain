package com.uws.domain.league;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
/**
 * 团员统计实体类
 */
public class LeagueMemberStatisticModel extends BaseModel {

	
	private static final long serialVersionUID = 8284166956304132361L;
	/**
	 * 学院
	 */
	private BaseAcademyModel college;
	/**
	 * 团员人数
	 */
	private int membernums;
	/**
	 * 预备党员员人数
	 */
	private int  probationarynums;
	/**
	 * 党员人数
	 */
	private int partynums;
	/**
	 * 获得荣誉人数
	 */
	private int honurnums;
	/**
	 *参加团干培训人数
	 */
	private int trainingnums;
	/**
	 * 推优人数
	 */
	private int recommendnums;
	
	public BaseAcademyModel getCollege() {
		return college;
	}
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	public int getMembernums() {
		return membernums;
	}
	public void setMembernums(int membernums) {
		this.membernums = membernums;
	}
	public int getTrainingnums() {
		return trainingnums;
	}
	public void setTrainingnums(int trainingnums) {
		this.trainingnums = trainingnums;
	}
	public int getRecommendnums() {
		return recommendnums;
	}
	public void setRecommendnums(int recommendnums) {
		this.recommendnums = recommendnums;
	}
	public int getHonurnums() {
		return honurnums;
	}
	public void setHonurnums(int honurnums) {
		this.honurnums = honurnums;
	}
	public int getProbationarynums() {
		return probationarynums;
	}
	public void setProbationarynums(int probationarynums) {
		this.probationarynums = probationarynums;
	}
	public int getPartynums() {
		return partynums;
	}
	public void setPartynums(int partynums) {
		this.partynums = partynums;
	}
	
}
