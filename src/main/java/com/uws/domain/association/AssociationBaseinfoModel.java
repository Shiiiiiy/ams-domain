package com.uws.domain.association;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 社团基本信息实体类
 */
public class AssociationBaseinfoModel extends BaseModel {

	private static final long serialVersionUID = 2925007730389067305L;

	/**
	 * 社团编码
	 */
	private String associationCode;

	/**
	 * 社团名称
	 */
	private String associationName;

	/**
	 * 社团变更后名称
	 */
	private String associationRegisterName;

	/**
	 * 社团宗旨
	 */
	private String associationAim;
	
	/**
	 * 社长
	 */
	private StudentInfoModel proprieter;
	
	/**
	 * 原社长
	 */
	private StudentInfoModel proprieterRegister;
	
	/**
	 * 指导老师【显示用】
	 */
	private String advisors;
	
	/**
	 * 社团人数
	 */
	private int memberNums;

	/**
	 * 社团申请时间
	 */
	private Date applyTime;
	
	/**
	 * 社团变更时间
	 */
	private String modifyTime;

	/**
	 * 学院
	 */
	private BaseAcademyModel college;

	/**
	 * 社团类型
	 */
	private Dic associationType;
	
	/**
	 * 原社团类型
	 */
	private Dic associationRegisterType;

	/**
	 * 是否十佳社团
	 */
	private Dic isTopten;

	/**
	 * 星级评价
	 */
	private String honorRating;

	/**
	 * 是否专业
	 */
	private Dic isMajor;
	
	/**
	 * 是否专业
	 */
	private Dic isMajorRegister;

	/**
	 * 是否缴纳社费
	 */
	private Dic isPay;

	/**
	 * 社团缴纳经费
	 */
	private double associationFee;

	/**
	 * 社团是否注销
	 */
	private Dic isCancel;
	
	/**
	 * 是否强制注销
	 */
	private Dic isForceCancel;
	
	/**
	 * 社团是否有效
	 */
	private Dic isValid;
	
	/**
	 * 是否开放
	 */
	private Dic isOpen;
	
	/**
	 * 开放范围：全校学生、专业学生
	 */
	private Dic openScope;
	
	/**
	 * 面向的专业ID
	 */
	private String majorIds;
	
	/**
	 * 面向的专业名称
	 */
	private String majorNames;

	/**
	 * 创建人
	 */
	private User creator;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	
	/**
	 * 临时字段【当前用户是否当前社团负责人】
	 */
	private String isCurAM;
	
	/**
	 * 临时字段【当前用户是否当前社团指导老师】
	 */
	private String isCurAA;
	
	/**
	 * 临时字段【是否当前社团成员】
	 */
	private String isCurAssociationMember;
	
	/**
	 * 临时字段【是否当前社团临时成员】
	 */
	private String isTempMember;
	
	/**
	 * 临时字段【参与人员审核状态】
	 */
	private Dic memberStatus;
	
	private AssociationMemberModel associationMemberModel;
	

	public String getAssociationCode() {
		return associationCode;
	}

	public void setAssociationCode(String associationCode) {
		this.associationCode = associationCode;
	}

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	public String getAssociationRegisterName() {
		return associationRegisterName;
	}

	public void setAssociationRegisterName(String associationRegisterName) {
		this.associationRegisterName = associationRegisterName;
	}

	public String getAssociationAim() {
		return associationAim;
	}

	public void setAssociationAim(String associationAim) {
		this.associationAim = associationAim;
	}

	public StudentInfoModel getProprieter() {
		return proprieter;
	}

	public void setProprieter(StudentInfoModel proprieter) {
		this.proprieter = proprieter;
	}

	public StudentInfoModel getProprieterRegister() {
		return proprieterRegister;
	}

	public void setProprieterRegister(StudentInfoModel proprieterRegister) {
		this.proprieterRegister = proprieterRegister;
	}

	public String getAdvisors() {
		return advisors;
	}

	public void setAdvisors(String advisors) {
		this.advisors = advisors;
	}

	public int getMemberNums() {
		return memberNums;
	}

	public void setMemberNums(int memberNums) {
		this.memberNums = memberNums;
	}


	public void setApplyTime(Date applyTime)
    {
    	this.applyTime = applyTime;
    }


	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public Dic getAssociationType() {
		return associationType;
	}

	public void setAssociationType(Dic associationType) {
		this.associationType = associationType;
	}

	public Dic getAssociationRegisterType() {
		return associationRegisterType;
	}

	public void setAssociationRegisterType(Dic associationRegisterType) {
		this.associationRegisterType = associationRegisterType;
	}

	public Dic getIsTopten() {
		return isTopten;
	}

	public void setIsTopten(Dic isTopten) {
		this.isTopten = isTopten;
	}

	public String getHonorRating() {
		return honorRating;
	}

	public void setHonorRating(String honorRating) {
		this.honorRating = honorRating;
	}

	public Dic getIsMajor() {
		return isMajor;
	}

	public void setIsMajor(Dic isMajor) {
		this.isMajor = isMajor;
	}

	public Dic getIsMajorRegister() {
		return isMajorRegister;
	}

	public void setIsMajorRegister(Dic isMajorRegister) {
		this.isMajorRegister = isMajorRegister;
	}

	public Dic getIsPay() {
		return isPay;
	}

	public void setIsPay(Dic isPay) {
		this.isPay = isPay;
	}

	public double getAssociationFee() {
		return associationFee;
	}

	public void setAssociationFee(double associationFee) {
		this.associationFee = associationFee;
	}

	public Dic getIsCancel() {
		return isCancel;
	}

	public void setIsCancel(Dic isCancel) {
		this.isCancel = isCancel;
	}

	public Dic getIsForceCancel() {
		return isForceCancel;
	}

	public void setIsForceCancel(Dic isForceCancel) {
		this.isForceCancel = isForceCancel;
	}

	public Dic getIsValid() {
		return isValid;
	}

	public void setIsValid(Dic isValid) {
		this.isValid = isValid;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getIsCurAM() {
		return isCurAM;
	}

	public void setIsCurAM(String isCurAM) {
		this.isCurAM = isCurAM;
	}

	public String getIsCurAA() {
		return isCurAA;
	}

	public void setIsCurAA(String isCurAA) {
		this.isCurAA = isCurAA;
	}

	public String getIsCurAssociationMember() {
		return isCurAssociationMember;
	}

	public void setIsCurAssociationMember(String isCurAssociationMember) {
		this.isCurAssociationMember = isCurAssociationMember;
	}

	public String getIsTempMember() {
		return isTempMember;
	}

	public void setIsTempMember(String isTempMember) {
		this.isTempMember = isTempMember;
	}

	public Dic getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(Dic memberStatus) {
		this.memberStatus = memberStatus;
	}

	public Dic getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Dic isOpen) {
		this.isOpen = isOpen;
	}

	public Dic getOpenScope() {
		return openScope;
	}

	public void setOpenScope(Dic openScope) {
		this.openScope = openScope;
	}

	public String getMajorIds() {
		return majorIds;
	}

	public void setMajorIds(String majorIds) {
		this.majorIds = majorIds;
	}

	public String getMajorNames() {
		return majorNames;
	}

	public void setMajorNames(String majorNames) {
		this.majorNames = majorNames;
	}

	public Date getApplyTime()
    {
    	return applyTime;
    }

	public AssociationMemberModel getAssociationMemberModel()
    {
    	return associationMemberModel;
    }

	public void setAssociationMemberModel(
            AssociationMemberModel associationMemberModel)
    {
    	this.associationMemberModel = associationMemberModel;
    }
	
}