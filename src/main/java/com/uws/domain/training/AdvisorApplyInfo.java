/**   
* @Title: AdvisorApplyInfo.java 
* @Package com.uws.domain.training 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zhangyb   
* @date 2015年11月4日 上午10:36:56 
* @version V1.0   
*/
package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/** 
 * @ClassName: AdvisorApplyInfo 
 * @Description: TODO 学生预约信息
 * @author zhangyb 
 * @date 2015年11月4日 上午10:36:56  
 */
public class AdvisorApplyInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 导师信息ID
	 */
	private AdvisorInfo advisorInfoId;
	
	/**
	 * 学生Id
	 */
	private StudentInfoModel studentId;
	
	/**
	 * 签到状态
	 */
	private Dic signInStatus;
	
	/**
	 * 学生预约状态
	 */
	private Dic applyStatus;

	public AdvisorInfo getAdvisorInfoId() {
		return advisorInfoId;
	}

	public void setAdvisorInfoId(AdvisorInfo advisorInfoId) {
		this.advisorInfoId = advisorInfoId;
	}

	public StudentInfoModel getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}

	public Dic getSignInStatus() {
		return signInStatus;
	}

	public void setSignInStatus(Dic signInStatus) {
		this.signInStatus = signInStatus;
	}

	public Dic getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Dic applyStatus) {
		this.applyStatus = applyStatus;
	}
	
	

}
