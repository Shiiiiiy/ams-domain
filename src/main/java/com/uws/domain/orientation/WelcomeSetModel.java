package com.uws.domain.orientation;

import java.io.Serializable;
import java.util.Date;
import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: WelcomeSetModel
 * @Description: 迎新设置信息
 * @author wangcl
 * @date 2015-07-22
 */
public class WelcomeSetModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3396206182295392089L;
	
	/**
	 * 学年
	 */
	private Dic yearDic;
	
	/**
	 * 新生信息采集开始日期
	 */
	private Date startDate;
	
	/**
	 * 新生信息采集开始日期Str
	 */
	private String startDateStr;
	
	/**
	 * 新生信息采集结束日期Str
	 */
	private String endDateStr;
	
	/**
	 * 新生信息采集结束日期
	 */
	private Date endDate;
	
	/**
	 * 信息采集填写
	 */
	private String writeComm;
	
	/**
	 * 户口迁移地址
	 */
	private String moveAdderss;
	
	/**
	 * 空调说明
	 */
	private String airCondComm;
	
	/**
	 * 寝具说明
	 */
	private String bedComm;
	
	/**
	 * 报到流程说明
	 */
	private String reportComm;

	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 修改人
	 */
	private User updater;


	public Dic getYearDic() {
		return yearDic;
	}


	public void setYearDic(Dic yearDic) {
		this.yearDic = yearDic;
	}


	public String getWriteComm() {
		return writeComm;
	}


	public void setWriteComm(String writeComm) {
		this.writeComm = writeComm;
	}


	public String getMoveAdderss() {
		return moveAdderss;
	}


	public void setMoveAdderss(String moveAdderss) {
		this.moveAdderss = moveAdderss;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public User getCreator() {
		return creator;
	}


	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getUpdater() {
		return updater;
	}

	public void setUpdater(User updater) {
		this.updater = updater;
	}

	public String getBedComm() {
		return bedComm;
	}

	public void setBedComm(String bedComm) {
		this.bedComm = bedComm;
	}


	public String getReportComm() {
		return reportComm;
	}


	public void setReportComm(String reportComm) {
		this.reportComm = reportComm;
	}


	public String getAirCondComm() {
		return airCondComm;
	}


	public void setAirCondComm(String airCondComm) {
		this.airCondComm = airCondComm;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getStartDateStr() {
		return startDateStr;
	}


	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}


	public String getEndDateStr() {
		return endDateStr;
	}


	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
}
