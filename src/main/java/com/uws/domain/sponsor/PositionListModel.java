package com.uws.domain.sponsor;

import java.io.Serializable;
import java.util.List;

import com.uws.core.base.BaseModel;
/**
* 
* @Title: PositionListModel.java 
* @Package com.uws.domain.sponsor 
* @Description: 封装助学岗位集合
* @author zhangmx  
* @date 2015-8-18 上午10:41:53
*/
public class PositionListModel extends BaseModel implements Serializable {
	
	private static final long serialVersionUID = -3481443068726780711L;
	//助学岗位对象的集合
	private List<SponsorPositionModel> positionList;

	public List<SponsorPositionModel> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<SponsorPositionModel> positionList) {
		this.positionList = positionList;
	}
	public PositionListModel(List<SponsorPositionModel> positionList){
		super();
		this.positionList=positionList;
		
	}
	public PositionListModel(){
		super();		
	}
}
