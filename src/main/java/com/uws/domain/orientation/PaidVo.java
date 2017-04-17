package com.uws.domain.orientation;

import com.uws.domain.base.BaseAcademyModel;

/**
 * 用于缴费页面传值
 * @author z
 *
 */
public class PaidVo {
	//学院
	private BaseAcademyModel college;
	
	//总人数
	private Integer total;
	//已缴费
	private Integer paid;
	//未交费
	private Integer unpaid;
	//绿色通道
	private Integer green;
	/**
	 * 总人数get方法
	 * @return
	 */
	public Integer getTotal() {
		return total;
	}
	/**
	 * 总人数set方法
	 * @param tatal
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
	/**
	 * 已缴费人数get方法
	 * @return
	 */
	public Integer getPaid() {
		return paid;
	}
	/**
	 * 已缴费人数set方法
	 * @param paid
	 */
	public void setPaid(Integer paid) {
		this.paid = paid;
	}
	/**
	 * 未交费人数get方法
	 * @return
	 */
	public Integer getUnpaid() {
		return unpaid;
	}
	/**
	 * 未交费人数set方法
	 * @param unpaid
	 */
	public void setUnpaid(Integer unpaid) {
		this.unpaid = unpaid;
	}
	/**
	 * 绿色通道人数get方法
	 * @return
	 */
	public Integer getGreen() {
		return green;
	}
	/**
	 * 绿色通道人数set方法
	 * @param green
	 */
	public void setGreen(Integer green) {
		this.green = green;
	}
	/**
	 * 学院get方法
	 * @return
	 */
	public BaseAcademyModel getCollege() {
		return college;
	}
	/**
	 * 学院set方法
	 * @param college
	 */
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	
	
}
