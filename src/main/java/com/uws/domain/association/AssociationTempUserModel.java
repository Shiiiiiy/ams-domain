package com.uws.domain.association;

import com.uws.core.base.BaseModel;

public class AssociationTempUserModel extends BaseModel {

	private static final long serialVersionUID = -3950325445705448312L;
	
	/**
	 * 社团对象
	 */
	private AssociationBaseinfoModel associationPo;
	
	/**
	 * 用户类型
	 */
	private String userType;
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 指导老师简介
	 */
	private String comments;

	public AssociationBaseinfoModel getAssociationPo() {
		return associationPo;
	}

	public void setAssociationPo(AssociationBaseinfoModel associationPo) {
		this.associationPo = associationPo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
