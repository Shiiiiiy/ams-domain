package com.uws.domain.question;

import java.util.List;

import com.uws.core.base.BaseModel;

/**
 * 问卷统计—题目实体类（临时）
 */
public class QuestionStatisticItemModel  extends BaseModel{

	private static final long serialVersionUID = -6959147168004066735L;
	
	/**
	 * 问卷基本信息
	 */
	private QuestionInfoModel question;
	
	/**
	 * 题目基本信息
	 */
	private QuestionItemModel item;
	
	/**
	 * 与题目相关的答案选项
	 */
	private List<QuestionStatisticOptionModel> optionList;
	
	/**
	 * 答案选项的个数
	 */
	private int optionListSize;
	
	public int getOptionListSize() {
		return optionListSize;
	}

	public void setOptionListSize(int optionListSize) {
		this.optionListSize = optionListSize;
	}

	public QuestionInfoModel getQuestion() {
		return question;
	}

	public void setQuestion(QuestionInfoModel question) {
		this.question = question;
	}

	public QuestionItemModel getItem() {
		return item;
	}

	public void setItem(QuestionItemModel item) {
		this.item = item;
	}

	public List<QuestionStatisticOptionModel> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<QuestionStatisticOptionModel> optionList) {
		this.optionList = optionList;
	}
	
}
