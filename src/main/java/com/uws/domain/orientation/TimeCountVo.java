package com.uws.domain.orientation;

import java.util.List;

/**
 * 用于分时（实时）查询页面传值
 * @author z
 *
 */
public class TimeCountVo {
	//时间段
	private String timeLine;
	//报到地点列表
	private List<PlaceCountVo> listPlaceCount;
	//报到人数
	private Integer reportNum;
	//总人数
	private Integer totalNum;
	/**
	 * 报到人数get()方法
	 * @return
	 */
	public Integer getReportNum() {
		return reportNum;
	}
	/**
	 * 报到人数set()方法
	 * @param reportNum
	 */
	public void setReportNum(Integer reportNum) {
		this.reportNum = reportNum;
	}
	/**
	 * 总人数get()方法
	 * @return
	 */
	public Integer getTotalNum() {
		return totalNum;
	}
	/**
	 * 总人数set()方法
	 * @param totalNum
	 */
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * 时间段get方法
	 * @return
	 */
	public String getTimeLine() {
		return timeLine;
	}
	/**
	 * 时间段set方法
	 * @param timeLine
	 */
	public void setTimeLine(String timeLine) {
		this.timeLine = timeLine;
	}
	/**
	 * 报到地点列表get方法
	 * @return
	 */
	public List<PlaceCountVo> getListPlaceCount() {
		return listPlaceCount;
	}
	/**
	 * 报到地点列表get方法
	 * @param listPlaceCount
	 */
	public void setListPlaceCount(List<PlaceCountVo> listPlaceCount) {
		this.listPlaceCount = listPlaceCount;
	}
}
