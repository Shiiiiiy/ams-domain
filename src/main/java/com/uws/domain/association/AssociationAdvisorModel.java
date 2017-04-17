package com.uws.domain.association;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.sys.model.Dic;

/**
 * 社团指导老师实体类
 */
public class AssociationAdvisorModel extends BaseModel {

	private static final long serialVersionUID = 7073827339097542323L;

	/**
	 * 社团对象
	 */
	private AssociationBaseinfoModel associationPo;
	
	/**
	 * 社团申请对象
	 */
	private AssociationApplyModel associationApplyModel;

	/**
	 * 指导老师
	 */
	private BaseTeacherModel advisorPo;

	/**
	 * 联系方式(手机)
	 */
	private String phone;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	
	private String status; //判断是指导人保存还是提交

	public AssociationBaseinfoModel getAssociationPo() {
		return associationPo;
	}

	public void setAssociationPo(AssociationBaseinfoModel associationPo) {
		this.associationPo = associationPo;
	}

	public BaseTeacherModel getAdvisorPo() {
		return advisorPo;
	}

	public void setAdvisorPo(BaseTeacherModel advisorPo) {
		this.advisorPo = advisorPo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public AssociationApplyModel getAssociationApplyModel()
    {
    	return associationApplyModel;
    }

	public void setAssociationApplyModel(AssociationApplyModel associationApplyModel)
    {
    	this.associationApplyModel = associationApplyModel;
    }

	public String getStatus()
    {
    	return status;
    }

	public void setStatus(String status)
    {
    	this.status = status;
    }
	
	

}