package com.uws.domain.question;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 *	调查问卷实体类
 */
public class QuestionInfoModel extends BaseModel {

	private static final long serialVersionUID = -6959147168004066735L;
	/**
	 * 问卷ID【临时字段】
	 */
	private String questionNaireId;
	/**
	 * 问卷名称
	 */
	private String name;
	/**
	 * 发布日期
	 */
	private String releaseDate;
	/**
	 * 查询使用开始时间
	 */
	private String beginDate;
	/**
	 * 查询使用结束时间
	 */
	private String stopDate;
	/**
	 * 问卷类型
	 */
	private Dic typeDic;
	/**
	 * 问卷类型临时字段
	 */
	private String paperCategory;
	/**
	 * 问卷状态
	 */
	private Dic statusDic;
	/**
	 * 创建人
	 */
	private User creator;
	/**
	 * 修改人
	 */
	private User updater;
	/**
	 * 逻辑删除状态
	 */
	private Dic delStatusDic;
	
	/**
	 * 问卷是否公开
	 * @return
	 */
	private String isOpen;

	public String getQuestionNaireId() {
		return questionNaireId;
	}

	public void setQuestionNaireId(String questionNaireId) {
		this.questionNaireId = questionNaireId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getStopDate() {
		return stopDate;
	}

	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}

	public Dic getTypeDic() {
		return typeDic;
	}

	public void setTypeDic(Dic typeDic) {
		this.typeDic = typeDic;
	}

	public Dic getStatusDic() {
		return statusDic;
	}

	public String getPaperCategory() {
		return paperCategory;
	}

	public void setPaperCategory(String paperCategory) {
		this.paperCategory = paperCategory;
	}

	public void setStatusDic(Dic statusDic) {
		this.statusDic = statusDic;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getUpdater() {
		return updater;
	}

	public void setUpdater(User updater) {
		this.updater = updater;
	}

	public Dic getDelStatusDic() {
		return delStatusDic;
	}

	public void setDelStatusDic(Dic delStatusDic) {
		this.delStatusDic = delStatusDic;
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

}
