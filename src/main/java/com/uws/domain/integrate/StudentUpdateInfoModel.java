package com.uws.domain.integrate;
import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: StudentUpdateInfoModel 
 * @Description: TODO(学生更新信息实体类) 
 * @author wangjr
 * @date 2015-7-30 上午10:21:55 
 *
 */
public class StudentUpdateInfoModel extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 实体类id
	 */
	private String id;
	/**
	 * 实体类学号
	 */
	private StudentInfoModel stuId;
	/**
	 * 实体类学生姓名
	 */
	private String name;
	/**
	 * 实体类学生姓名拼音
	 */
	private String namePy;
	/**
	 * 实体类曾用名
	 */
	private String oldName;	
	/**
	 * 实体类英文名
	 */
	private String englishName;
	/**
	 * 实体类性别
	 */
	private Dic genderDic;
	/**
	 * 实体类身份证类型
	 */
	private Dic certificateTypeDic;
	/**
	 * 实体类身份证号
	 */
	private String certificateCode;
	/**
	 * 实体类民族
	 */
	private String national;
	/**
	 * 实体类出生日期
	 */
	private Date brithDate;
	/**
	 * 实体类籍贯
	 */
	private Dic nativeDic;
	/**
	 * 实体类户口类型
	 */
	private Dic addressTypeDic;
	/**
	 * 实体类户口地址
	 */
	private String nativeAdd;
	/**
	 * 实体类邮编
	 */
	private String homePostCode;
	/**
	 * 实体类家庭住址
	 */
	private String homeAddress;
	/**
	 * 实体类家庭电话
	 */
	private String homeTel;
	/**
	 * 实体类常用手机
	 */
	private String phone1;
	/**
	 * 实体类备用手机
	 */
	private String phone2;
	/**
	 * 实体类邮箱
	 */
	private String email;
	/**
	 * 实体类QQ号码
	 */
	private String qq;
	/**
	 * 实体类宗教信仰
	 */
	private Dic religionDic;
	/**
	 * 实体类血型
	 */
	private Dic bloodTypeDic;
	/**
	 * 实体类开户行
	 */
	private String bank;
	/**
	 * 实体类银行卡号
	 */
	private String bankCode;
	/**
	 * 实体类状态
	 */
	//private Dic statusDic;
	private String status;
	/**
	 * 实体类创建者
	 */
	private User creator;
	/**
	 * 实体类创建时间
	 */
	private Date createTime;
	/**
	 * 实体类修改时间
	 */
	private Date updateTime;
	/**
	 * 下一节点办理人
	 */
	private User nextApprover;
	/**
	 * 流程审批状态
	 */
	private String approveStatus;
	/**
	 * 流程实例状态
	 */
	private String processStatus;
	/**
	 * 审核意见
	 */
	private String approveReason;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public StudentInfoModel getStuId() {
		return stuId;
	}
	public void setStuId(StudentInfoModel stuId) {
		this.stuId = stuId;
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
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
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
	public Dic getAddressTypeDic() {
		return addressTypeDic;
	}
	public void setAddressTypeDic(Dic addressTypeDic) {
		this.addressTypeDic = addressTypeDic;
	}
	public String getNativeAdd() {
		return nativeAdd;
	}
	public void setNativeAdd(String nativeAdd) {
		this.nativeAdd = nativeAdd;
	}
	public String getHomePostCode() {
		return homePostCode;
	}
	public void setHomePostCode(String homePostCode) {
		this.homePostCode = homePostCode;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
	public String getApproveReason() {
		return approveReason;
	}
	public void setApproveReason(String approveReason) {
		this.approveReason = approveReason;
	}
	
}
