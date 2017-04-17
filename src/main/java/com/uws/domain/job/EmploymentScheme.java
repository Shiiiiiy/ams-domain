package com.uws.domain.job;

import java.util.Date;
import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * @className EmploymentScheme.java
 * @package com.uws.domain.job
 * @description
 * @date 2015-10-10  下午1:49:40
 */
public class EmploymentScheme extends BaseModel {
	private static final long serialVersionUID = -879118971807112478L;
	private String examNo;//考生号
	private String political;//政治面貌
	private String sexCode;//性别代码
	private String nationCode;//民族代码
	private String schoolName;//院校名称
	private String brachSchoolName;//分校名称
	private String schoolCode;//学校代码
	private String schoolPrivince;//院校所在省代码
	private String educationCode;//学历代码
	private String majorCode;//专业代码
	private String majorSide;//专业方向
	private String trainTypeCode;//培养方式代码
	private String placeCode;//生源所在地代码
	private String cityVillage;//城乡生源
	private String teachStudentTypeCode;//师范生类别代码
	private String difficultTypeCode;//困难生类别代码
	private StudentInfoModel studentId;//学生
	private String trainCompany;//定向或委培单位
	private String beforeFileCompany;//入学前档案所在单位
	private Dic isFileSchool;//档案是否转入学校
	private String beforeAccountPolice;//入学前户口所在地派出所
	private Dic isAccountSchool;//户口是否转入学校
	private Dic graduateCode;//毕业去向代码
	private String companyName;//单位名称
	private String companyOrgCode;//单位组织机构代码
	private String companyCode;//单位性质代码
	private String companyIndustryCode;//单位行业代码
	private String companyPlaceCode;//单位所在地代码
	private String companyPlace;//单位所在地
	private String workTypeCode;//工作职位类别代码
	private String companyPerson;//单位联系人
	private String personTelephone;//联系人电话
	private String personPhone;//联系人手机
	private String personEmail;//联系人电子邮箱
	private String personFax;//联系人传真
	private String companyAddress;//单位地址
	private String compantPost;//单位邮编
	private String reportTypeCode;//报到证签发类别代码
	private String reportCompanyName;//报到证签往单位名称
	private String reportCompanyPlaceCode;//签往单位所在地代码
	private String reportCompnayPlace;//签往单位所在地
	private String fileCompanyName;//档案转寄单位名称
	private String fileCompanyAddress;//档案转寄单位地址
	private String fileCompanyPost;//档案转寄单位邮编
	private String accountAddress;//户口迁移地址
	private String reportNo;//报到证编号
	private Date reportStartTime;//报到起始时间
	private String jobCommentOne;//就业备注1
	private String jobCommentTwo;//就业备注2
	private String jobCommentThree;//就业备注3
	private String graduatePlan;//学制
	private Date graduateTime;//毕业时间
	private String sourcePlace;//生源地
	private Dic delState;//删除标志
	////////导入
	private String stuNo;
	private String stuName;
	///////
	private String strReportStart;
	private String strGraduateTime;
	private Dic schoolYear;
	////////
	public String getExamNo() {
		return examNo;
	}
	public void setExamNo(String examNo) {
		this.examNo = examNo;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public String getNationCode() {
		return nationCode;
	}
	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getBrachSchoolName() {
		return brachSchoolName;
	}
	public void setBrachSchoolName(String brachSchoolName) {
		this.brachSchoolName = brachSchoolName;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolPrivince() {
		return schoolPrivince;
	}
	public void setSchoolPrivince(String schoolPrivince) {
		this.schoolPrivince = schoolPrivince;
	}
	public String getEducationCode() {
		return educationCode;
	}
	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public String getMajorSide() {
		return majorSide;
	}
	public void setMajorSide(String majorSide) {
		this.majorSide = majorSide;
	}
	public String getTrainTypeCode() {
		return trainTypeCode;
	}
	public void setTrainTypeCode(String trainTypeCode) {
		this.trainTypeCode = trainTypeCode;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getCityVillage() {
		return cityVillage;
	}
	public void setCityVillage(String cityVillage) {
		this.cityVillage = cityVillage;
	}
	public String getTeachStudentTypeCode() {
		return teachStudentTypeCode;
	}
	public void setTeachStudentTypeCode(String teachStudentTypeCode) {
		this.teachStudentTypeCode = teachStudentTypeCode;
	}
	public String getDifficultTypeCode() {
		return difficultTypeCode;
	}
	public void setDifficultTypeCode(String difficultTypeCode) {
		this.difficultTypeCode = difficultTypeCode;
	}
	public StudentInfoModel getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}
	public String getTrainCompany() {
		return trainCompany;
	}
	public void setTrainCompany(String trainCompany) {
		this.trainCompany = trainCompany;
	}
	public String getBeforeFileCompany() {
		return beforeFileCompany;
	}
	public void setBeforeFileCompany(String beforeFileCompany) {
		this.beforeFileCompany = beforeFileCompany;
	}
	public Dic getIsFileSchool() {
		return isFileSchool;
	}
	public void setIsFileSchool(Dic isFileSchool) {
		this.isFileSchool = isFileSchool;
	}
	public String getBeforeAccountPolice() {
		return beforeAccountPolice;
	}
	public void setBeforeAccountPolice(String beforeAccountPolice) {
		this.beforeAccountPolice = beforeAccountPolice;
	}
	public Dic getIsAccountSchool() {
		return isAccountSchool;
	}
	public void setIsAccountSchool(Dic isAccountSchool) {
		this.isAccountSchool = isAccountSchool;
	}
	public Dic getGraduateCode() {
		return graduateCode;
	}
	public void setGraduateCode(Dic graduateCode) {
		this.graduateCode = graduateCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyOrgCode() {
		return companyOrgCode;
	}
	public void setCompanyOrgCode(String companyOrgCode) {
		this.companyOrgCode = companyOrgCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyIndustryCode() {
		return companyIndustryCode;
	}
	public void setCompanyIndustryCode(String companyIndustryCode) {
		this.companyIndustryCode = companyIndustryCode;
	}
	public String getCompanyPlaceCode() {
		return companyPlaceCode;
	}
	public void setCompanyPlaceCode(String companyPlaceCode) {
		this.companyPlaceCode = companyPlaceCode;
	}
	public String getCompanyPlace() {
		return companyPlace;
	}
	public void setCompanyPlace(String companyPlace) {
		this.companyPlace = companyPlace;
	}
	public String getWorkTypeCode() {
		return workTypeCode;
	}
	public void setWorkTypeCode(String workTypeCode) {
		this.workTypeCode = workTypeCode;
	}
	public String getCompanyPerson() {
		return companyPerson;
	}
	public void setCompanyPerson(String companyPerson) {
		this.companyPerson = companyPerson;
	}
	public String getPersonTelephone() {
		return personTelephone;
	}
	public void setPersonTelephone(String personTelephone) {
		this.personTelephone = personTelephone;
	}
	public String getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	public String getPersonFax() {
		return personFax;
	}
	public void setPersonFax(String personFax) {
		this.personFax = personFax;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompantPost() {
		return compantPost;
	}
	public void setCompantPost(String compantPost) {
		this.compantPost = compantPost;
	}
	public String getReportTypeCode() {
		return reportTypeCode;
	}
	public void setReportTypeCode(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}
	public String getReportCompanyName() {
		return reportCompanyName;
	}
	public void setReportCompanyName(String reportCompanyName) {
		this.reportCompanyName = reportCompanyName;
	}
	public String getReportCompanyPlaceCode() {
		return reportCompanyPlaceCode;
	}
	public void setReportCompanyPlaceCode(String reportCompanyPlaceCode) {
		this.reportCompanyPlaceCode = reportCompanyPlaceCode;
	}
	public String getReportCompnayPlace() {
		return reportCompnayPlace;
	}
	public void setReportCompnayPlace(String reportCompnayPlace) {
		this.reportCompnayPlace = reportCompnayPlace;
	}
	public String getFileCompanyName() {
		return fileCompanyName;
	}
	public void setFileCompanyName(String fileCompanyName) {
		this.fileCompanyName = fileCompanyName;
	}
	public String getFileCompanyAddress() {
		return fileCompanyAddress;
	}
	public void setFileCompanyAddress(String fileCompanyAddress) {
		this.fileCompanyAddress = fileCompanyAddress;
	}
	public String getFileCompanyPost() {
		return fileCompanyPost;
	}
	public void setFileCompanyPost(String fileCompanyPost) {
		this.fileCompanyPost = fileCompanyPost;
	}
	public String getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}
	public String getReportNo() {
		return reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public Date getReportStartTime() {
		return reportStartTime;
	}
	public void setReportStartTime(Date reportStartTime) {
		this.reportStartTime = reportStartTime;
	}
	public String getJobCommentOne() {
		return jobCommentOne;
	}
	public void setJobCommentOne(String jobCommentOne) {
		this.jobCommentOne = jobCommentOne;
	}
	public String getJobCommentTwo() {
		return jobCommentTwo;
	}
	public void setJobCommentTwo(String jobCommentTwo) {
		this.jobCommentTwo = jobCommentTwo;
	}
	public String getJobCommentThree() {
		return jobCommentThree;
	}
	public void setJobCommentThree(String jobCommentThree) {
		this.jobCommentThree = jobCommentThree;
	}
	public String getGraduatePlan() {
		return graduatePlan;
	}
	public void setGraduatePlan(String graduatePlan) {
		this.graduatePlan = graduatePlan;
	}
	public Date getGraduateTime() {
		return graduateTime;
	}
	public void setGraduateTime(Date graduateTime) {
		this.graduateTime = graduateTime;
	}
	public String getSourcePlace() {
		return sourcePlace;
	}
	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}
	public Dic getDelState() {
		return delState;
	}
	public void setDelState(Dic delState) {
		this.delState = delState;
	}
	/////导入
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stuNo == null) ? 0 : stuNo.hashCode());
		return result;
	}
	////////重写equals方法:当学号相等时两个对象相等
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmploymentScheme other = (EmploymentScheme) obj;
		if (stuNo == null) {
			if (other.stuNo != null)
				return false;
		} else if (!stuNo.equals(other.stuNo))
			return false;
		return true;
	}
	//////
	public String getStrReportStart() {
		return strReportStart;
	}
	public void setStrReportStart(String strReportStart) {
		this.strReportStart = strReportStart;
	}
	public String getStrGraduateTime() {
		return strGraduateTime;
	}
	public void setStrGraduateTime(String strGraduateTime) {
		this.strGraduateTime = strGraduateTime;
	}
}
