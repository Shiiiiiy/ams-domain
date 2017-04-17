package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 *	问卷答案详细信息
 */
public class QuestionAnswerDetailModel extends BaseModel {

	private static final long serialVersionUID = -275691081866084908L;

	/**
	 * 答卷实体
	 */
	private QuestionAnswerBaseModel answerBaseInfo;

	/**
	 * 答题人
	 */
	private User respondent;

	/**
	 * 问卷类型
	 */
	private String quesnaireType;

	/**
	 * 问卷实体
	 */
	private QuestionInfoModel questionInfo;

	/**
	 * 题目实体
	 */
	private  QuestionInfoItemModel paperItemInfo;

	/**
	 * 选项实体
	 */
	private  QuestionItemOptionModel itemOptionInfo;

	/**
	 * 题目类型
	 */
	private Dic itemType;

	/**
	 * 题目名称
	 */
	private String itemName;

	/**
	 * 问题顺序
	 */
	private Integer itemSeq;

	/**
	 * 选项顺序
	 */
	private Integer optionSeq;
	
	/**
	 * 题型顺序
	 */
	private Integer itemTypeSeq;

	/**
	 * 选项编码
	 */
	private String optionCode;

	/**
	 * 选项名称
	 */
	private String optionName;
	
	/**
	 * 当前答案是否选中
	 */
	private String checked;

	/**
	 * 主观题答案
	 */
	private String itemAnswer;
	
	public QuestionAnswerBaseModel getAnswerBaseInfo() {
		return answerBaseInfo;
	}

	public void setAnswerBaseInfo(QuestionAnswerBaseModel answerBaseInfo) {
		this.answerBaseInfo = answerBaseInfo;
	}

	public User getRespondent() {
		return respondent;
	}

	public void setRespondent(User respondent) {
		this.respondent = respondent;
	}

	public String getQuesnaireType() {
		return quesnaireType;
	}

	public void setQuesnaireType(String quesnaireType) {
		this.quesnaireType = quesnaireType;
	}

	public QuestionInfoModel getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(QuestionInfoModel questionInfo) {
		this.questionInfo = questionInfo;
	}

	public QuestionInfoItemModel getPaperItemInfo() {
		return paperItemInfo;
	}

	public void setPaperItemInfo(QuestionInfoItemModel paperItemInfo) {
		this.paperItemInfo = paperItemInfo;
	}

	public QuestionItemOptionModel getItemOptionInfo() {
		return itemOptionInfo;
	}

	public void setItemOptionInfo(QuestionItemOptionModel itemOptionInfo) {
		this.itemOptionInfo = itemOptionInfo;
	}

	public Dic getItemType() {
		return itemType;
	}

	public void setItemType(Dic itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemSeq() {
		return itemSeq;
	}

	public void setItemSeq(Integer itemSeq) {
		this.itemSeq = itemSeq;
	}

	public Integer getOptionSeq() {
		return optionSeq;
	}

	public void setOptionSeq(Integer optionSeq) {
		this.optionSeq = optionSeq;
	}

	public Integer getItemTypeSeq() {
		return itemTypeSeq;
	}

	public void setItemTypeSeq(Integer itemTypeSeq) {
		this.itemTypeSeq = itemTypeSeq;
	}

	public String getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getItemAnswer() {
		return itemAnswer;
	}

	public void setItemAnswer(String itemAnswer) {
		this.itemAnswer = itemAnswer;
	}

}
