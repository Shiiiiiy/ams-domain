package com.uws.domain.sponsor;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
* 
* @Title: DifficultStudentInfo.java 
* @Package com.uws.domain.sponsor 
* @Description: 困难生实体对象
* @author liuchen  
* @date 2015-7-30 上午10:41:53
*/
public class DifficultStudentInfo extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5247626981046897271L;
	//学生对象
	private StudentInfoModel student;
	//学年
	private Dic schoolYear;
	//困难级别
	private Dic difficultLevel;
	//人均收入
	private Double perCapita;
	//户口类型
	private Dic accountType;
	//家庭情况调查
	private Dic familySurvey;
	//家庭经济情况
	private Dic familyFinance;
	//村级证明
	private Dic villageProve;
	//镇级证明
	private Dic townProve;
	//县级证明
	private Dic countyProve;
	//助学贷款
	private Dic isStudentLoan;
	//低保证级别
	private Dic lowAssuranceLevel;
	//低保证编号
	private String lowAssuranceNumber;
	//救助证级别
	private Dic aidCertificateLevel;
	//救助证编号
	private String aidCertificateNumber;
	//是否是孤儿
	private Dic isOrphan;
	//残疾证类型
	private Dic disabilityCertificateKind;
	//残疾证级别
	//private Dic disabilityCertificateLevel;
	private String disabilityCertificateLevel;
	//残疾证编号
	private String disabilityCertificateNumber;
	//是否单亲
	private Dic isSingle;
	//是否烈士子女
	private Dic isMartyr;
	//备注
	private String remark;
	//申请理由
	private String applyReason;
	//申请时间
	private Date applyTime;
	//状态
	private Dic status;
	//困难生来源
	private String difficultSource;
	//删除状态
	private Dic delStatus;
	//下一节点办理人
	private User nextApprover;
	//流程审批状态
	private String approveStatus;
	//流程实例状态
	private String  processStatus;
	//审核意见
	private String approveReason;
	
	//查询用
    private BaseAcademyModel college;
	private BaseMajorModel major;
	private BaseClassModel classId;
	
	
	public StudentInfoModel getStudent() {
		return student;
	}
	public void setStudent(StudentInfoModel student) {
		this.student = student;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Dic getDifficultLevel() {
		return difficultLevel;
	}
	public void setDifficultLevel(Dic difficultLevel) {
		this.difficultLevel = difficultLevel;
	}
	public Double getPerCapita() {
		return perCapita;
	}
	public void setPerCapita(Double perCapita) {
		this.perCapita = perCapita;
	}
	public Dic getAccountType() {
		return accountType;
	}
	public void setAccountType(Dic accountType) {
		this.accountType = accountType;
	}
	public Dic getFamilySurvey() {
		return familySurvey;
	}
	public void setFamilySurvey(Dic familySurvey) {
		this.familySurvey = familySurvey;
	}
	public Dic getFamilyFinance() {
		return familyFinance;
	}
	public void setFamilyFinance(Dic familyFinance) {
		this.familyFinance = familyFinance;
	}
	public Dic getVillageProve() {
		return villageProve;
	}
	public void setVillageProve(Dic villageProve) {
		this.villageProve = villageProve;
	}
	public Dic getTownProve() {
		return townProve;
	}
	public void setTownProve(Dic townProve) {
		this.townProve = townProve;
	}
	public Dic getCountyProve() {
		return countyProve;
	}
	public void setCountyProve(Dic countyProve) {
		this.countyProve = countyProve;
	}
	public Dic getIsStudentLoan() {
		return isStudentLoan;
	}
	public void setIsStudentLoan(Dic isStudentLoan) {
		this.isStudentLoan = isStudentLoan;
	}
	public Dic getLowAssuranceLevel() {
		return lowAssuranceLevel;
	}
	public void setLowAssuranceLevel(Dic lowAssuranceLevel) {
		this.lowAssuranceLevel = lowAssuranceLevel;
	}
	public String getLowAssuranceNumber() {
		return lowAssuranceNumber;
	}
	public void setLowAssuranceNumber(String lowAssuranceNumber) {
		this.lowAssuranceNumber = lowAssuranceNumber;
	}
	public Dic getAidCertificateLevel() {
		return aidCertificateLevel;
	}
	public void setAidCertificateLevel(Dic aidCertificateLevel) {
		this.aidCertificateLevel = aidCertificateLevel;
	}
	public String getAidCertificateNumber() {
		return aidCertificateNumber;
	}
	public void setAidCertificateNumber(String aidCertificateNumber) {
		this.aidCertificateNumber = aidCertificateNumber;
	}
	public Dic getIsOrphan() {
		return isOrphan;
	}
	public void setIsOrphan(Dic isOrphan) {
		this.isOrphan = isOrphan;
	}
	public Dic getDisabilityCertificateKind() {
		return disabilityCertificateKind;
	}
	public void setDisabilityCertificateKind(Dic disabilityCertificateKind) {
		this.disabilityCertificateKind = disabilityCertificateKind;
	}
	
	public String getDisabilityCertificateLevel()
    {
    	return disabilityCertificateLevel;
    }
	public void setDisabilityCertificateLevel(String disabilityCertificateLevel)
    {
    	this.disabilityCertificateLevel = disabilityCertificateLevel;
    }
	public String getDisabilityCertificateNumber() {
		return disabilityCertificateNumber;
	}
	public void setDisabilityCertificateNumber(String disabilityCertificateNumber) {
		this.disabilityCertificateNumber = disabilityCertificateNumber;
	}
	public Dic getIsSingle() {
		return isSingle;
	}
	public void setIsSingle(Dic isSingle) {
		this.isSingle = isSingle;
	}
	public Dic getIsMartyr() {
		return isMartyr;
	}
	public void setIsMartyr(Dic isMartyr) {
		this.isMartyr = isMartyr;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getApplyReason() {
		return applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	public String getDifficultSource() {
		return difficultSource;
	}
	public void setDifficultSource(String difficultSource) {
		this.difficultSource = difficultSource;
	}
	public Dic getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(Dic delStatus) {
		this.delStatus = delStatus;
	}
	public User getNextApprover() {
		return nextApprover;
	}
	public void setNextApprover(User nextApprover) {
		this.nextApprover = nextApprover;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getApproveReason()
    {
    	return approveReason;
    }
	public void setApproveReason(String approveReason)
    {
    	this.approveReason = approveReason;
    }
	public BaseAcademyModel getCollege()
    {
    	return college;
    }
	public void setCollege(BaseAcademyModel college)
    {
    	this.college = college;
    }
	public BaseMajorModel getMajor()
    {
    	return major;
    }
	public void setMajor(BaseMajorModel major)
    {
    	this.major = major;
    }
	public BaseClassModel getClassId()
    {
    	return classId;
    }
	public void setClassId(BaseClassModel classId)
    {
    	this.classId = classId;
    }
	
	
	

}
