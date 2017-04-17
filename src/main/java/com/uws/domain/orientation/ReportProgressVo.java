package com.uws.domain.orientation;

import com.uws.sys.model.Dic;

/**
 * 用于报到进度统计页面传值
 * @author z
 *
 */
public class ReportProgressVo {
	
	//学年报到情况
	private Dic yearDic; 
	//学院报到情况
	private String college;
	//专业报到情况
	private String majorId;
	//班级报到情况
	private String klassId;
	public Dic getYearDic() {
		return yearDic;
	}
	public void setYearDic(Dic yearDic) {
		this.yearDic = yearDic;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getKlassId() {
		return klassId;
	}
	public void setKlassId(String klassId) {
		this.klassId = klassId;
	}
	
}
