package com.uws.domain.association;

import java.util.Date;
import java.util.List;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.sys.model.UploadFileRef;

/**
 * 社员荣誉实体类
 */
public class AssociationHonorModel extends BaseModel {

	private static final long serialVersionUID = -6913326996611563077L;

	/**
	 * 社团对象
	 */
	private AssociationBaseinfoModel associationPo;

	/**
	 * 社团成员
	 */
	private AssociationMemberModel member;

	/**
	 * 荣誉名称
	 */
	private String honorName;

	/**
	 * 荣誉级别
	 */
	private Dic honorLevel;

	/**
	 * 获得荣誉时间
	 */
	private Date honorTime;

	/**
	 * 获得荣誉学年
	 */
	private Dic honorYear;

	/**
	 * 获得荣誉学期
	 */
	private Dic honorTerm;
	
	/**
	 * 操作状态
	 */
	private Dic operateStatus;

	/**
	 * 审核状态
	 */
	private Dic approveResult;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	
	private List<UploadFileRef> uploadFileList;
	/**
	 * 审核意见(不走审批流)
	 */
	private String suggest;
	public AssociationBaseinfoModel getAssociationPo() {
		return associationPo;
	}

	public void setAssociationPo(AssociationBaseinfoModel associationPo) {
		this.associationPo = associationPo;
	}

	public AssociationMemberModel getMember() {
		return member;
	}

	public void setMember(AssociationMemberModel member) {
		this.member = member;
	}

	public String getHonorName() {
		return honorName;
	}

	public void setHonorName(String honorName) {
		this.honorName = honorName;
	}

	public Dic getHonorLevel() {
		return honorLevel;
	}

	public void setHonorLevel(Dic honorLevel) {
		this.honorLevel = honorLevel;
	}

	public Date getHonorTime() {
		return honorTime;
	}

	public void setHonorTime(Date honorTime) {
		this.honorTime = honorTime;
	}

	public Dic getHonorYear() {
		return honorYear;
	}

	public void setHonorYear(Dic honorYear) {
		this.honorYear = honorYear;
	}

	public Dic getHonorTerm() {
		return honorTerm;
	}

	public void setHonorTerm(Dic honorTerm) {
		this.honorTerm = honorTerm;
	}

	public Dic getOperateStatus() {
		return operateStatus;
	}

	public void setOperateStatus(Dic operateStatus) {
		this.operateStatus = operateStatus;
	}

	public Dic getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(Dic approveResult) {
		this.approveResult = approveResult;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public List<UploadFileRef> getUploadFileList()
    {
    	return uploadFileList;
    }

	public void setUploadFileList(List<UploadFileRef> uploadFileList)
    {
    	this.uploadFileList = uploadFileList;
    }
	
}