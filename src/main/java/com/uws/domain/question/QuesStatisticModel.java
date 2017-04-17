package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 问卷统计（视图）
 */
public class QuesStatisticModel extends BaseModel {

	private static final long serialVersionUID = -275691081866084908L;
	
	/**
	 * 选项id
	 */
	private String optionId;
	
	/**
	 * 选项名称
	 */
	private String optionName;
	
	/**
	 * 选项code
	 */
	private String optionCode;
	
	/**
	 * 题目名称
	 */
	private String itemName;
	
	/**
	 * 题目实体
	 */
	private QuestionItemModel item;
	
	/**
	 * 题目类型
	 */
	private Dic itemType;
	
	/**
	 * 问卷实体
	 */
	private QuestionInfoModel question;
	
	/**
	 * 答题人
	 */
	private User answer;
	
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public String getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public QuestionItemModel getItem() {
		return item;
	}
	public void setItem(QuestionItemModel item) {
		this.item = item;
	}
	public Dic getItemType() {
		return itemType;
	}
	public void setItemType(Dic itemType) {
		this.itemType = itemType;
	}
	public QuestionInfoModel getQuestion() {
		return question;
	}
	public void setQuestion(QuestionInfoModel question) {
		this.question = question;
	}
	public User getAnswer() {
		return answer;
	}
	public void setAnswer(User answer) {
		this.answer = answer;
	}
	
	
	
}
