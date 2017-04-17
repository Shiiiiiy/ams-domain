package com.uws.domain.job;
import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;

public class RecruitModel extends BaseModel {
	
	private static final long serialVersionUID = 9016108053784484507L;

	private Dic year;
	
	private BaseAcademyModel college;
	
	private int largeRecruit;
	private int largeRecruitDepartment;
	private int largeRecruitPosition;
	
	private int smallRecruit;
	private int smallRecruitDepartment;
	private int smallRecruitPosition;
	
	private int career;
	private int careerDepartment;
	private int careerPosition;
	
	public Dic getYear() {
		return year;
	}
	public void setYear(Dic year) {
		this.year = year;
	}
	public BaseAcademyModel getCollege() {
		return college;
	}
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	public int getLargeRecruit() {
		return largeRecruit;
	}
	public void setLargeRecruit(int largeRecruit) {
		this.largeRecruit = largeRecruit;
	}
	public int getLargeRecruitDepartment() {
		return largeRecruitDepartment;
	}
	public void setLargeRecruitDepartment(int largeRecruitDepartment) {
		this.largeRecruitDepartment = largeRecruitDepartment;
	}
	public int getLargeRecruitPosition() {
		return largeRecruitPosition;
	}
	public void setLargeRecruitPosition(int largeRecruitPosition) {
		this.largeRecruitPosition = largeRecruitPosition;
	}
	public int getSmallRecruit() {
		return smallRecruit;
	}
	public void setSmallRecruit(int smallRecruit) {
		this.smallRecruit = smallRecruit;
	}
	public int getSmallRecruitDepartment() {
		return smallRecruitDepartment;
	}
	public void setSmallRecruitDepartment(int smallRecruitDepartment) {
		this.smallRecruitDepartment = smallRecruitDepartment;
	}
	public int getSmallRecruitPosition() {
		return smallRecruitPosition;
	}
	public void setSmallRecruitPosition(int smallRecruitPosition) {
		this.smallRecruitPosition = smallRecruitPosition;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public int getCareerDepartment() {
		return careerDepartment;
	}
	public void setCareerDepartment(int careerDepartment) {
		this.careerDepartment = careerDepartment;
	}
	public int getCareerPosition() {
		return careerPosition;
	}
	public void setCareerPosition(int careerPosition) {
		this.careerPosition = careerPosition;
	}
}
