package com.uws.domain.evaluation;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.user.model.User;

/**
 * @Description 综合测评人员
 * @author Jiangbl
 * @date 2015-8-13
 */
public class EvaluationUser extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 班级
	 */
	private BaseClassModel classId;
	
	/**
	 * 测评人
	 */
	private User assist;
	
	/**
	 * 操作人
	 */
	private User creator;	
	
	/**
	 * 用于查询  学院id 
	 */
	private String collageId;	
	
	/**
	 * 用于查询 专业id
	 */
	private String majorId;		
	
	/**
	 * 用于查询 班级id
	 */
	private String eClassId;	
	
	/**
	 * 用于查询 
	 */
	private String userName;	
	
	public BaseClassModel getClassId() {
		return classId;
	}
	
	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}
	
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User creator) {
		this.creator = creator;
	}


	public User getAssist() {
		return assist;
	}

	public void setAssist(User assist) {
		this.assist = assist;
	}

	public String getCollageId() {
		return collageId;
	}

	public void setCollageId(String collageId) {
		this.collageId = collageId;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String geteClassId() {
		return eClassId;
	}

	public void seteClassId(String eClassId) {
		this.eClassId = eClassId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
