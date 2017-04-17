package com.uws.domain.association;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 社团负责人实体类
 */
public class AssociationMemberModel extends BaseModel {

	private static final long serialVersionUID = -6855660212109353361L;

	/**
	 * 社团对象
	 */
	private AssociationBaseinfoModel associationPo;

	/**
	 * 社团成员
	 */
	private StudentInfoModel memberPo;
	
	/**
	 * 社团成员学号【临时字段：导入用】
	 */
	private String stuNumberText;

	/**
	 * 是否负责人
	 */
	private Dic isManager;
	
	/**
	 * 社团职务
	 */
	private Dic leaguePosition;

	/**
	 * 审核状态
	 */
	private Dic memberStatus;
	
	/**
	 * 报名方式
	 */
	private Dic registerForm;
	
	/**
	 * 入团时间
	 */
	private Date joinTime;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	public AssociationBaseinfoModel getAssociationPo() {
		return associationPo;
	}

	public void setAssociationPo(AssociationBaseinfoModel associationPo) {
		this.associationPo = associationPo;
	}

	public StudentInfoModel getMemberPo() {
		return memberPo;
	}

	public void setMemberPo(StudentInfoModel memberPo) {
		this.memberPo = memberPo;
	}

	public String getStuNumberText() {
		return stuNumberText;
	}

	public void setStuNumberText(String stuNumberText) {
		this.stuNumberText = stuNumberText;
	}

	public Dic getIsManager() {
		return isManager;
	}

	public void setIsManager(Dic isManager) {
		this.isManager = isManager;
	}

	public Dic getLeaguePosition() {
		return leaguePosition;
	}

	public void setLeaguePosition(Dic leaguePosition) {
		this.leaguePosition = leaguePosition;
	}

	public Dic getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(Dic memberStatus) {
		this.memberStatus = memberStatus;
	}

	public Dic getRegisterForm() {
		return registerForm;
	}

	public void setRegisterForm(Dic registerForm) {
		this.registerForm = registerForm;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}