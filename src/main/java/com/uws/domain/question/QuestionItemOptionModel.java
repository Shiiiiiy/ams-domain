package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 问题-选项中间表
 */
public class QuestionItemOptionModel extends BaseModel {

	private static final long serialVersionUID = 931550283667492772L;
	
	/**
	 * 问卷
	 */
	private QuestionInfoModel questionNaire;

	/**
	 * 问卷问题ID
	 */
	private String paperItemId;
	
	/**
	 * 问题名称
	 */
	private String itemName;
	
	/**
	 * 问题序号
	 */
	private Integer itemSeq;
	
	/**
	 * 题型序号
	 */
	private Integer itemTypeSeq;
	
	/**
	 * 问题类型
	 */
	private Dic itemType;

	/**
	 * 选项
	 */
	private QuestionOptionModel itemOption;

	/**
	 * 选项名称
	 */
	private String optionName;

	/**
	 * 选项编码
	 */
	private String optionCode;
	
	/**
	 * 选项顺序
	 */
	private Integer seqnum;

	/**
	 * 选项超链接
	 */
	private String optionUrl;

	/**
	 * 逻辑删除状态
	 */
	private Dic delStatusDic;
	
	/**
	 * 客观题选中标志【临时字段】
	 * @return
	 */
	private String  checked;
	
	/**
	 * 主观题答案【临时字段】
	 * @return
	 */
	private String answer;

	public QuestionInfoModel getQuestionNaire() {
		return questionNaire;
	}

	public void setQuestionNaire(QuestionInfoModel questionNaire) {
		this.questionNaire = questionNaire;
	}

	public String getPaperItemId() {
		return paperItemId;
	}

	public void setPaperItemId(String paperItemId) {
		this.paperItemId = paperItemId;
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

	public Integer getItemTypeSeq() {
		return itemTypeSeq;
	}

	public void setItemTypeSeq(Integer itemTypeSeq) {
		this.itemTypeSeq = itemTypeSeq;
	}

	public Dic getItemType() {
		return itemType;
	}

	public void setItemType(Dic itemType) {
		this.itemType = itemType;
	}

	public QuestionOptionModel getItemOption() {
		return itemOption;
	}

	public void setItemOption(QuestionOptionModel itemOption) {
		this.itemOption = itemOption;
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

	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}

	public String getOptionUrl() {
		return optionUrl;
	}

	public void setOptionUrl(String optionUrl) {
		this.optionUrl = optionUrl;
	}

	public Dic getDelStatusDic() {
		return delStatusDic;
	}

	public void setDelStatusDic(Dic delStatusDic) {
		this.delStatusDic = delStatusDic;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
