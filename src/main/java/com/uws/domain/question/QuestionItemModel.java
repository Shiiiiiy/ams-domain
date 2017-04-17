package com.uws.domain.question;

import java.util.List;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 *	问题基础信息
 */
public class QuestionItemModel extends BaseModel{

	/**
	 * @Filds serialVersionUID:序列化ID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 题目名称
	 */
	private String itemName;
	
	/**
	 * 题目分类
	 */
	private Dic itemCategory;
	
	/**
	 * 题目类型
	 */
	private Dic itemType;
	
	/**
	 * 题目状态（禁用/启用）
	 */
	private Dic useStatus;
	
	/**
	 * 是否必填（是/否）
	 */
	private Dic required;
	
	/**
	 * 创建者
	 */
	private User creator;
	
	/**
	 * 删除状态
	 */
	private Dic status;
	
	/**
	 *查询_临时字段_开始时间
	 */
	private String beginTime;
	
	/**
	 *查询_临时字段_结束时间
	 */
	private String endTime;
	
	/**
	 * 购物车临时字段
	 */
	private String info;
	
	/**
	 * 问题项列表
	 * 修改人：duanws
	 * 2015.07.22
	 */
	private List<QuestionOptionModel> quesOptionList;
	

	public Dic getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(Dic itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Dic getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Dic useStatus) {
		this.useStatus = useStatus;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Dic getItemType() {
		return itemType;
	}

	public void setItemType(Dic itemType) {
		this.itemType = itemType;
	}

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

	public Dic getRequired() {
		return required;
	}

	public void setRequired(Dic required) {
		this.required = required;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	

	public List<QuestionOptionModel> getQuesOptionList() {
		return quesOptionList;
	}

	public void setQuesOptionList(List<QuestionOptionModel> quesOptionList) {
		this.quesOptionList = quesOptionList;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
