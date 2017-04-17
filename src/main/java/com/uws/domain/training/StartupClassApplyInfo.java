/**   
* @Title: StartupClassApplyInfo.java 
* @Package com.uws.domain.training 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zhangyb   
* @date 2015年10月21日 下午2:53:59 
* @version V1.0   
*/
package com.uws.domain.training;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/** 
 * @ClassName: StartupClassApplyInfo 
 * @Description: TODO 创业班学生申请信息
 * @author zhangyb 
 * @date 2015年10月21日 下午2:53:59  
 */
public class StartupClassApplyInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 创业班ID
	 */
	private StartupClassInfo growthId;
	
	/**
	 * 学生ID
	 */
	private StudentInfoModel studentId;
	
	/**
	 * 申请状态
	 */
	private Dic applyStatus;
	
	/**
	 * 审核状态
	 */
	private Dic approveStatus;
	
	/**
	 * 结业状态
	 */
	private Dic completeStatus;
	
	/**
	 * 学生分数
	 */
	private Integer score;

	public StartupClassInfo getGrowthId() {
		return growthId;
	}

	public void setGrowthId(StartupClassInfo growthId) {
		this.growthId = growthId;
	}

	public StudentInfoModel getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}

	public Dic getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Dic applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Dic getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Dic approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Dic getCompleteStatus() {
		return completeStatus;
	}

	public void setCompleteStatus(Dic completeStatus) {
		this.completeStatus = completeStatus;
	}
	
	

}
