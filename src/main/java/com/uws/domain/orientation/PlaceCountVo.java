package com.uws.domain.orientation;

import com.uws.sys.model.Dic;

/**
 * 用于页面传值（各报到点统计）
 * @author z
 *
 */
public class PlaceCountVo {
	//地点字典
	private Dic place;
	//总人数
	private Integer num;
	//已报到人数
	private Integer reportNum;
	/**
	 * 地点字典get方法
	 * @return
	 */
	public Dic getPlace() {
		return place;
	}
	/**
	 * 地点字典set方法
	 * @param place
	 */
	public void setPlace(Dic place) {
		this.place = place;
	}
	/**
	 * 总人数get方法
	 * @return
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 *  总人数set方法
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 已报到人数get方法
	 * @return the reportNum
	 */
	public Integer getReportNum() {
		return reportNum;
	}
	/**
	 * 已报到人数set方法
	 * @param reportNum the reportNum to set
	 */
	public void setReportNum(Integer reportNum) {
		this.reportNum = reportNum;
	}
}
