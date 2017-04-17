package com.uws.domain.teacher;

import java.io.Serializable;

import com.uws.domain.base.BaseAcademyModel;
import com.uws.sys.model.Dic;

public class CountTeacherEvaluate implements Serializable {
	private static final long serialVersionUID = -800319879196861612L;
	//学年
	private Dic schoolYear;
	//学院
	private BaseAcademyModel college;
	//优秀
	private Integer excellent;
	//良好
	private Integer well;
	//中等
	private Integer medium;
	//差
	private Integer bad;
	/**
	 * 学年get()方法
	 * @return
	 */
	public Dic getSchoolYear() {
		return schoolYear;
	}
	/**
	 * 学年set()方法
	 * @param schoolYear
	 */
	public void setSchoolYear(Dic schoolYear) {
		this.schoolYear = schoolYear;
	}
	/**
	 * 学院get()方法
	 * @return
	 */
	public BaseAcademyModel getCollege() {
		return college;
	}
	/**
	 * 学院set()方法
	 * @param college
	 */
	public void setCollege(BaseAcademyModel college) {
		this.college = college;
	}
	/**
	 * 优秀人数get()方法
	 * @return
	 */
	public Integer getExcellent() {
		return excellent;
	}
	/**
	 * 优秀人数set()方法
	 * @param excellent
	 */
	public void setExcellent(Integer excellent) {
		this.excellent = excellent;
	}
	/**
	 * 良好人数get()方法
	 * @return
	 */
	public Integer getWell() {
		return well;
	}
	/**
	 * 良好人数set()方法
	 * @param well
	 */
	public void setWell(Integer well) {
		this.well = well;
	}
	/**
	 * 中等人数get()方法
	 * @return
	 */
	public Integer getMedium() {
		return medium;
	}
	/**
	 * 中等人数set()方法
	 * @param medium
	 */
	public void setMedium(Integer medium) {
		this.medium = medium;
	}
	/**
	 * 差的人数get()方法
	 * @return
	 */
	public Integer getBad() {
		return bad;
	}
	/**
	 * 差的人数set()方法
	 * @param bad
	 */
	public void setBad(Integer bad) {
		this.bad = bad;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj!=null && obj.getClass()==CountTeacherEvaluate.class) {
			CountTeacherEvaluate cte = (CountTeacherEvaluate) obj;
			//当其所有的File都相等时，可以认为两个对象相等
			if(cte.getSchoolYear().equals(this.getSchoolYear()) && 
					cte.getCollege().equals(this.getCollege()))
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return schoolYear.hashCode() + college.hashCode()*2;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
