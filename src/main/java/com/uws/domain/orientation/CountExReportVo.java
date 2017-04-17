package com.uws.domain.orientation;

/**
 * 用于预期报到统计页面展示的类
 * @author z
 *
 */
public class CountExReportVo {
	//行名
	private String name;
	//学员人数
	private Integer num;
	//自备车数
	private Integer cars;
	//需要寝具包的人数
	private Integer beds;
	//迁移户口的人数
	private Integer moves;
	//总陪同人数
	private Integer togethers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getCars() {
		return cars;
	}
	public void setCars(Integer cars) {
		this.cars = cars;
	}
	public Integer getBeds() {
		return beds;
	}
	public void setBeds(Integer beds) {
		this.beds = beds;
	}
	public Integer getMoves() {
		return moves;
	}
	public void setMoves(Integer moves) {
		this.moves = moves;
	}
	public Integer getTogethers() {
		return togethers;
	}
	public void setTogethers(Integer togethers) {
		this.togethers = togethers;
	}
	
}
