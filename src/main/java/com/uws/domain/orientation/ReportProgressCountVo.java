package com.uws.domain.orientation;

public class ReportProgressCountVo {
	//学院
	private String college;
	//专业
	private String major;
	//班级
	private String klass;
	//录取人数
	private Long enterNum;
	//报到人数
	private Long registerNum;
	//各省份情况
	private Long[] provinceList;
	
	public ReportProgressCountVo(String college, String major, String klass, Long enterNum, Long registerNum) {
		this.college = college;
		this.major = major;
		this.klass = klass;
		this.enterNum = enterNum;
		this.registerNum = registerNum;
	}
	public ReportProgressCountVo(String college, String major, Long enterNum, Long registerNum) {
		this.college = college;
		this.major = major;
		this.enterNum = enterNum;
		this.registerNum = registerNum;
	}
	public ReportProgressCountVo(String college, Long enterNum, Long registerNum) {
		this.college = college;
		this.enterNum = enterNum;
		this.registerNum = registerNum;
	}
	public ReportProgressCountVo() {}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getKlass() {
		return klass;
	}
	public void setKlass(String klass) {
		this.klass = klass;
	}
	public Long getEnterNum() {
		return enterNum;
	}
	public void setEnterNum(Long enterNum) {
		this.enterNum = enterNum;
	}
	public Long getRegisterNum() {
		return registerNum;
	}
	public void setRegisterNum(Long registerNum) {
		this.registerNum = registerNum;
	}
	public Long[] getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(Long[] provinceList) {
		this.provinceList = provinceList;
	}
	
}
