package com.uws.domain.integrate;

import java.io.Serializable;

import com.uws.core.base.BaseModel;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: StudentGuardianUpdateModel
 * @Description: 学生监护人修改信息
 * @author wjr
 * @date 2015-12-29
 */
public class StudentGuardianUpdateModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3396206182295392089L;
	
	/**
	 * 学生基本信息
	 */
	private StudentUpdateInfoModel studentUpdateInfo;

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
	 * 创建人
	 */
	private User creator;
	
	/**
	 * 修改人
	 */
	private User updater;

	public StudentUpdateInfoModel getStudentUpdateInfo() {
		return studentUpdateInfo;
	}

	public void setStudentUpdateInfo(StudentUpdateInfoModel studentUpdateInfo) {
		this.studentUpdateInfo = studentUpdateInfo;
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

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
}
