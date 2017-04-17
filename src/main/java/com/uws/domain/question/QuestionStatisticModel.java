package com.uws.domain.question;

import java.util.List;

import com.uws.core.base.BaseModel;

/**
 * 问卷统计—问卷实体类（临时）
 */
public class QuestionStatisticModel extends BaseModel{

	private static final long serialVersionUID = -6959147168004066735L;
	
	/**
	 * 问卷基本信息
	 */
	private QuestionInfoModel question;
	
	/**
	 * 回答人数
	 */
	private long answerNum;
	
	/**
	 * 与问卷相关的题目
	 */
	private List<QuestionStatisticItemModel> itemList;
	
	public List<QuestionStatisticItemModel> getItemList() {
		return itemList;
	}

	public void setItemList(List<QuestionStatisticItemModel> itemList) {
		this.itemList = itemList;
	}

	public QuestionInfoModel getQuestion() {
		return question;
	}

	public void setQuestion(QuestionInfoModel question) {
		this.question = question;
	}

	public long getAnswerNum() {
		return answerNum;
	}

	public void setAnswerNum(long answerNum2) {
		this.answerNum = answerNum2;
	}
	
	
}
