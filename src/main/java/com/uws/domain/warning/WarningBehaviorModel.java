/**   
* @Title: WarningBehaviorModel.java 
* @Package com.uws.domain.warning 
* @Description: 行为预警 
* @author zhangyb   
* @date 2016年1月18日 上午11:00:02 
* @version V1.0   
*/
package com.uws.domain.warning;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;

/** 
 * @ClassName: WarningBehaviorModel 
 * @Description: 行为预警model
 * @author zhangyb 
 * @date 2016年1月18日 上午11:00:02  
 */
public class WarningBehaviorModel extends BaseModel {

	private static final long serialVersionUID = -7182137076061873048L;
	
	/**
	 * 学生对象
	 */
	private StudentInfoModel student;
	private String studentStr;
	
	/**
	 * 预警日期
	 */
	private Date warningDate;
	
	/**
	 * 预警时间
	 */
	private String warningTime;
	
	/**
	 * 预警位置
	 */
	private String warningLocation;
	
	/**
	 * 事件描述
	 */
	private String warningInfo;
	
	private String strNum;

	public StudentInfoModel getStudent() {
		return student;
	}

	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}

	public String getStudentStr() {
		return studentStr;
	}

	public void setStudentStr(String studentStr) {
		this.studentStr = studentStr;
	}

	public Date getWarningDate() {
		return warningDate;
	}

	public void setWarningDate(Date warningDate) {
		this.warningDate = warningDate;
	}

	public String getWarningTime() {
		return warningTime;
	}

	public void setWarningTime(String warningTime) {
		this.warningTime = warningTime;
	}

	public String getWarningLocation() {
		return warningLocation;
	}

	public void setWarningLocation(String warningLocation) {
		this.warningLocation = warningLocation;
	}

	public String getWarningInfo() {
		return warningInfo;
	}

	public void setWarningInfo(String warningInfo) {
		this.warningInfo = warningInfo;
	}

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	
	
	

}
