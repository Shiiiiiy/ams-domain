package com.uws.domain.message;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 信息发布实体类
 * @author Administrator
 *
 */
public class MessageInfo extends BaseModel {
	private static final long serialVersionUID = 6890130251018417407L;
	//标题
	private String title;
	//创建人
	private User creator;
	//修改人
	private User updatePerson;
	//信息类型
	private Dic messageType;
	//栏目
	private Dic messageColumn;
	//是否置顶
	private String isUp;
	//是否标红
	private String isRed;
	//发布状态
	private Dic postState;
	//发布日期
	private Date postDate;
	//序号
	private Integer seqNum;
	//信息内容
	private String messageContent;
	//开始时间（页面传值）
	private Date startDate;
	//结束时间（页面传值）
	private Date EndDate;
	
	/**
	 * 标题get方法
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 标题set方法
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 创建人get方法
	 * @return
	 */
	public User getCreator() {
		return creator;
	}
	/**
	 * 创建人set方法
	 * @param creator
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}
	/**
	 * 修改人get方法
	 * @return
	 */
	public User getUpdatePerson() {
		return updatePerson;
	}
	/**
	 * 修改人set方法
	 * @param updatePerson
	 */
	public void setUpdatePerson(User updatePerson) {
		this.updatePerson = updatePerson;
	}
	/**
	 * 信息类型get方法
	 * @return
	 */
	public Dic getMessageType() {
		return messageType;
	}
	/**
	 * 信息类型set方法
	 * @param messageType
	 */
	public void setMessageType(Dic messageType) {
		this.messageType = messageType;
	}
	/**
	 * 栏目get方法
	 * @return
	 */
	public Dic getMessageColumn() {
		return messageColumn;
	}
	
	/**
	 * 栏目set方法
	 * @param messageColumn
	 */
	public void setMessageColumn(Dic messageColumn) {
		this.messageColumn = messageColumn;
	}
	/**
	 * 是否置顶get方法
	 * @return
	 */
	public String getIsUp() {
		return isUp;
	}
	/**
	 * 是否置顶set方法
	 * @param isUp
	 */
	public void setIsUp(String isUp) {
		this.isUp = isUp;
	}
	/**
	 * 是否标红get方法
	 * @return
	 */
	public String getIsRed() {
		return isRed;
	}
	/**
	 * 是否标红set方法
	 * @param isRed
	 */
	public void setIsRed(String isRed) {
		this.isRed = isRed;
	}
	/**
	 * 发布状态get方法
	 * @return
	 */
	public Dic getPostState() {
		return postState;
	}
	/**
	 * 发布状态set方法
	 * @param postState
	 */
	public void setPostState(Dic postState) {
		this.postState = postState;
	}
	/**
	 * 信息内容get方法
	 * @return
	 */
	public String getMessageContent() {
		return messageContent;
	}
	/**
	 * 信息内容set方法
	 * @param messageContent
	 */
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	/**
	 * 序号get方法
	 * @return
	 */
	public Integer getSeqNum() {
		return seqNum;
	}
	/**
	 * 序号set方法
	 * @param seqNum
	 */
	public void setSeqNum(Integer seqNum) {
		this.seqNum = seqNum;
	}
	/**
	 * 发布日期get方法
	 * @return
	 */
	public Date getPostDate() {
		return postDate;
	}
	/**
	 * 发布日期set方法
	 * @param postDate
	 */
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}
