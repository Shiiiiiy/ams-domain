package com.uws.domain.base;

import com.uws.core.base.BaseModel;
import com.uws.domain.orientation.StudentInfoModel;

/**
 * 
* @ClassName: StudentRoomModel 
* @Description: 学生住宿信息 
* @author 联合永道
* @date 2015-9-6 下午4:07:43 
*
 */
public class StudentRoomModel extends BaseModel
{
	private static final long serialVersionUID = -6404714491888976433L;

	private StudentInfoModel student;//学生编号
	private BaseRoomModel room;//宿舍编号
	private BaseBuildingModel building;//宿舍楼编号
	private String bedNumber;// 床位号

	public StudentInfoModel getStudent()
	{
		return student;
	}

	public void setStudent(StudentInfoModel student)
	{
		this.student = student;
	}

	public BaseRoomModel getRoom()
	{
		return room;
	}

	public void setRoom(BaseRoomModel room)
	{
		this.room = room;
	}

	public BaseBuildingModel getBuilding()
	{
		return building;
	}

	public void setBuilding(BaseBuildingModel building)
	{
		this.building = building;
	}

	public String getBedNumber()
	{
		return bedNumber;
	}

	public void setBedNumber(String bedNumber)
	{
		this.bedNumber = bedNumber;
	}

}
