package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 *	问题选项基础信息
 */
public class QuestionOptionModel extends BaseModel {

	private static final long serialVersionUID = 1L;

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
	private int seqNum;

	/**
	 * 所属问题
	 */
	private QuestionItemModel item;

	/**
	 * 选项链接
	 */
	private String optionUrl;

	/**
	 * 删除状态
	 */
	private Dic status;

	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
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

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public QuestionItemModel getItem() {
		return item;
	}

	public void setItem(QuestionItemModel item) {
		this.item = item;
	}

	public String getOptionUrl() {
		return optionUrl;
	}

	public void setOptionUrl(String optionUrl) {
		this.optionUrl = optionUrl;
	}

}
