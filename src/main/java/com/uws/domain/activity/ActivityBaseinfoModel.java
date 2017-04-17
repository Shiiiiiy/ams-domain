package com.uws.domain.activity;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.association.AssociationBaseinfoModel;
import com.uws.domain.base.BaseTeacherModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.domain.volunteer.VolunteerOfficeModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.Position;
import com.uws.user.model.User;

/**
 * 活动基本信息实体类
 */
public class ActivityBaseinfoModel extends BaseModel {

	private static final long serialVersionUID = 2486810573994640519L;

	/**
	 * 活动名称
	 */
	private String activityName;

	/**
	 * 活动时间
	 */
	private Date activityTime;

	/**
	 * 活动申请时间
	 */
	private Date applyTime;

	/**
	 * 活动地点
	 */
	private String activityAddress;
	
	/**
	 * 志愿者基地
	 */
	private VolunteerOfficeModel volunteerAddress;

	/**
	 * 活动简介
	 */
	private String activityIntro;

	/**
	 * 活动参与人数(只包括学生)
	 */
	private int members;

	/**
	 * 活动负责人
	 */
	private BaseTeacherModel manager;
	
	/**
	 * 活动组织部门联系人（老师和学生）
	 */
	private BaseTeacherModel contactTeachers;
	private StudentInfoModel contactStudents;

	/**
	 * 活动负责人联系电话
	 */
	private String managerPhone;

	/**
	 * 活动安全安排
	 */
	private String security;

	/**
	 * 交通安排(校外活动)
	 */
	private String trafficPlan;

	/**
	 * 活动级别(学校级、学院级、社团级)
	 */
	private Dic activityLevel;
	
	/**
	 * 社团实体
	 */
	private AssociationBaseinfoModel association;

	/**
	 * 学院
	 */
	private String collegeIds;

	/**
	 * 专业
	 */
	private String majorIds;

	/**
	 * 班级
	 */
	private String classIds;

	/**
	 * 活动类型(社团活动、社会实践、志愿服务、团学活动、其他)
	 */
	private Dic activityType;

	/**
	 * 活动类别(校内活动、校外活动)
	 */
	private Dic activityCategory;
	
	/**
	 * 活动报名方式（线上线下）
	 */
	private Dic registraForm;

	/**
	 * 工作人员数目
	 */
	private int workerNum;

	/**
	 * 联系单位负责人(校内活动)
	 */
	private BaseTeacherModel unitManager;

	/**
	 * 单位负责人职务(校内活动)
	 */
	private Position unitPosition;

	/**
	 * 联系单位办公电话(校内活动)
	 */
	private String unitPhone;

	/**
	 * 联系单位手机(校内活动)
	 */
	private String unitCellphone;

	/**
	 * 审批意见(审批流)
	 */
	private String suggest;

	/**
	 * 流程审批状态(审批流)
	 */
	private String processStatus;

	/**
	 * 节点审批状态
	 */
	private String approveResult;

	/**
	 * 下一节点办理人
	 */
	private User nextApprover;

	/**
	 * 创建人
	 */
	private StudentInfoModel creator;

	/**
	 * 删除状态
	 */
	private Dic deleteStatus;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 活动是否举行
	 */
	private Dic holdStatus;
	
	/**
	 * 活动是否可报名
	 */
	private Dic isSignStatus;

	/**
	 * 总结
	 */
	private String summary;
	
	/**
	 * 总结状态
	 */
	private String summaryStatus;
	/**
	 * 未举办原因
	 */
	private String reason;
	/**
	 * 学生报名审核状态(临时字段)
	 */
	private String signupStatus;
	/**
	 * 组织者
	 * @return
	 */
	private String organizer;
	
	//工作人员string
	private String workers;
	
	
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getActivityAddress() {
		return activityAddress;
	}

	public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress;
	}

	public VolunteerOfficeModel getVolunteerAddress() {
		return volunteerAddress;
	}

	public void setVolunteerAddress(VolunteerOfficeModel volunteerAddress) {
		this.volunteerAddress = volunteerAddress;
	}

	public String getActivityIntro() {
		return activityIntro;
	}

	public void setActivityIntro(String activityIntro) {
		this.activityIntro = activityIntro;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public BaseTeacherModel getManager() {
		return manager;
	}

	public void setManager(BaseTeacherModel manager) {
		this.manager = manager;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getTrafficPlan() {
		return trafficPlan;
	}

	public void setTrafficPlan(String trafficPlan) {
		this.trafficPlan = trafficPlan;
	}

	public Dic getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(Dic activityLevel) {
		this.activityLevel = activityLevel;
	}

	public AssociationBaseinfoModel getAssociation() {
		return association;
	}

	public void setAssociation(AssociationBaseinfoModel association) {
		this.association = association;
	}

	public String getCollegeIds() {
		return collegeIds;
	}

	public void setCollegeIds(String collegeIds) {
		this.collegeIds = collegeIds;
	}

	public String getMajorIds() {
		return majorIds;
	}

	public void setMajorIds(String majorIds) {
		this.majorIds = majorIds;
	}

	public String getClassIds() {
		return classIds;
	}

	public void setClassIds(String classIds) {
		this.classIds = classIds;
	}

	public Dic getActivityType() {
		return activityType;
	}

	public void setActivityType(Dic activityType) {
		this.activityType = activityType;
	}

	public Dic getActivityCategory() {
		return activityCategory;
	}

	public void setActivityCategory(Dic activityCategory) {
		this.activityCategory = activityCategory;
	}

	public Dic getRegistraForm() {
		return registraForm;
	}

	public void setRegistraForm(Dic registraForm) {
		this.registraForm = registraForm;
	}

	public int getWorkerNum() {
		return workerNum;
	}

	public void setWorkerNum(int workerNum) {
		this.workerNum = workerNum;
	}

	public BaseTeacherModel getUnitManager() {
		return unitManager;
	}

	public void setUnitManager(BaseTeacherModel unitManager) {
		this.unitManager = unitManager;
	}

	public Position getUnitPosition() {
		return unitPosition;
	}

	public void setUnitPosition(Position unitPosition) {
		this.unitPosition = unitPosition;
	}

	public String getUnitPhone() {
		return unitPhone;
	}

	public void setUnitPhone(String unitPhone) {
		this.unitPhone = unitPhone;
	}

	public String getUnitCellphone() {
		return unitCellphone;
	}

	public void setUnitCellphone(String unitCellphone) {
		this.unitCellphone = unitCellphone;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}

	public User getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(User nextApprover) {
		this.nextApprover = nextApprover;
	}

	public StudentInfoModel getCreator() {
		return creator;
	}

	public void setCreator(StudentInfoModel creator) {
		this.creator = creator;
	}

	public Dic getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Dic deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Dic getHoldStatus() {
		return holdStatus;
	}

	public void setHoldStatus(Dic holdStatus) {
		this.holdStatus = holdStatus;
	}

	public Dic getIsSignStatus() {
		return isSignStatus;
	}

	public void setIsSignStatus(Dic isSignStatus) {
		this.isSignStatus = isSignStatus;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummaryStatus() {
		return summaryStatus;
	}

	public void setSummaryStatus(String summaryStatus) {
		this.summaryStatus = summaryStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSignupStatus() {
		return signupStatus;
	}

	public void setSignupStatus(String signupStatus) {
		this.signupStatus = signupStatus;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getWorkers()
    {
    	return workers;
    }

	public void setWorkers(String workers)
    {
    	this.workers = workers;
    }


	public BaseTeacherModel getContactTeachers()
    {
    	return contactTeachers;
    }

	public void setContactTeachers(BaseTeacherModel contactTeachers)
    {
    	this.contactTeachers = contactTeachers;
    }

	public StudentInfoModel getContactStudents()
    {
    	return contactStudents;
    }

	public void setContactStudents(StudentInfoModel contactStudents)
    {
    	this.contactStudents = contactStudents;
    }


	
	
	
	
}