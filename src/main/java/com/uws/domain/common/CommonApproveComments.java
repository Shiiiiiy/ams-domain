package com.uws.domain.common;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.user.model.User;

/**
 * 
* @ClassName: CommonApproveComments 
* @Description: 审核意见
* @author 联合永道
* @date 2015-9-24 上午11:23:36 
*
 */
public class CommonApproveComments extends BaseModel
{
    private static final long serialVersionUID = 1199019008412120484L;
    
	private String objectId;
	private User approver;
	private String approveOpinion;
	private String approveComments;
	private Date approveTime;
	private User creator;

	/**
	 * 
	 * Title: 默认构造方法
	 * Description:
	 */
	public CommonApproveComments()
	{
		super();
	}
	
	/**
	 * 
	 * Title: 带参数的构造方法 
	 * Description: 
	 * @param objectId
	 * @param approver
	 * @param approveOpinion
	 * @param approveComments
	 * @param approveTime
	 * @param creator
	 */
	public CommonApproveComments(String objectId, User approver,
            String approveOpinion, String approveComments, Date approveTime,
            User creator)
    {
	    super();
	    this.objectId = objectId;
	    this.approver = approver;
	    this.approveOpinion = approveOpinion;
	    this.approveComments = approveComments;
	    this.approveTime = approveTime;
	    this.creator = creator;
    }



	public String getObjectId()
    {
    	return objectId;
    }
	public void setObjectId(String objectId)
    {
    	this.objectId = objectId;
    }
	public User getApprover()
    {
    	return approver;
    }
	public String getApproveOpinion()
    {
    	return approveOpinion;
    }
	public void setApproveOpinion(String approveOpinion)
    {
    	this.approveOpinion = approveOpinion;
    }
	public void setApprover(User approver)
    {
    	this.approver = approver;
    }
	public String getApproveComments()
    {
    	return approveComments;
    }
	public void setApproveComments(String approveComments)
    {
    	this.approveComments = approveComments;
    }
	public Date getApproveTime()
    {
    	return approveTime;
    }
	public void setApproveTime(Date approveTime)
    {
    	this.approveTime = approveTime;
    }
	public User getCreator()
    {
    	return creator;
    }
	public void setCreator(User creator)
    {
    	this.creator = creator;
    }

}
