package com.uws.domain.integrate;

import java.util.Date;
import com.uws.core.base.BaseModel;
import com.uws.sys.model.Dic;
import com.uws.user.model.User;
/**
 * 
* @ClassName: SheetModel 
* @Description: 报表上报信息
* @author 联合永道
* @date 2015-12-29 下午3:09:05 
*
 */
public class SheetModel extends BaseModel{
    private static final long serialVersionUID = 4388530591539820955L;
    
    private Dic year;//学年
	private String title; //报表标题
	private int fileNumber;//附件数量
	private Date uploadDate;// 上传日期
	private User creator;//上传人
	private String creatorName;
	private String comments;//备注
	
	public Dic getYear() {
		return year;
	}
	public void setYear(Dic year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public User getCreator(){
    	return creator;
    }
	public void setCreator(User creator){
    	this.creator = creator;
    }
	public String getCreatorName()
    {
    	return creatorName;
    }
	public void setCreatorName(String creatorName)
    {
    	this.creatorName = creatorName;
    }
	
	
	
}
