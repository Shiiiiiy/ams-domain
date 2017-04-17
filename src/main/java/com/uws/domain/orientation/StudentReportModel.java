package com.uws.domain.orientation;

import java.io.Serializable;
import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: StudentReportModel
 * @Description: 学生预报到信息
 * @author wangcl
 * @date 2015-07-22
 */
public class StudentReportModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3396206182295392089L;
	
	/**
	 * 学生基本信息
	 */
	private StudentInfoModel studentInfo;
	
	/**
	 * 年份
	 */
	//private String year;
	private Dic yearDic;
	
	/**
	 * 是否报到
	 */
	private String isReport;
	
	/**
	 * 不报到的原因
	 */
	private String reason;
	
	
	/**
	 * 预报到时间
	 */
	private Date reportDate;
	
	/**
	 * 预报到时间Str
	 */
	private String reportDateStr;
	
	/**
	 * 报到开始时间（页面传值）
	 */
	private Date reportStartDate;
	
	/**
	 * 报到结束时间（页面传值）
	 */
	private Date reportEndDate;
	
	/**
	 * 预计车次
	 */
	private String trainNumber;
	
	/**
	 * 预报到站点
	 */
	private Dic siteDic;
	
	/**
	 * 乘车方式
	 */
	private Dic rideWayDic;
	
	/**
	 * 随行人员
	 */
	private Integer together;
	
	/**
	 * 自备车
	 */
	private String  isCar;
	
	
	/**
	 * 需要空调
	 */
	private String  airCond;
	
	/**
	 * 寝具包
	 */
	private String  bed;
	
	/**
	 * 是否迁移户口
	 */
	private String  move;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 更新人
	 */
	private User updater;

	public StudentInfoModel getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfoModel studentInfo) {
		this.studentInfo = studentInfo;
	}

	public String getIsReport() {
		return isReport;
	}

	public void setIsReport(String isReport) {
		this.isReport = isReport;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Dic getRideWayDic() {
		return rideWayDic;
	}

	public void setRideWayDic(Dic rideWayDic) {
		this.rideWayDic = rideWayDic;
	}

	public Integer getTogether() {
		return together;
	}

	public void setTogether(Integer together) {
		this.together = together;
	}

	public String getIsCar() {
		return isCar;
	}

	public void setIsCar(String isCar) {
		this.isCar = isCar;
	}

	public String getAirCond() {
		return airCond;
	}

	public void setAirCond(String airCond) {
		this.airCond = airCond;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public User getUpdater() {
		return updater;
	}

	public void setUpdater(User updater) {
		this.updater = updater;
	}

	public Date getReportStartDate() {
		return reportStartDate;
	}

	public void setReportStartDate(Date reportStartDate) {
		this.reportStartDate = reportStartDate;
	}

	public Date getReportEndDate() {
		return reportEndDate;
	}

	public void setReportEndDate(Date reportEndDate) {
		this.reportEndDate = reportEndDate;
	}

	public Dic getSiteDic() {
		return siteDic;
	}

	public void setSiteDic(Dic siteDic) {
		this.siteDic = siteDic;
	}

	public String getReportDateStr() {
		return reportDateStr;
	}

	public void setReportDateStr(String reportDateStr) {
		this.reportDateStr = reportDateStr;
	}

	public Dic getYearDic() {
		return yearDic;
	}

	public void setYearDic(Dic yearDic) {
		this.yearDic = yearDic;
	}


	/*public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}*/
	
}
