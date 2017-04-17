package com.uws.domain.orientation;

import java.io.Serializable;
import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: StudentGuardianMadel
 * @Description: 学生监护人信息
 * @author wangcl
 * @date 2015-07-21
 */
public class StudentGuardianModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3396206182295392089L;
	
	/**
	 * 学生基本信息
	 */
	private StudentInfoModel studentInfo;
	
	/**
	 * 父亲Id
	 */
	private String fatherId;
	
	/**
	 * 父亲姓名
	 */
	private String fatherName;
	
	/**
	 * 父亲手机
	 */
	private String fatherPhone;
	
	/**
	 * 父亲邮箱
	 */
	private String fatherEmail;
	
	/**
	 * 父亲住址
	 */
	private String fatherAddress;
	
	
	/**
	 * 父亲邮编
	 */
	private String fatherPostCode;
	
	/**
	 * 父亲工作单位
	 */
	private String fatherWorkUnit;
	
	/**
	 * 母亲Id
	 */
	private String motherId;
	
	/**
	 * 母亲姓名
	 */
	private String motherName;
	
	/**
	 * 母亲手机
	 */
	private String motherPhone;
	
	/**
	 * 母亲邮箱
	 */
	private String motherEmail;
	
	/**
	 * 母亲住址
	 */
	private String motherAddress;
	
	
	/**
	 * 母亲邮编
	 */
	private String motherPostCode;
	
	/**
	 * 母亲工作单位
	 */
	private String motherWorkUnit;
	
	/**
	 * 监护人Id
	 */
	private String guardianId;
	
	/**
	 * 监护人姓名
	 */
	private String guardianName;
	
	/**
	 * 监护人手机
	 */
	private String guardianPhone;
	
	/**
	 * 监护人邮箱
	 */
	private String guardianEmail;
	
	/**
	 * 监护人住址
	 */
	private String guardianAddress;
	
	
	/**
	 * 监护人邮编
	 */
	private String guardianPostCode;
	
	/**
	 * 监护人工作单位
	 */
	private String guardianWorkUnit;
	
	/**
	 * 顺序号
	 */
	private String seqNum;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	
	/**
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	
	/**
	 * 修改人
	 */
	private User updater;


	public StudentInfoModel getStudentInfo() {
		return studentInfo;
	}


	public void setStudentInfo(StudentInfoModel studentInfo) {
		this.studentInfo = studentInfo;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getFatherPhone() {
		return fatherPhone;
	}


	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}


	public String getFatherEmail() {
		return fatherEmail;
	}


	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}


	public String getFatherAddress() {
		return fatherAddress;
	}


	public void setFatherAddress(String fatherAddress) {
		this.fatherAddress = fatherAddress;
	}


	public String getFatherPostCode() {
		return fatherPostCode;
	}


	public void setFatherPostCode(String fatherPostCode) {
		this.fatherPostCode = fatherPostCode;
	}


	public String getFatherWorkUnit() {
		return fatherWorkUnit;
	}


	public void setFatherWorkUnit(String fatherWorkUnit) {
		this.fatherWorkUnit = fatherWorkUnit;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getMotherPhone() {
		return motherPhone;
	}


	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}


	public String getMotherEmail() {
		return motherEmail;
	}


	public void setMotherEmail(String motherEmail) {
		this.motherEmail = motherEmail;
	}


	public String getMotherAddress() {
		return motherAddress;
	}


	public void setMotherAddress(String motherAddress) {
		this.motherAddress = motherAddress;
	}


	public String getMotherPostCode() {
		return motherPostCode;
	}


	public void setMotherPostCode(String motherPostCode) {
		this.motherPostCode = motherPostCode;
	}


	public String getMotherWorkUnit() {
		return motherWorkUnit;
	}


	public void setMotherWorkUnit(String motherWorkUnit) {
		this.motherWorkUnit = motherWorkUnit;
	}


	public String getGuardianName() {
		return guardianName;
	}


	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}


	public String getGuardianPhone() {
		return guardianPhone;
	}


	public void setGuardianPhone(String guardianPhone) {
		this.guardianPhone = guardianPhone;
	}


	public String getGuardianEmail() {
		return guardianEmail;
	}


	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}


	public String getGuardianAddress() {
		return guardianAddress;
	}


	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}


	public String getGuardianPostCode() {
		return guardianPostCode;
	}


	public void setGuardianPostCode(String guardianPostCode) {
		this.guardianPostCode = guardianPostCode;
	}


	public String getGuardianWorkUnit() {
		return guardianWorkUnit;
	}


	public void setGuardianWorkUnit(String guardianWorkUnit) {
		this.guardianWorkUnit = guardianWorkUnit;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public User getCreator() {
		return creator;
	}


	public void setCreator(User creator) {
		this.creator = creator;
	}


	public Date getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	public User getUpdater() {
		return updater;
	}


	public void setUpdater(User updater) {
		this.updater = updater;
	}


	public String getSeqNum() {
		return seqNum;
	}


	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}


	public String getFatherId() {
		return fatherId;
	}


	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}


	public String getMotherId() {
		return motherId;
	}


	public void setMotherId(String motherId) {
		this.motherId = motherId;
	}


	public String getGuardianId() {
		return guardianId;
	}


	public void setGuardianId(String guardianId) {
		this.guardianId = guardianId;
	}
}
