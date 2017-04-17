package com.uws.domain.base;

import com.uws.core.base.BaseModel;

/**
 * 
 * @ClassName: BaseRoomModel
 * @Description: 寝室基础数据
 * @author 联合永道
 * @date 2015-9-6
 * 
 */
public class BaseRoomModel extends BaseModel
{
	private static final long serialVersionUID = -6296402168134847076L;

	private String name;// 宿舍名称
	private String buildingName;// 宿舍楼名称
	private BaseBuildingModel building;// 宿舍楼
	private String floorNum;// 层号
	private String roomNum;// 房间排号
	private String roomorder;// 房间序号
	private String roomFunc;// 房间功能
	private String roomStander;// 房间标准
	private String area;// 建筑面积
	private String isTop;// 是否顶层
	private String isBottom;// 是否底层

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public BaseBuildingModel getBuilding()
	{
		return building;
	}

	public void setBuilding(BaseBuildingModel building)
	{
		this.building = building;
	}

	public String getFloorNum()
	{
		return floorNum;
	}

	public void setFloorNum(String floorNum)
	{
		this.floorNum = floorNum;
	}

	public String getRoomNum()
	{
		return roomNum;
	}

	public void setRoomNum(String roomNum)
	{
		this.roomNum = roomNum;
	}

	public String getRoomorder()
	{
		return roomorder;
	}

	public void setRoomorder(String roomorder)
	{
		this.roomorder = roomorder;
	}

	public String getRoomFunc()
	{
		return roomFunc;
	}

	public void setRoomFunc(String roomFunc)
	{
		this.roomFunc = roomFunc;
	}

	public String getRoomStander()
	{
		return roomStander;
	}

	public void setRoomStander(String roomStander)
	{
		this.roomStander = roomStander;
	}

	public String getArea()
	{
		return area;
	}

	public void setArea(String area)
	{
		this.area = area;
	}

	public String getIsTop()
	{
		return isTop;
	}

	public void setIsTop(String isTop)
	{
		this.isTop = isTop;
	}

	public String getIsBottom()
	{
		return isBottom;
	}

	public void setIsBottom(String isBottom)
	{
		this.isBottom = isBottom;
	}
}
