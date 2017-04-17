package com.uws.domain.reward;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/** 
* @ClassName: PunishInfo 
* @Description: TODO 惩罚管理实体
* @author zhangyb 
* @date 2015年8月24日 上午10:04:26  
*/
public class PunishInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 学生对象
	 */
	private StudentInfoModel stuId;
	private String stuIdStr;
	private String stuName;
	
	/**
	 * 处分名称码 数据字典
	 */
	private Dic punish;
	private String punishStr;
	
	/**
	 * 处分学年
	 */
	private Dic punishYear;
	private String punishYearStr;
	
	/**
	 * 处分学期
	 */
	private Dic punishTerm;
	private String punishTermStr;
	
	/**
	 * 处分日期
	 */
	private Date punishStartDate;
	
	private String punishStartDateStr;
	/**
	 * 处分影响时限
	 */
	private Date punishEndDate;
	private String punishEndDateStr;
	
	/**
	 * 处分原因
	 */
	private String punishReason;
	
	/**
	 * 处分文号
	 */
	private String punishNum;
	
	
	/**
	 * 处分状态
	 */
	private Dic punishStatus;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	private String comments;
	
	/**
	 * 惩处编号
	 */
	private String punishCode;
	
	/**
	 * 惩处日期
	 */
	private Date punishDate;
	
	/**
	 * 违纪简况
	 */
	private String punishInfo;
	
	/**
	 * 违纪类别码
	 */
	private String punishTypeCode;
	
	/**
	 * 处分撤销日期
	 */
	private Date punishRepealDate;
	
	/**
	 * 处分撤销文号
	 */
	private String punishRepealNum;
	
	/**
	 * 申诉日期
	 */
	private Date appealDate;
	
	/**
	 * 审委会审议日期
	 */
	private Date examineDate;
	
	/**
	 * 审委会审议结论
	 */
	private String examineResult;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public StudentInfoModel getStuId() {
		return stuId;
	}

	public void setStuId(StudentInfoModel stuId) {
		this.stuId = stuId;
	}

	public Dic getPunishYear() {
		return punishYear;
	}

	public void setPunishYear(Dic punishYear) {
		this.punishYear = punishYear;
	}

	public Dic getPunishTerm() {
		return punishTerm;
	}

	public void setPunishTerm(Dic punishTerm) {
		this.punishTerm = punishTerm;
	}

	public String getPunishReason() {
		return punishReason;
	}

	public void setPunishReason(String punishReason) {
		this.punishReason = punishReason;
	}

	public String getPunishNum() {
		return punishNum;
	}

	public void setPunishNum(String punishNum) {
		this.punishNum = punishNum;
	}
	
	public Date getPunishEndDate() {
		return punishEndDate;
	}

	public void setPunishEndDate(Date punishEndDate) {
		this.punishEndDate = punishEndDate;
	}

	public String getPunishEndDateStr() {
		return punishEndDateStr;
	}

	public void setPunishEndDateStr(String punishEndDateStr) {
		this.punishEndDateStr = punishEndDateStr;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Dic getPunishStatus() {
		return punishStatus;
	}

	public void setPunishStatus(Dic punishStatus) {
		this.punishStatus = punishStatus;
	}

	public Dic getPunish() {
		return punish;
	}

	public void setPunish(Dic punish) {
		this.punish = punish;
	}

	public Date getPunishStartDate() {
		return punishStartDate;
	}

	public void setPunishStartDate(Date punishStartDate) {
		this.punishStartDate = punishStartDate;
	}

	public String getPunishStartDateStr() {
		return punishStartDateStr;
	}

	public void setPunishStartDateStr(String punishStartDateStr) {
		this.punishStartDateStr = punishStartDateStr;
	}

	public String getPunishStr() {
		return punishStr;
	}

	public void setPunishStr(String punishStr) {
		this.punishStr = punishStr;
	}

	public String getPunishYearStr() {
		return punishYearStr;
	}

	public void setPunishYearStr(String punishYearStr) {
		this.punishYearStr = punishYearStr;
	}

	public String getPunishTermStr() {
		return punishTermStr;
	}

	public void setPunishTermStr(String punishTermStr) {
		this.punishTermStr = punishTermStr;
	}

	public String getStuIdStr() {
		return stuIdStr;
	}

	public void setStuIdStr(String stuIdStr) {
		this.stuIdStr = stuIdStr;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPunishCode() {
		return punishCode;
	}

	public void setPunishCode(String punishCode) {
		this.punishCode = punishCode;
	}

	public Date getPunishDate() {
		return punishDate;
	}

	public void setPunishDate(Date punishDate) {
		this.punishDate = punishDate;
	}

	public String getPunishInfo() {
		return punishInfo;
	}

	public void setPunishInfo(String punishInfo) {
		this.punishInfo = punishInfo;
	}

	public String getPunishTypeCode() {
		return punishTypeCode;
	}

	public void setPunishTypeCode(String punishTypeCode) {
		this.punishTypeCode = punishTypeCode;
	}

	public Date getPunishRepealDate() {
		return punishRepealDate;
	}

	public void setPunishRepealDate(Date punishRepealDate) {
		this.punishRepealDate = punishRepealDate;
	}

	public String getPunishRepealNum() {
		return punishRepealNum;
	}

	public void setPunishRepealNum(String punishRepealNum) {
		this.punishRepealNum = punishRepealNum;
	}

	public Date getAppealDate() {
		return appealDate;
	}

	public void setAppealDate(Date appealDate) {
		this.appealDate = appealDate;
	}

	public Date getExamineDate() {
		return examineDate;
	}

	public void setExamineDate(Date examineDate) {
		this.examineDate = examineDate;
	}

	public String getExamineResult() {
		return examineResult;
	}

	public void setExamineResult(String examineResult) {
		this.examineResult = examineResult;
	}

	
	

}
