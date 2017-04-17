package com.uws.domain.association;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 社团申请实体类
 */
public class AssociationApplyModel extends BaseModel
{

	private static final long serialVersionUID = 8832437654022263415L;

	/**
	 * 社团对象
	 */
	private AssociationBaseinfoModel associationPo;

	/**
	 * 申请类型【字典】
	 */
	private Dic applyTypeDic;

	/**
	 * 申请类型【CODE】
	 */
	private String applyTypeCode;

	/**
	 * 申请状态【保存、提交】
	 */
	private String applyStatus;

	/**
	 * 操作状态：指导老师【保存、提交】 操作状态：负责人【保存、提交】
	 */
	private String operateStatus;

	/**
	 * 申请理由
	 */
	private String applyReason;

	/**
	 * 变更项目
	 */
	private String modifyItem;

	/**
	 * 变更项目-其他变更内容
	 */
	private String otherModifyItem;

	/**
	 * 财务结算
	 */
	private String financialComments;

	/**
	 * 审批意见
	 */
	private String suggest;

	/**
	 * 流程审批状态
	 */
	private String processstatus;

	/**
	 * 节点审批结果
	 */
	private String approveresult;

	/**
	 * 发起人
	 */
	private User initiator;

	/**
	 * 下一节点办理人
	 */
	private User nextapprover;

	/**
	 * 创建人
	 */
	private User creator;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	

	// 变更添加 2016-1-12
	private String orignManagerId; // 当前申请，如有变更则保存变更前的负责人的Id
	private String memberId; // 申请中的成员Id
	private String orignManagerName;// 当前申请，如有变更则保存变更前的负责人的姓名
	private String orignAdvisorId;// 当前申请，如有变更则保存变更前的指导老师的Id
	private String orignAdvisorName;// 当前申请，如有变更则保存变更前的指导老师的姓名
	private String changedManagerId;// 当前申请，如有变更则保存变更后的负责人的Id
	private String changedManagerName;// 当前申请，如有变更则保存变更后的负责人的姓名
	private String changedAdvisorId;// 当前申请，如有变更则保存变更后的指导老师的Id
	private String changedAdvisorName;// 当前申请，如有变更则保存变更后的指导老师的姓名
	private String orignAssociationName;// 社团原名称
	private String changedAssociationName;// 社团变更后名称
	private Dic orignAssociationType;// 社团原类型
	private Dic changedAssociationType;// 社团变更后类型
	private Dic orignIsMajor;// 社团原性质
	private Dic changedIsMajor;// 社团变更后性质
	private Date applyDate;// 申请时间
	private BaseAcademyModel college;// 学院
	private String associationAim;// 申请是社团宗旨
	private double associationFee;
	private Dic isOpen;//是否开发
	private Dic openScope;//开发范围
	
	private String majorId;
	private String majorName;

	//指导人的操作状态
	private String advisorStatus;
	
	public AssociationBaseinfoModel getAssociationPo()
	{
		return associationPo;
	}

	public void setAssociationPo(AssociationBaseinfoModel associationPo)
	{
		this.associationPo = associationPo;
	}

	public Dic getApplyTypeDic()
	{
		return applyTypeDic;
	}

	public void setApplyTypeDic(Dic applyTypeDic)
	{
		this.applyTypeDic = applyTypeDic;
	}

	public String getApplyTypeCode()
	{
		return applyTypeCode;
	}

	public void setApplyTypeCode(String applyTypeCode)
	{
		this.applyTypeCode = applyTypeCode;
	}

	public String getApplyStatus()
	{
		return applyStatus;
	}

	public void setApplyStatus(String applyStatus)
	{
		this.applyStatus = applyStatus;
	}

	public String getOperateStatus()
	{
		return operateStatus;
	}

	public void setOperateStatus(String operateStatus)
	{
		this.operateStatus = operateStatus;
	}

	public String getApplyReason()
	{
		return applyReason;
	}

	public void setApplyReason(String applyReason)
	{
		this.applyReason = applyReason;
	}

	public String getModifyItem()
	{
		return modifyItem;
	}

	public void setModifyItem(String modifyItem)
	{
		this.modifyItem = modifyItem;
	}

	public String getOtherModifyItem()
	{
		return otherModifyItem;
	}

	public void setOtherModifyItem(String otherModifyItem)
	{
		this.otherModifyItem = otherModifyItem;
	}

	public String getFinancialComments()
	{
		return financialComments;
	}

	public void setFinancialComments(String financialComments)
	{
		this.financialComments = financialComments;
	}

	public String getSuggest()
	{
		return suggest;
	}

	public void setSuggest(String suggest)
	{
		this.suggest = suggest;
	}

	public String getProcessstatus()
	{
		return processstatus;
	}

	public void setProcessstatus(String processstatus)
	{
		this.processstatus = processstatus;
	}

    


	public String getApproveresult()
    {
    	return approveresult;
    }

	public void setApproveresult(String approveresult)
    {
    	this.approveresult = approveresult;
    }

	public User getInitiator()
	{
		return initiator;
	}

	public void setInitiator(User initiator)
	{
		this.initiator = initiator;
	}

	public User getNextapprover()
	{
		return nextapprover;
	}

	public void setNextapprover(User nextapprover)
	{
		this.nextapprover = nextapprover;
	}

	public User getCreator()
	{
		return creator;
	}

	public void setCreator(User creator)
	{
		this.creator = creator;
	}

	public Dic getDeleteStatus()
	{
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus)
	{
		this.deleteStatus = deleteStatus;
	}

	public String getOrignManagerId()
	{
		return orignManagerId;
	}

	public void setOrignManagerId(String orignManagerId)
	{
		this.orignManagerId = orignManagerId;
	}

	public String getOrignManagerName()
	{
		return orignManagerName;
	}

	public void setOrignManagerName(String orignManagerName)
	{
		this.orignManagerName = orignManagerName;
	}

	public String getOrignAdvisorId()
	{
		return orignAdvisorId;
	}

	public void setOrignAdvisorId(String orignAdvisorId)
	{
		this.orignAdvisorId = orignAdvisorId;
	}

	public String getOrignAdvisorName()
	{
		return orignAdvisorName;
	}

	public void setOrignAdvisorName(String orignAdvisorName)
	{
		this.orignAdvisorName = orignAdvisorName;
	}

	public String getChangedManagerId()
	{
		return changedManagerId;
	}

	public void setChangedManagerId(String changedManagerId)
	{
		this.changedManagerId = changedManagerId;
	}

	public String getChangedManagerName()
	{
		return changedManagerName;
	}

	public void setChangedManagerName(String changedManagerName)
	{
		this.changedManagerName = changedManagerName;
	}

	public String getChangedAdvisorId()
	{
		return changedAdvisorId;
	}

	public void setChangedAdvisorId(String changedAdvisorId)
	{
		this.changedAdvisorId = changedAdvisorId;
	}

	public String getChangedAdvisorName()
	{
		return changedAdvisorName;
	}

	public void setChangedAdvisorName(String changedAdvisorName)
	{
		this.changedAdvisorName = changedAdvisorName;
	}

	public String getOrignAssociationName()
	{
		return orignAssociationName;
	}

	public void setOrignAssociationName(String orignAssociationName)
	{
		this.orignAssociationName = orignAssociationName;
	}

	public String getChangedAssociationName()
	{
		return changedAssociationName;
	}

	public void setChangedAssociationName(String changedAssociationName)
	{
		this.changedAssociationName = changedAssociationName;
	}

	public Dic getOrignAssociationType()
	{
		return orignAssociationType;
	}

	public void setOrignAssociationType(Dic orignAssociationType)
	{
		this.orignAssociationType = orignAssociationType;
	}

	public Dic getChangedAssociationType()
	{
		return changedAssociationType;
	}

	public void setChangedAssociationType(Dic changedAssociationType)
	{
		this.changedAssociationType = changedAssociationType;
	}

	public Dic getOrignIsMajor()
	{
		return orignIsMajor;
	}

	public void setOrignIsMajor(Dic orignIsMajor)
	{
		this.orignIsMajor = orignIsMajor;
	}

	public Dic getChangedIsMajor()
	{
		return changedIsMajor;
	}

	public void setChangedIsMajor(Dic changedIsMajor)
	{
		this.changedIsMajor = changedIsMajor;
	}

	public String getMemberId()
	{
		return memberId;
	}

	public void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}

	public Date getApplyDate()
	{
		return applyDate;
	}

	public void setApplyDate(Date applyDate)
	{
		this.applyDate = applyDate;
	}

	public BaseAcademyModel getCollege()
	{
		return college;
	}

	public void setCollege(BaseAcademyModel college)
	{
		this.college = college;
	}

	public String getAssociationAim()
	{
		return associationAim;
	}

	public void setAssociationAim(String associationAim)
	{
		this.associationAim = associationAim;
	}

	public double getAssociationFee()
    {
    	return associationFee;
    }

	public void setAssociationFee(double associationFee)
    {
    	this.associationFee = associationFee;
    }

	public Dic getIsOpen()
    {
    	return isOpen;
    }

	public void setIsOpen(Dic isOpen)
    {
    	this.isOpen = isOpen;
    }

	public Dic getOpenScope()
    {
    	return openScope;
    }

	public void setOpenScope(Dic openScope)
    {
    	this.openScope = openScope;
    }

	public String getAdvisorStatus()
    {
    	return advisorStatus;
    }

	public void setAdvisorStatus(String advisorStatus)
    {
    	this.advisorStatus = advisorStatus;
    }

	public String getMajorId()
    {
    	return majorId;
    }

	public void setMajorId(String majorId)
    {
    	this.majorId = majorId;
    }

	public String getMajorName()
    {
    	return majorName;
    }

	public void setMajorName(String majorName)
    {
    	this.majorName = majorName;
    }
	
}