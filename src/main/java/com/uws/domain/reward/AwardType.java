package com.uws.domain.reward;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @author zhangyb
 * @version 2015年8月10日 下午5:45:39  
 * @Description:评优类型实体类
 */
public class AwardType extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 学年
	 */
	private Dic schoolYear;
	
	/**
	 * 评奖评优信息
	 */
	private AwardInfo awardInfoId;
	
	/**
	 * 评优/评奖
	 */
	private Dic awardType;
	
	/**
	 * 二级奖项名称
	 */
	private Dic secondAwardName;
	
	/**
	 * 导入用评奖评优编码
	 */
	private String awardTypeCode;
	
	/**
	 * 二级奖项所属评优类型ID
	 */
	private String amongAwardId;
	
	/**
	 * 评优类型状态
	 */
	private Dic awardStatus;
	
	/**
	 * 申请开始日期
	 */
	private Date beginDate;
	private String beginDateStr;
	
	/**
	 * 申请截止日期
	 */
	private Date endDate;
	private String endDateStr;
	
	/**
	 * 创建人
	 */
	private User creator;

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public AwardInfo getAwardInfoId() {
		return awardInfoId;
	}

	public void setAwardInfoId(AwardInfo awardInfoId) {
		this.awardInfoId = awardInfoId;
	}

	public Dic getSecondAwardName() {
		return secondAwardName;
	}

	public void setSecondAwardName(Dic secondAwardName) {
		this.secondAwardName = secondAwardName;
	}

	public String getAmongAwardId() {
		return amongAwardId;
	}

	public void setAmongAwardId(String amongAwardId) {
		this.amongAwardId = amongAwardId;
	}

	public Dic getAwardStatus() {
		return awardStatus;
	}

	public void setAwardStatus(Dic awardStatus) {
		this.awardStatus = awardStatus;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getBeginDateStr() {
		return beginDateStr;
	}

	public void setBeginDateStr(String beginDateStr) {
		this.beginDateStr = beginDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

	public Dic getAwardType() {
		return awardType;
	}

	public void setAwardType(Dic awardType) {
		this.awardType = awardType;
	}

	public String getAwardTypeCode() {
		return awardTypeCode;
	}

	public void setAwardTypeCode(String awardTypeCode) {
		this.awardTypeCode = awardTypeCode;
	}

	
	
	
}
