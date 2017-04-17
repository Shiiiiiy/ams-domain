package com.singlee.dto.business;

/**
 * 薪酬公式查询。
 */

public class InParamFITaxCountQry implements java.io.Serializable
{
	public String FunctionID = "14600700"; // 功能编号
	public int SalaryTypeID; // 薪酬类别
	public String StudentID; // 学号
	public int Chargeyear; // 薪酬类别
	public String OperID = ""; // 操作员编号

	public String getFunctionID()
	{
		return FunctionID;
	}

	public void setFunctionID(String FunctionID)
	{
		if (FunctionID == null || FunctionID.compareTo("") == 0)
			this.FunctionID = "14600700";
		else
			this.FunctionID = FunctionID;
	}

	public int getSalaryTypeID()
	{
		return SalaryTypeID;
	}

	public void setSalaryTypeID(int SalaryTypeID)
	{
		this.SalaryTypeID = SalaryTypeID;
	}

	public int getChargeyear()
	{
		return Chargeyear;
	}

	public void setChargeyear(int Chargeyear)
	{
		this.Chargeyear = Chargeyear;
	}

	public String getOperID()
	{
		return OperID;
	}

	public void setOperID(String OperID)
	{
		this.OperID = OperID;
	}

	public String getStudentID()
	{
		return StudentID;
	}

	public void setStudentID(String StudentID)
	{
		this.StudentID = StudentID;
	}

}
