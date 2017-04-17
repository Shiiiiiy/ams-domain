/**   
* @Title: StartupClassInfo.java 
* @Package com.uws.domain.training 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zhangyb   
* @date 2015年10月21日 下午2:45:03 
* @version V1.0   
*/
package com.uws.domain.training;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/** 
 * @ClassName: StartupClassInfo 
 * @Description: TODO 创业班信息
 * @author zhangyb 
 * @date 2015年10月21日 下午2:45:03  
 */
public class StartupClassInfo extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 创业班名称
	 */
	private String growthClassName;
	
	/**
	 * 创业班类型
	 */
	private Dic growthClassType;
	
	/**
	 * 创业班主题
	 */
	private String growthClassTheme;
	
	/**
	 * 班主任
	 */
	private BaseTeacherModel growthClassLeader;
	private String growthClassLeaderStr;
	
	
	/**
	 * 创业班状态
	 */
	private Dic growthClassStatus;
	
	/**
	 * 报名截止日期
	 */
	private Date applyEndDate;
	private String applyEndDateStr;
	
	/**
	 * 计划开班日期
	 */
	private Date classBeginDate;
	private String classBeginDateStr;
	
	/**
	 * 计划结班日期
	 */
	private Date planEndDate;
	private String planEndDateStr;
	
	/**
	 * 学年
	 */
	private Dic schoolYear;
	
	/**
	 * 创建者
	 */
	private User creator;
	
	/**
	 * 更新者
	 */
	private User updator;
	
	public String getGrowthClassName() {
		return growthClassName;
	}

	public void setGrowthClassName(String growthClassName) {
		this.growthClassName = growthClassName;
	}

	public Dic getGrowthClassType() {
		return growthClassType;
	}

	public void setGrowthClassType(Dic growthClassType) {
		this.growthClassType = growthClassType;
	}

	public String getGrowthClassTheme() {
		return growthClassTheme;
	}

	public void setGrowthClassTheme(String growthClassTheme) {
		this.growthClassTheme = growthClassTheme;
	}

	public BaseTeacherModel getGrowthClassLeader() {
		return growthClassLeader;
	}

	public void setGrowthClassLeader(BaseTeacherModel growthClassLeader) {
		this.growthClassLeader = growthClassLeader;
	}

	public Dic getGrowthClassStatus() {
		return growthClassStatus;
	}

	public void setGrowthClassStatus(Dic growthClassStatus) {
		this.growthClassStatus = growthClassStatus;
	}

	public Date getApplyEndDate() {
		return applyEndDate;
	}

	public void setApplyEndDate(Date applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	public Date getClassBeginDate() {
		return classBeginDate;
	}

	public void setClassBeginDate(Date classBeginDate) {
		this.classBeginDate = classBeginDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getUpdator() {
		return updator;
	}

	public void setUpdator(User updator) {
		this.updator = updator;
	}

	public String getGrowthClassLeaderStr() {
		return growthClassLeaderStr;
	}

	public void setGrowthClassLeaderStr(String growthClassLeaderStr) {
		this.growthClassLeaderStr = growthClassLeaderStr;
	}

	public String getApplyEndDateStr() {
		return applyEndDateStr;
	}

	public void setApplyEndDateStr(String applyEndDateStr) {
		this.applyEndDateStr = applyEndDateStr;
	}

	public String getClassBeginDateStr() {
		return classBeginDateStr;
	}

	public void setClassBeginDateStr(String classBeginDateStr) {
		this.classBeginDateStr = classBeginDateStr;
	}

	public String getPlanEndDateStr() {
		return planEndDateStr;
	}

	public void setPlanEndDateStr(String planEndDateStr) {
		this.planEndDateStr = planEndDateStr;
	}


}
