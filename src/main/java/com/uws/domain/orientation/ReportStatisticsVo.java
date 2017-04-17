package com.uws.domain.orientation;

import java.util.List;

import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;

/**
 * 用于报到统计页面传值
 * @author z
 *
 */
public class ReportStatisticsVo {
	//学院
	private BaseAcademyModel college;
	//专业
	private BaseMajorModel major;
	//班级
	private BaseClassModel klass;
	//录取人数
	private Long reportedNum;
	//报到人数
	private Long registedNum;
	//各省份录取情况
	private List<ReportVo> listReport;
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
	/**
	 * 专业get方法
	 * @return
	 */
	public BaseMajorModel getMajor() {
		return major;
	}
	/**
	 * 专业set方法
	 * @param major
	 */
	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}
	/**
	 * 班级get方法
	 * @return
	 */
	public BaseClassModel getKlass() {
		return klass;
	}
	/**
	 * 班级set方法
	 * @param klass
	 */
	public void setKlass(BaseClassModel klass) {
		this.klass = klass;
	}
	/**
	 * 录取人数get方法
	 * @return
	 */
	public Long getReportedNum() {
		return reportedNum;
	}
	/**
	 * 录取人数set方法
	 * @param reportedNum
	 */
	public void setReportedNum(Long reportedNum) {
		this.reportedNum = reportedNum;
	}
	/**
	 * 各省份录取情况get方法
	 * @return
	 */
	public List<ReportVo> getListReport() {
		return listReport;
	}
	/**
	 * 各省份录取情况set方法
	 * @param listReport
	 */
	public void setListReport(List<ReportVo> listReport) {
		this.listReport = listReport;
	}
	/**
	 * 报到人数get()方法
	 * @return the registedNum
	 */
	public Long getRegistedNum() {
		return registedNum;
	}
	/**
	 * 报到人数set()方法
	 * @param registedNum the registedNum to set
	 */
	public void setRegistedNum(Long registedNum) {
		this.registedNum = registedNum;
	}
	
	
	
	
	
}
