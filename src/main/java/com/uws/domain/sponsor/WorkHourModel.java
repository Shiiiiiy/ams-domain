package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @className WorkHourModel.java
 * @package com.uws.domain.sponsor
 * @description 用工工时详细信息
 * @author lizj
 * @date 2015-8-14  下午2:03:54
 */
public class WorkHourModel extends BaseModel {
	private static final long serialVersionUID = -3420445565780819722L;
	private StudentInfoModel studentId;
	private SponsorPositionModel sponsorPosition;
	private OrgWorkHourModel orgWorkHour;
	private String workHour;
	private String cardNum;
	private String agreementNum;
	private double totalSalary;
	private double workSalary;
	private Dic status;
	public StudentInfoModel getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}
	public SponsorPositionModel getSponsorPosition() {
		return sponsorPosition;
	}
	public void setSponsorPosition(SponsorPositionModel sponsorPosition) {
		this.sponsorPosition = sponsorPosition;
	}
	public OrgWorkHourModel getOrgWorkHour() {
		return orgWorkHour;
	}
	public void setOrgWorkHour(OrgWorkHourModel orgWorkHour) {
		this.orgWorkHour = orgWorkHour;
	}
	public String getWorkHour() {
		return workHour;
	}
	public void setWorkHour(String workHour) {
		this.workHour = workHour;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getAgreementNum() {
		return agreementNum;
	}
	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public double getWorkSalary() {
		return workSalary;
	}
	public void setWorkSalary(double workSalary) {
		this.workSalary = workSalary;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
}
