package com.uws.domain.sponsor;

import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @Title: ScheduleModel.java
 * @Package com.uws.domain.sponsor
 * @Description: 助学课表实体对象
 * @author zhangmx
 * @date 2015-8-10 上午9:41:53
 */
public class ScheduleModel extends BaseModel
{

	private static final long serialVersionUID = -6696505359944705996L;
	// 主键ID
	private String scheduleId;
	// 岗位申请单对象
	private WorkApplyFileModel applyFile;
	// 星期
	private Dic weekendDic;
	// 课节数
	private Dic lessonDic;
    // 删除状态
	private Dic delStatus;
	

	public String getScheduleId() 
	{
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) 
	{
		this.scheduleId = scheduleId;
	}

	public WorkApplyFileModel getApplyFile()
	{
		return applyFile;
	}

	public void setApplyFile(WorkApplyFileModel applyFile)
	{
		this.applyFile = applyFile;
	}

	public Dic getWeekendDic()
	{
		return weekendDic;
	}

	public void setWeekendDic(Dic weekendDic)
	{
		this.weekendDic = weekendDic;
	}

	public Dic getLessonDic()
	{
		return lessonDic;
	}

	public void setLessonDic(Dic lessonDic)
	{
		this.lessonDic = lessonDic;
	}

	public Dic getDelStatus() 
	{
		return delStatus;
	}

	public void setDelStatus(Dic delStatus) 
	{
		this.delStatus = delStatus;
	}
	
}
