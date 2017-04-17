package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 问卷-问题中间表
 */
public class QuestionInfoItemModel extends BaseModel {

	private static final long serialVersionUID = 3750789982525826539L;

	/**
	 * 问卷
	 */
	private QuestionInfoModel questionInfo;

	/**
	 * 问题
	 */
	private QuestionItemModel questionItem;

	/**
	 * 问题名称
	 */
	private String itemName;

	/**
	 * 问题分类
	 */
	private Dic itemCategory;
	
	/**
	 * 是否必填
	 */
	private Dic itemRequired;

	/**
	 * 题型
	 */
	private Dic itemType;

	/**
	 * 问题显示顺序
	 */
	private int quesSeqNum;
	
	/**
	 * 题型序号
	 */
	private int itemTypeSeq;

	/**
	 * 逻辑删除状态
	 */
	private Dic delStatusDic;

	public QuestionInfoModel getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(QuestionInfoModel questionInfo) {
		this.questionInfo = questionInfo;
	}

	public QuestionItemModel getQuestionItem() {
		return questionItem;
	}

	public void setQuestionItem(QuestionItemModel questionItem) {
		this.questionItem = questionItem;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Dic getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(Dic itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Dic getItemRequired() {
		return itemRequired;
	}

	public void setItemRequired(Dic itemRequired) {
		this.itemRequired = itemRequired;
	}

	public Dic getItemType() {
		return itemType;
	}

	public void setItemType(Dic itemType) {
		this.itemType = itemType;
	}

	public int getQuesSeqNum() {
		return quesSeqNum;
	}

	public void setQuesSeqNum(int quesSeqNum) {
		this.quesSeqNum = quesSeqNum;
	}

	public int getItemTypeSeq() {
		return itemTypeSeq;
	}

	public void setItemTypeSeq(int itemTypeSeq) {
		this.itemTypeSeq = itemTypeSeq;
	}

	public Dic getDelStatusDic() {
		return delStatusDic;
	}

	public void setDelStatusDic(Dic delStatusDic) {
		this.delStatusDic = delStatusDic;
	}

}
