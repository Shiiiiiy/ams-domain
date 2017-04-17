package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 问卷答题基础信息
 */
public class QuestionAnswerBaseModel extends BaseModel {

	private static final long serialVersionUID = -275691081866084908L;
	
	/**
	 * 答题人
	 */
	private User respondent;
	
	/**
	 * 问卷
	 */
	private QuestionInfoModel questionInfo;
	
	/**
	 * 学生答卷的状态（未填写，未提交，已提交）
	 */
	private Dic answerStatus;

	/**
	 * 问卷类型（迎新、毕业等）
	 */
	private Dic quesnaireType;
	
	/**
	 * 问卷发布开始时间
	 */
	private String beginDate;
	
	/**
	 * 问卷发布结束时间
	 */
	private String stopDate;

	public Dic getQuesnaireType() {
		return quesnaireType;
	}

	public void setQuesnaireType(Dic quesnaireType) {
		this.quesnaireType = quesnaireType;
	}

	public User getRespondent() {
		return respondent;
	}

	public void setRespondent(User respondent) {
		this.respondent = respondent;
	}

	public QuestionInfoModel getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(QuestionInfoModel questionInfo) {
		this.questionInfo = questionInfo;
	}

	public Dic getAnswerStatus() {
		return answerStatus;
	}

	public void setAnswerStatus(Dic answerStatus) {
		this.answerStatus = answerStatus;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public String getStopDate() {
		return stopDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}

}
