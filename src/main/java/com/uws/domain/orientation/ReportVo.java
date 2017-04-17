package com.uws.domain.orientation;

/**
 * 用于报到统计页面传值（存储各省份的录取人数与报到人数）
 * @author z
 *
 */
public class ReportVo {
	//录取总人数
	private Long totalNum;
	//报到人数
	private Long reportedNum;
	//序列
	private Long index;
	/**
	 * 录取总人数get方法
	 * @return
	 */
	public Long getTotalNum() {
		return totalNum;
	}
	/**
	 * 录取总人数set方法
	 * @param totalNum
	 */
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * 报到人数get方法
	 * @return
	 */
	public Long getReportedNum() {
		return reportedNum;
	}
	/**
	 * 报到人数set方法
	 * @param reportedNum
	 */
	public void setReportedNum(Long reportedNum) {
		this.reportedNum = reportedNum;
	}
	/**
	 * 序列get()方法
	 * @return the index
	 */
	public Long getIndex() {
		return index;
	}
	/**
	 * 序列set()方法
	 * @param index the index to set
	 */
	public void setIndex(Long index) {
		this.index = index;
	}
	
}
