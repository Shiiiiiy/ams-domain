/**   
* @Title: AdvisorInfo.java 
* @Package com.uws.domain.training 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zhangyb   
* @date 2015年11月4日 上午10:29:30 
* @version V1.0   
*/
package com.uws.domain.training;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/** 
 * @ClassName: AdvisorInfo 
 * @Description:  导师信息
 * @author zhangyb 
 * @date 2015年11月4日 上午10:29:30  
 */
public class AdvisorInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 校外教师对象
	 */
	private OuterUserInfo outerUserInfo;
	private String outerUserInfoStr;
	
	/**
	 * 值班日期
	 */
	private Date advisorDate;
	private String advisorDateStr;
	
	/**
	 * 值班时间
	 */
	private String advisorTime;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 学生预约人数
	 */
	private Integer advisorStuNum;
	
	/**
	 * 学年
	 */
	private Dic schoolYear;
	
	/**
	 * 导师状态
	 */
	private Dic advisorStatus;
	
	/**
	 * 辅导内容简介
	 */
	private String advisorIntro;

	public OuterUserInfo getOuterUserInfo() {
		return outerUserInfo;
	}

	public void setOuterUserInfo(OuterUserInfo outerUserInfo) {
		this.outerUserInfo = outerUserInfo;
	}

	public String getOuterUserInfoStr() {
		return outerUserInfoStr;
	}

	public void setOuterUserInfoStr(String outerUserInfoStr) {
		this.outerUserInfoStr = outerUserInfoStr;
	}

	public Date getAdvisorDate() {
		return advisorDate;
	}

	public void setAdvisorDate(Date advisorDate) {
		this.advisorDate = advisorDate;
	}

	public String getAdvisorTime() {
		return advisorTime;
	}

	public void setAdvisorTime(String advisorTime) {
		this.advisorTime = advisorTime;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Integer getAdvisorStuNum() {
		return advisorStuNum;
	}

	public void setAdvisorStuNum(Integer advisorStuNum) {
		this.advisorStuNum = advisorStuNum;
	}

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Dic getAdvisorStatus() {
		return advisorStatus;
	}

	public void setAdvisorStatus(Dic advisorStatus) {
		this.advisorStatus = advisorStatus;
	}

	public String getAdvisorDateStr() {
		return advisorDateStr;
	}

	public void setAdvisorDateStr(String advisorDateStr) {
		this.advisorDateStr = advisorDateStr;
	}

	public String getAdvisorIntro() {
		return advisorIntro;
	}

	public void setAdvisorIntro(String advisorIntro) {
		this.advisorIntro = advisorIntro;
	}
	

}
