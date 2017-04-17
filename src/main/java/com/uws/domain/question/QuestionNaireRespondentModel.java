package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.user.model.User;
import com.uws.sys.model.Dic;

/**
 * 问卷-答题人中间表
 */
public class QuestionNaireRespondentModel extends BaseModel {

	private static final long serialVersionUID = 1657371172749980950L;

	/**
	 * 问卷对象
	 */
	private QuestionInfoModel questionNairePo;

	/**
	 * 答题人
	 */
	private User respondent;

	/**
	 * 答题人姓名
	 */
	private String userName;
	
	/**
	 * 答题人类型
	 */
	private String userType;

	/**
	 * 逻辑删除状态
	 */
	private Dic delStatusDic;

	public QuestionInfoModel getQuestionNairePo() {
		return questionNairePo;
	}

	public void setQuestionNairePo(QuestionInfoModel questionNairePo) {
		this.questionNairePo = questionNairePo;
	}

	public User getRespondent() {
		return respondent;
	}

	public void setRespondent(User respondent) {
		this.respondent = respondent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Dic getDelStatusDic() {
		return delStatusDic;
	}

	public void setDelStatusDic(Dic delStatusDic) {
		this.delStatusDic = delStatusDic;
	}

}
