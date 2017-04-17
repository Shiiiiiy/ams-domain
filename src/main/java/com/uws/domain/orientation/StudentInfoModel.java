package com.uws.domain.orientation;

import java.io.Serializable;
import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.base.BaseMajorModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: StudentInfo
 * @Description: 学生基本信息
 * @author wangcl
 * @date 2015-07-17
 */

public class StudentInfoModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3396206182295392089L;

	/**
	 * 学号
	 */
	private String stuNumber;

	/**
	 * 信息采集的登录密码(MD5标准加密)
	 */
	private String passWord;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 汉语拼音
	 */
	private String namePy;

	/**
	 * 英文名
	 */
	private String englishName;

	/**
	 * 曾用名
	 */
	private String oldName;

	/**
	 * 性别
	 */
	private Dic genderDic;

	/**
	 * 证件类型
	 */
	private Dic certificateTypeDic;

	/**
	 * 证件号码
	 */
	private String certificateCode;

	/**
	 * 毕业学校
	 */
	private String graduation;

	/**
	 * 录取总分
	 */
	private Float enterScore;

	/**
	 * 学院
	 */
	private BaseAcademyModel college;

	/**
	 * 学科类别
	 */
	private Dic subjectDic;

	/**
	 * 专业
	 */
	private BaseMajorModel major;

	/**
	 * 班级
	 */
	private BaseClassModel classId;

	/**
	 * 宿舍
	 */
	private String dorm;

	/**
	 * 政治面貌
	 */
	private Dic politicalDic;

	/**
	 * 民族
	 */
	private String national;

	/**
	 * 出生日期
	 */
	private Date brithDate;

	/**
	 * 出生日期Str
	 */
	private String brithDateStr;

	/**
	 * 籍贯
	 */
	private Dic nativeDic;

	/**
	 * 生源地
	 */
	private String sourceLand;

	/**
	 * 户籍地址
	 */
	private String nativeAdd;

	/**
	 * 户口类别
	 */
	private Dic addressTypeDic;

	/**
	 * 家庭地址
	 */
	private String homeAddress;

	/**
	 * 家庭邮政编码
	 */
	private String homePostCode;

	/**
	 * 家庭电话
	 */
	private String homeTel;

	/**
	 * 手机1
	 */
	private String phone1;

	/**
	 * 手机2
	 */
	private String phone2;

	/**
	 * 电子邮箱
	 */
	private String email;

	/**
	 * QQ
	 */
	private String qq;

	/**
	 * url主页地址
	 */
	private String urlStr;

	/**
	 * 婚姻状况
	 */
	private Dic marriageDic;

	/**
	 * 港澳台侨
	 */
	private Dic overChineseDic;

	/**
	 * 宗教信仰
	 */
	private Dic religionDic;

	/**
	 * 血型
	 */
	private Dic bloodTypeDic;

	/**
	 * 健康状况
	 */
	private Dic healthStateDic;

	/**
	 * 开户行
	 */
	private String bank;

	/**
	 * 银行卡号
	 */
	private String bankCode;

	/**
	 * 入党申请
	 */
	private String partyApp;

	/**
	 * 入党学习
	 */
	private String partyStudy;

	/**
	 * 备注
	 */
	private String comments;

	/**
	 * 报到时间
	 */
	private Date reportDate;

	/**
	 * 报到点
	 */
	private Dic reportSiteDic;

	/**
	 * 收费状态
	 */
	private String costState;

	/**
	 * 绿色通道
	 */
	private String greenWay;

	/**
	 * 绿色通道原因
	 */
	private Dic greenReason;

	/**
	 * 撤销原因
	 */
	private String cancelReason;

	/**
	 * 入学年级
	 */
	// private String enterYear;
	private Dic enterYearDic;

	/**
	 * 学籍状态
	 */
	private String edusStatus;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 信息采集状态
	 */
	private String collectState;

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

	/**
	 * 入学日期
	 */
	private Date enterDate;

	private String studentType;// 学生类别， 暂定为学历

	/**
	 * 考生号
	 */
	private String candidateNum;

	/**
	 * 考生号省份（生源省份）
	 */
	private Dic candidateProvence;

	// 年级 用于查询条件
	private String grade;

	// 学生信息 查询控件显示用
	private String studentInfo;

	public String getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamePy() {
		return namePy;
	}

	public void setNamePy(String namePy) {
		this.namePy = namePy;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public Dic getGenderDic() {
		return genderDic;
	}

	public void setGenderDic(Dic genderDic) {
		this.genderDic = genderDic;
	}

	public Dic getCertificateTypeDic() {
		return certificateTypeDic;
	}

	public void setCertificateTypeDic(Dic certificateTypeDic) {
		this.certificateTypeDic = certificateTypeDic;
	}

	public String getCertificateCode() {
		return certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public BaseAcademyModel getCollege() {
		return college;
	}

	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}

	public BaseMajorModel getMajor() {
		return major;
	}

	public void setMajor(BaseMajorModel major) {
		this.major = major;
	}

	public BaseClassModel getClassId() {
		return classId;
	}

	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}

	public String getDorm() {
		return dorm;
	}

	public void setDorm(String dorm) {
		this.dorm = dorm;
	}

	public Dic getPoliticalDic() {
		return politicalDic;
	}

	public void setPoliticalDic(Dic politicalDic) {
		this.politicalDic = politicalDic;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	public Dic getNativeDic() {
		return nativeDic;
	}

	public void setNativeDic(Dic nativeDic) {
		this.nativeDic = nativeDic;
	}

	public String getNativeAdd() {
		return nativeAdd;
	}

	public void setNativeAdd(String nativeAdd) {
		this.nativeAdd = nativeAdd;
	}

	public Dic getAddressTypeDic() {
		return addressTypeDic;
	}

	public void setAddressTypeDic(Dic addressTypeDic) {
		this.addressTypeDic = addressTypeDic;
	}

	public String getHomePostCode() {
		return homePostCode;
	}

	public void setHomePostCode(String homePostCode) {
		this.homePostCode = homePostCode;
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getUrlStr() {
		return urlStr;
	}

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

	public Dic getMarriageDic() {
		return marriageDic;
	}

	public void setMarriageDic(Dic marriageDic) {
		this.marriageDic = marriageDic;
	}

	public Dic getOverChineseDic() {
		return overChineseDic;
	}

	public void setOverChineseDic(Dic overChineseDic) {
		this.overChineseDic = overChineseDic;
	}

	public Dic getReligionDic() {
		return religionDic;
	}

	public void setReligionDic(Dic religionDic) {
		this.religionDic = religionDic;
	}

	public Dic getBloodTypeDic() {
		return bloodTypeDic;
	}

	public void setBloodTypeDic(Dic bloodTypeDic) {
		this.bloodTypeDic = bloodTypeDic;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPartyApp() {
		return partyApp;
	}

	public void setPartyApp(String partyApp) {
		this.partyApp = partyApp;
	}

	public String getPartyStudy() {
		return partyStudy;
	}

	public void setPartyStudy(String partyStudy) {
		this.partyStudy = partyStudy;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Dic getReportSiteDic() {
		return reportSiteDic;
	}

	public void setReportSiteDic(Dic reportSiteDic) {
		this.reportSiteDic = reportSiteDic;
	}

	public String getCostState() {
		return costState;
	}

	public void setCostState(String costState) {
		this.costState = costState;
	}

	public String getGreenWay() {
		return greenWay;
	}

	public void setGreenWay(String greenWay) {
		this.greenWay = greenWay;
	}

	public Dic getGreenReason() {
		return greenReason;
	}

	public void setGreenReason(Dic greenReason) {
		this.greenReason = greenReason;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
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

	public Float getEnterScore() {
		return enterScore;
	}

	public void setEnterScore(Float enterScore) {
		this.enterScore = enterScore;
	}

	public String getEdusStatus() {
		return edusStatus;
	}

	public void setEdusStatus(String edusStatus) {
		this.edusStatus = edusStatus;
	}

	public Dic getSubjectDic() {
		return subjectDic;
	}

	public void setSubjectDic(Dic subjectDic) {
		this.subjectDic = subjectDic;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Dic getHealthStateDic() {
		return healthStateDic;
	}

	public void setHealthStateDic(Dic healthStateDic) {
		this.healthStateDic = healthStateDic;
	}

	public String getBrithDateStr() {
		return brithDateStr;
	}

	public void setBrithDateStr(String brithDateStr) {
		this.brithDateStr = brithDateStr;
	}

	public String getSourceLand() {
		return sourceLand;
	}

	public void setSourceLand(String sourceLand) {
		this.sourceLand = sourceLand;
	}

	public String getCollectState() {
		return collectState;
	}

	public void setCollectState(String collectState) {
		this.collectState = collectState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Dic getEnterYearDic() {
		return enterYearDic;
	}

	public void setEnterYearDic(Dic enterYearDic) {
		this.enterYearDic = enterYearDic;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getCandidateNum() {
		return candidateNum;
	}

	public void setCandidateNum(String candidateNum) {
		this.candidateNum = candidateNum;
	}

	public Dic getCandidateProvence() {
		return candidateProvence;
	}

	public void setCandidateProvence(Dic candidateProvence) {
		this.candidateProvence = candidateProvence;
	}

}
