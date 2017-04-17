/**   
* @Title: CollegeAwardInfo.java 
* @Package com.uws.domain.reward 
* @author zhangyb   
* @date 2015年12月31日 上午10:51:06 
* @version V1.0   
*/
package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/** 
 * @ClassName: CollegeAwardInfo 
 * @Description: 校内奖励实体类 
 * @author zhangyb 
 * @date 2015年12月31日 上午10:51:06  
 */
public class CollegeAwardInfo extends BaseModel {

	private static final long serialVersionUID = 3627270656407778432L;
	
	/**
	 * 学生id
	 */
	private StudentInfoModel studentId;
	private String studentIdStr;
	
	/**
	 * 奖励名称
	 */
	private String awardName;
	
	/**
	 * 获奖时间
	 */
	private String awardTime;
	
	/**
	 * 获奖学年
	 */
	private Dic schoolYear;
	private String schoolYearStr;
	
	/**
	 * 获奖学期
	 */
	private Dic schoolTerm;
	private String schoolTermStr;
	
	/**
	 * 操作人
	 */
	private User creator;
	
	private String comments;

	public StudentInfoModel getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getAwardTime() {
		return awardTime;
	}

	public void setAwardTime(String awardTime) {
		this.awardTime = awardTime;
	}

	public Dic getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Dic getSchoolTerm() {
		return schoolTerm;
	}

	public void setSchoolTerm(Dic schoolTerm) {
		this.schoolTerm = schoolTerm;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getStudentIdStr() {
		return studentIdStr;
	}

	public void setStudentIdStr(String studentIdStr) {
		this.studentIdStr = studentIdStr;
	}

	public String getSchoolYearStr() {
		return schoolYearStr;
	}

	public void setSchoolYearStr(String schoolYearStr) {
		this.schoolYearStr = schoolYearStr;
	}

	public String getSchoolTermStr() {
		return schoolTermStr;
	}

	public void setSchoolTermStr(String schoolTermStr) {
		this.schoolTermStr = schoolTermStr;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
