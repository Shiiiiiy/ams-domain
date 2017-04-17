package com.uws.domain.association;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.sys.model.UploadFileRef;

/**
 * 社团申请实体类
 */
public class AssociationAttacheModel extends BaseModel {

	private static final long serialVersionUID = -240928874095431255L;

	/**
	 * 申请业务主键
	 */
	private AssociationApplyModel applyPo;
	
	/**
	 * 附件类型
	 */
	private String attacheType;
	
	/**
	 * 附件对象
	 */
	private UploadFileRef attachePo;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	public AssociationApplyModel getApplyPo() {
		return applyPo;
	}

	public void setApplyPo(AssociationApplyModel applyPo) {
		this.applyPo = applyPo;
	}

	public String getAttacheType() {
		return attacheType;
	}

	public void setAttacheType(String attacheType) {
		this.attacheType = attacheType;
	}

	public UploadFileRef getAttachePo() {
		return attachePo;
	}

	public void setAttachePo(UploadFileRef attachePo) {
		this.attachePo = attachePo;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}