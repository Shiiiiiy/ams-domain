package com.uws.domain.dorm;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseBuildingModel;
import com.uws.domain.base.BaseRoomModel;
/**
 * 宿舍评比视图
 * @author liuchen
 *
 */
public class DormRatingView extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 5125271662232924720L;
    //批次
    private String batchInfo;
    //楼宇ID
    private BaseBuildingModel building;
    //楼宇名称
    private String buildName;
    //房间ID
    private BaseRoomModel room;//宿舍编号
    //房间名称
    private String roomName;
    //批次id
    private String batchId;
    //批次名称
    private String batchName;
    //扣分项目id
    private String projectId;
    //扣分项目名称
    private String projectName;
    //扣分分值
    private String loseScore;
    //检查人
    private String checkUser;
    //检查时间
    private Date checkTime;
    //等级
    private String level;
    //是否标兵
    private String isPacesetter;
    //是否较差
    private String isBedRoom;
    //得分
    private String getScore;
    //备注
    private String comments;
	public String getBatchInfo()
    {
    	return batchInfo;
    }
	public void setBatchInfo(String batchInfo)
    {
    	this.batchInfo = batchInfo;
    }
	public BaseBuildingModel getBuilding()
    {
    	return building;
    }
	public void setBuilding(BaseBuildingModel building)
    {
    	this.building = building;
    }
	public String getBuildName()
    {
    	return buildName;
    }
	public void setBuildName(String buildName)
    {
    	this.buildName = buildName;
    }
	public BaseRoomModel getRoom()
    {
    	return room;
    }
	public void setRoom(BaseRoomModel room)
    {
    	this.room = room;
    }
	public String getRoomName()
    {
    	return roomName;
    }
	public void setRoomName(String roomName)
    {
    	this.roomName = roomName;
    }
	public String getBatchId()
    {
    	return batchId;
    }
	public void setBatchId(String batchId)
    {
    	this.batchId = batchId;
    }
	public String getBatchName()
    {
    	return batchName;
    }
	public void setBatchName(String batchName)
    {
    	this.batchName = batchName;
    }
	public String getProjectId()
    {
    	return projectId;
    }
	public void setProjectId(String projectId)
    {
    	this.projectId = projectId;
    }
	public String getProjectName()
    {
    	return projectName;
    }
	public void setProjectName(String projectName)
    {
    	this.projectName = projectName;
    }
	public String getLoseScore()
    {
    	return loseScore;
    }
	public void setLoseScore(String loseScore)
    {
    	this.loseScore = loseScore;
    }
	public String getCheckUser()
    {
    	return checkUser;
    }
	public void setCheckUser(String checkUser)
    {
    	this.checkUser = checkUser;
    }
	public Date getCheckTime()
    {
    	return checkTime;
    }
	public void setCheckTime(Date checkTime)
    {
    	this.checkTime = checkTime;
    }
	public String getLevel()
    {
    	return level;
    }
	public void setLevel(String level)
    {
    	this.level = level;
    }
	public String getIsPacesetter()
    {
    	return isPacesetter;
    }
	public void setIsPacesetter(String isPacesetter)
    {
    	this.isPacesetter = isPacesetter;
    }
	public String getIsBedRoom()
    {
    	return isBedRoom;
    }
	public void setIsBedRoom(String isBedRoom)
    {
    	this.isBedRoom = isBedRoom;
    }
	public String getGetScore()
    {
    	return getScore;
    }
	public void setGetScore(String getScore)
    {
    	this.getScore = getScore;
    }
	public String getComments()
    {
    	return comments;
    }
	public void setComments(String comments)
    {
    	this.comments = comments;
    }
    
    
}
