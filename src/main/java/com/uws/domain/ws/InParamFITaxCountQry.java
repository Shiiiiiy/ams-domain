package com.uws.domain.ws;

import java.io.Serializable;

public class InParamFITaxCountQry implements Serializable
{
	private static final long serialVersionUID = 2741114855205923839L;
	public int Chargeyear;
	public String EndModiTime;
	public String FunctionID = "14600700";
	public String ModiTime;
	public String OperID = "";
	public int SalaryTypeID;
	public String StudentID;

	public int getChargeyear()
	{
		return this.Chargeyear;
	}

	public String getEndModiTime()
	{
		return this.EndModiTime;
	}

	public String getFunctionID()
	{
		return this.FunctionID;
	}

	public String getModiTime()
	{
		return this.ModiTime;
	}

	public String getOperID()
	{
		return this.OperID;
	}

	public int getSalaryTypeID()
	{
		return this.SalaryTypeID;
	}

	public String getStudentID()
	{
		return this.StudentID;
	}

	public void setChargeyear(int Chargeyear)
	{
		this.Chargeyear = Chargeyear;
	}

	public void setEndModiTime(String EndModiTime)
	{
		this.EndModiTime = EndModiTime;
	}

	public void setFunctionID(String FunctionID)
	{
		if ((FunctionID == null) || (FunctionID.compareTo("") == 0))
			this.FunctionID = "14600700";
		else
			this.FunctionID = FunctionID;
	}

	public void setModiTime(String ModiTime)
	{
		this.ModiTime = ModiTime;
	}

	public void setOperID(String OperID)
	{
		this.OperID = OperID;
	}

	public void setSalaryTypeID(int SalaryTypeID)
	{
		this.SalaryTypeID = SalaryTypeID;
	}

	public void setStudentID(String StudentID)
	{
		this.StudentID = StudentID;
	}
}