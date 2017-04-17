package com.uws.domain.orientation;

import com.uws.domain.base.BaseAcademyModel;

/**
 * 用于实时报到页面传值
 * @author z
 *
 */
public class CollegeRegistedVo {
	//学院
	private BaseAcademyModel college;
	//报到人数
	private Integer registedNum;
	//录取人数
	private Integer totalNum;
	/**
	 * 学院get()方法
	 * @return BaseAcademyModel
	 */
	public BaseAcademyModel getCollege() {
		return college;
	}
	/**
	 * 学院set()方法 
	 * @param college
	 */
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	/**
	 * 报到人数get()方法
	 * @return
	 */
	public Integer getRegistedNum() {
		return registedNum;
	}
	/**
	 * 报到人数set()方法
	 * @param registedNum
	 */
	public void setRegistedNum(Integer registedNum) {
		this.registedNum = registedNum;
	}
	/**
	 * 录取人数get()方法
	 * @return
	 */
	public Integer getTotalNum() {
		return totalNum;
	}
	/**
	 * 录取人数set()方法
	 * @param totalNum
	 */
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
}
