package com.uws.domain.league;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 团员基本信息实体类
 */
public class LeagueMemberInfoModel extends BaseModel {

	private static final long serialVersionUID = 20630462256621311L;

	/**
	 * 学生对象
	 */
	private StudentInfoModel stuInfo;

	/**
	 * 是否团支书
	 */
	private Dic isSecretary;

	/**
	 * 政治面貌
	 */
	private Dic memberType;

	/**
	 * 入团时间
	 */
	private Date joinTime;
	
	/**
	 * 团内外职务
	 */
	private String leaguePosition;

	/**
	 * 是否提交入党申请书
	 */
	private Dic isPartyApply;
	/**
	 * 提交入党申请书时间
	 */
	private Date partyApplyTime;

	/**
	 * 是否获得团内荣誉
	 */
	private Dic isHaveHonor;

	/**
	 * 是否参加团干培训
	 */
	private Dic isTrianing;
	/**
	 * 团干培训时间
	 */
	private Date trianingTime;

	/**
	 * 是否推优
	 */
	private Dic isRecommoned;
	/**
	 * 推优时间
	 */
	private Date recommonedTime;
	/**
	 * 入党时间
	 */
	private Date partyTime;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;

	private String stuNumberText;

	public StudentInfoModel getStuInfo() {
		return stuInfo;
	}

	public void setStuInfo(StudentInfoModel stuInfo) {
		this.stuInfo = stuInfo;
	}

	public Dic getIsSecretary() {
		return isSecretary;
	}

	public void setIsSecretary(Dic isSecretary) {
		this.isSecretary = isSecretary;
	}

	public Dic getMemberType() {
		return memberType;
	}

	public void setMemberType(Dic memberType) {
		this.memberType = memberType;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	
	public String getLeaguePosition() {
		return leaguePosition;
	}

	public void setLeaguePosition(String leaguePosition) {
		this.leaguePosition = leaguePosition;
	}

	public Dic getIsPartyApply() {
		return isPartyApply;
	}

	public void setIsPartyApply(Dic isPartyApply) {
		this.isPartyApply = isPartyApply;
	}
	
	public Date getPartyApplyTime() {
		return partyApplyTime;
	}

	public void setPartyApplyTime(Date partyApplyTime) {
		this.partyApplyTime = partyApplyTime;
	}

	public Dic getIsHaveHonor() {
		return isHaveHonor;
	}

	public void setIsHaveHonor(Dic isHaveHonor) {
		this.isHaveHonor = isHaveHonor;
	}

	public Dic getIsTrianing() {
		return isTrianing;
	}

	public void setIsTrianing(Dic isTrianing) {
		this.isTrianing = isTrianing;
	}

	public Dic getIsRecommoned() {
		return isRecommoned;
	}

	public void setIsRecommoned(Dic isRecommoned) {
		this.isRecommoned = isRecommoned;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	

	public String getStuNumberText() {
		return stuNumberText;
	}

	public void setStuNumberText(String stuNumberText) {
		this.stuNumberText = stuNumberText;
	}

	public Date getTrianingTime() {
		return trianingTime;
	}

	public void setTrianingTime(Date trianingTime) {
		this.trianingTime = trianingTime;
	}

	public Date getRecommonedTime() {
		return recommonedTime;
	}

	public void setRecommonedTime(Date recommonedTime) {
		this.recommonedTime = recommonedTime;
	}

	public Date getPartyTime() {
		return partyTime;
	}

	public void setPartyTime(Date partyTime) {
		this.partyTime = partyTime;
	}

	
	
	

}