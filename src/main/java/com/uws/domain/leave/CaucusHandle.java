package com.uws.domain.leave;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;

/**
 * 
 * @ClassName: CaucusHandle
 * @Description: 党团关系办理对象
 * @author 联合永道
 * @date 2016-1-19 上午10:51:51
 * 
 */
public class CaucusHandle extends BaseModel
{
	private static final long serialVersionUID = -3063603049607590625L;

	// 学年
	private String year;
	private Dic yearDic;
	// 介绍信编码
	private String IntroductionLetterCode;
	// 学生
	private StudentInfoModel student;
	// 类型 教职工、学生
	private String caucusKind;
	// 关系类别 正式 预备
	private String caucusType;
	// 党费交至日期，先按照字符串存取处理
	private String partyFeeDateStr;
	// 接收党组织详细名称
	private String acceptedBranchName;
	// 转出时间
	private String transferDateStr;
	// 联系电话
	private String contactPhone;
	// 回执情况
	private String receipt;
	// 所属支部名称
	private String branchName;
	// 办理状态
	private String handleStatusStr;
	private Dic handleStatus;
	// 创建人
	private User creator;
	private User updator;

	//导入用到字段
	private String studentNumber;
	
	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public Dic getYearDic()
	{
		return yearDic;
	}

	public void setYearDic(Dic yearDic)
	{
		this.yearDic = yearDic;
	}

	public String getIntroductionLetterCode()
	{
		return IntroductionLetterCode;
	}

	public void setIntroductionLetterCode(String introductionLetterCode)
	{
		IntroductionLetterCode = introductionLetterCode;
	}

	public StudentInfoModel getStudent()
	{
		return student;
	}

	public void setStudent(StudentInfoModel student)
	{
		this.student = student;
	}

	public String getCaucusKind()
	{
		return caucusKind;
	}

	public void setCaucusKind(String caucusKind)
	{
		this.caucusKind = caucusKind;
	}

	public String getCaucusType()
	{
		return caucusType;
	}

	public void setCaucusType(String caucusType)
	{
		this.caucusType = caucusType;
	}

	public String getPartyFeeDateStr()
	{
		return partyFeeDateStr;
	}

	public void setPartyFeeDateStr(String partyFeeDateStr)
	{
		this.partyFeeDateStr = partyFeeDateStr;
	}

	public String getAcceptedBranchName()
	{
		return acceptedBranchName;
	}

	public void setAcceptedBranchName(String acceptedBranchName)
	{
		this.acceptedBranchName = acceptedBranchName;
	}

	public String getTransferDateStr()
	{
		return transferDateStr;
	}

	public void setTransferDateStr(String transferDateStr)
	{
		this.transferDateStr = transferDateStr;
	}

	public String getContactPhone()
	{
		return contactPhone;
	}

	public void setContactPhone(String contactPhone)
	{
		this.contactPhone = contactPhone;
	}

	public String getReceipt()
	{
		return receipt;
	}

	public void setReceipt(String receipt)
	{
		this.receipt = receipt;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	public Dic getHandleStatus()
	{
		return handleStatus;
	}

	public void setHandleStatus(Dic handleStatus)
	{
		this.handleStatus = handleStatus;
	}

	public User getCreator()
	{
		return creator;
	}

	public void setCreator(User creator)
	{
		this.creator = creator;
	}

	public User getUpdator()
	{
		return updator;
	}

	public void setUpdator(User updator)
	{
		this.updator = updator;
	}

	public String getStudentNumber()
    {
    	return studentNumber;
    }

	public void setStudentNumber(String studentNumber)
    {
    	this.studentNumber = studentNumber;
    }

	public String getHandleStatusStr()
    {
    	return handleStatusStr;
    }

	public void setHandleStatusStr(String handleStatusStr)
    {
    	this.handleStatusStr = handleStatusStr;
    }
}
