package com.uws.domain.volunteer;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 志愿者基本信息实体类
 */
public class VolunteerBaseinfoModel extends BaseModel {

	private static final long serialVersionUID = 693780383392602518L;

	/**
	 * 学生信息
	 */
	private StudentInfoModel stuInfo;

	/**
	 * 志愿者(注册号)
	 */
	private String registerNum;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	/**
	 * QQ号
	 */
	private String qqNumber;

	/**
	 * 其他联系方式
	 */
	private String otherContacts;

	/**
	 * 兴趣爱好
	 */
	private String hobby;

	/**
	 * 志愿者(在校开始时间)
	 */
	private Date beginTime;

	/**
	 * 志愿者(在校结束时间)
	 */
	private Date endTime;

	/**
	 * 是否参加培训
	 */
	private Dic isTraining;

	/**
	 * 是否获得荣誉
	 */
	private Dic isHavehonor;

	/**
	 * 其他职务
	 */
	private String otherPosition;
	/**
	 * 状态
	 */
	private Dic status;

	/**
	 * 志愿者申请时间
	 */
	private Date applyTime;
	
	/**
	 * 审核人
	 */
	private User approverPo;
	
	/**
	 * 审核时间
	 */
	private Date approveTime;
	/**
	 * 志愿者审批结果
	 */
	private Dic approveResult;

	/**
	 * 志愿者审核意见(不走审批流)
	 */
	private String suggest;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	
	//志愿者简述
	private String sketch;
	
	
	
	//志愿者信息 查询控件显示用
	private String volunteerInfo;

	public StudentInfoModel getStuInfo() {
		return stuInfo;
	}

	public void setStuInfo(StudentInfoModel stuInfo) {
		this.stuInfo = stuInfo;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getQqNumber() {
		return qqNumber;
	}

	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	public String getOtherContacts() {
		return otherContacts;
	}

	public void setOtherContacts(String otherContacts) {
		this.otherContacts = otherContacts;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Dic getIsTraining() {
		return isTraining;
	}

	public void setIsTraining(Dic isTraining) {
		this.isTraining = isTraining;
	}

	public Dic getIsHavehonor() {
		return isHavehonor;
	}

	public void setIsHavehonor(Dic isHavehonor) {
		this.isHavehonor = isHavehonor;
	}

	public String getOtherPosition() {
		return otherPosition;
	}

	public void setOtherPosition(String otherPosition) {
		this.otherPosition = otherPosition;
	}
	
	public Dic getStatus() {
		return status;
	}

	public void setStatus(Dic status) {
		this.status = status;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public User getApproverPo() {
		return approverPo;
	}

	public void setApproverPo(User approverPo) {
		this.approverPo = approverPo;
	}

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}


	public Dic getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(Dic approveResult) {
		this.approveResult = approveResult;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getVolunteerInfo() {
		return volunteerInfo;
	}

	public void setVolunteerInfo(String volunteerInfo) {
		this.volunteerInfo = volunteerInfo;
	}

	public String getSketch()
    {
    	return sketch;
    }

	public void setSketch(String sketch)
    {
    	this.sketch = sketch;
    }
	
	

}