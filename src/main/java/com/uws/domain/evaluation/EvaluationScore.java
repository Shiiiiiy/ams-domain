package com.uws.domain.evaluation;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * @Description 综合测评基础分
 * @author Jiangbl
 * @date 2015-8-13
 */
public class EvaluationScore extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 基础类型
	 */
	private Dic baseType;
	
	/**
	 * 分数类型
	 */
	private Dic scoreType;	
	
	/**
	 * 分数
	 */
	private String score;	
	
	/**
	 * 操作人
	 */
	private User creator;	
	
	public Dic getBaseType() {
		return baseType;
	}
	
	public void setBaseType(Dic baseType) {
		this.baseType = baseType;
	}
	
	public Dic getScoreType() {
		return scoreType;
	}
	
	public void setScoreType(Dic scoreType) {
		this.scoreType = scoreType;
	}
	
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
}
