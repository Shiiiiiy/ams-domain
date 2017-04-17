package com.uws.domain.reward;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;


/**
 * @author zhangyb
 * @version:2015年8月17日 下午4:27:41
 * @Description:评奖评优项目实体类
 */
public class AwardInfo extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 评奖/评优
	 */
	private Dic awardType;
	
	/**
	 * 评奖评优名称
	 */
	private String awardName;
	
	/**
	 * 评奖评优编码
	 */
	private long awardCode;
	
	/**
	 * 评奖评优状态
	 */
	private Dic awardStatus;
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 适用对象
	 */
	private Dic availableObject;

	public Dic getAwardType() {
		return awardType;
	}

	public void setAwardType(Dic awardType) {
		this.awardType = awardType;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public long getAwardCode() {
		return awardCode;
	}

	public void setAwardCode(long awardCode) {
		this.awardCode = awardCode;
	}

	public Dic getAwardStatus() {
		return awardStatus;
	}

	public void setAwardStatus(Dic awardStatus) {
		this.awardStatus = awardStatus;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Dic getAvailableObject() {
		return availableObject;
	}

	public void setAvailableObject(Dic availableObject) {
		this.availableObject = availableObject;
	}


	
	
}
