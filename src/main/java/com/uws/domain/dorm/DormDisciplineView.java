package com.uws.domain.dorm;

import java.util.Date;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseRoomModel;
import com.uws.domain.base.StudentRoomModel;
import com.uws.domain.orientation.StudentInfoModel;
/**
 * 宿舍行为管理
 * @author liuchen
 *
 */
public class DormDisciplineView extends BaseModel
{

	/**
     * 
     */
    private static final long serialVersionUID = 432802412458523796L;
    //学生
    private StudentInfoModel student;
    //行为时间
    private Date disciplineTime;
    //行为类型
    private String disciplineLevel;
    //行为名称
    private String disciplineName;
    //备注
    private String comments;
    //结果
    private String zt;
	//用于查询
    private BaseRoomModel room;//宿舍编号
    private StudentRoomModel studentRoomModel;
	public StudentInfoModel getStudent()
    {
    	return student;
    }
	public void setStudent(StudentInfoModel student)
    {
    	this.student = student;
    }
	public Date getDisciplineTime()
    {
    	return disciplineTime;
    }
	public void setDisciplineTime(Date disciplineTime)
    {
    	this.disciplineTime = disciplineTime;
    }
	public String getDisciplineLevel()
    {
    	return disciplineLevel;
    }
	public void setDisciplineLevel(String disciplineLevel)
    {
    	this.disciplineLevel = disciplineLevel;
    }
	public String getDisciplineName()
    {
    	return disciplineName;
    }
	public void setDisciplineName(String disciplineName)
    {
    	this.disciplineName = disciplineName;
    }
	public String getComments()
    {
    	return comments;
    }
	public void setComments(String comments)
    {
    	this.comments = comments;
    }
	public String getZt()
    {
    	return zt;
    }
	public void setZt(String zt)
    {
    	this.zt = zt;
    }
	public BaseRoomModel getRoom()
    {
    	return room;
    }
	public void setRoom(BaseRoomModel room)
    {
    	this.room = room;
    }
	public StudentRoomModel getStudentRoomModel()
    {
    	return studentRoomModel;
    }
	public void setStudentRoomModel(StudentRoomModel studentRoomModel)
    {
    	this.studentRoomModel = studentRoomModel;
    }
    
    
}
