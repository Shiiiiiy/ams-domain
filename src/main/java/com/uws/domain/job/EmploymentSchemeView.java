package com.uws.domain.job;

import java.io.Serializable;

import com.uws.domain.base.BaseClassModel;
import com.uws.sys.model.Dic;

/**
 * @className EmploymentSchemeView.java
 * @package com.uws.domain.job
 * @description
 * @date 2016-1-6  下午4:25:26
 */
public class EmploymentSchemeView{
	private Dic schoolYear;
	private long protocoCareerNum;
	private long laborCareerNum;
	private long otherCareerNum;
	private long researchAssistantNum;
	private long applyConscriptsNum;
	private long nationalBasicProjectNum;
	private long localBasicProjectNum;
	private long selfEmployedNum;
	private long freelanderNum;
	private long goHigherSchoolNum;
	private long goAbroadNum;
	private long noJobNum;
	private long totalNum;
	public Dic getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	public long getProtocoCareerNum() {
		return protocoCareerNum;
	}
	public void setProtocoCareerNum(long protocoCareerNum) {
		this.protocoCareerNum = protocoCareerNum;
	}
	public long getLaborCareerNum() {
		return laborCareerNum;
	}
	public void setLaborCareerNum(long laborCareerNum) {
		this.laborCareerNum = laborCareerNum;
	}
	public long getOtherCareerNum() {
		return otherCareerNum;
	}
	public void setOtherCareerNum(long otherCareerNum) {
		this.otherCareerNum = otherCareerNum;
	}
	public long getResearchAssistantNum() {
		return researchAssistantNum;
	}
	public void setResearchAssistantNum(long researchAssistantNum) {
		this.researchAssistantNum = researchAssistantNum;
	}
	public long getApplyConscriptsNum() {
		return applyConscriptsNum;
	}
	public void setApplyConscriptsNum(long applyConscriptsNum) {
		this.applyConscriptsNum = applyConscriptsNum;
	}
	public long getNationalBasicProjectNum() {
		return nationalBasicProjectNum;
	}
	public void setNationalBasicProjectNum(long nationalBasicProjectNum) {
		this.nationalBasicProjectNum = nationalBasicProjectNum;
	}
	public long getLocalBasicProjectNum() {
		return localBasicProjectNum;
	}
	public void setLocalBasicProjectNum(long localBasicProjectNum) {
		this.localBasicProjectNum = localBasicProjectNum;
	}
	public long getSelfEmployedNum() {
		return selfEmployedNum;
	}
	public void setSelfEmployedNum(long selfEmployedNum) {
		this.selfEmployedNum = selfEmployedNum;
	}
	public long getFreelanderNum() {
		return freelanderNum;
	}
	public void setFreelanderNum(long freelanderNum) {
		this.freelanderNum = freelanderNum;
	}
	public long getGoHigherSchoolNum() {
		return goHigherSchoolNum;
	}
	public void setGoHigherSchoolNum(long goHigherSchoolNum) {
		this.goHigherSchoolNum = goHigherSchoolNum;
	}
	public long getGoAbroadNum() {
		return goAbroadNum;
	}
	public void setGoAbroadNum(long goAbroadNum) {
		this.goAbroadNum = goAbroadNum;
	}
	public long getNoJobNum() {
		return noJobNum;
	}
	public void setNoJobNum(long noJobNum) {
		this.noJobNum = noJobNum;
	}
	public long getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(long totalNum) {
		this.totalNum = totalNum;
	}
}
