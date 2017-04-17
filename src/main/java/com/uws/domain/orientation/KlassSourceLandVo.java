package com.uws.domain.orientation;

public class KlassSourceLandVo {
	//人数
	private Long num;
	//id
	private String klassId;
	//省份code
	private String sourceLand;
	
	public KlassSourceLandVo(Long num, String klassId, String sourceLand) {
		this.num = num;
		this.klassId = klassId;
		this.sourceLand = sourceLand;
	}
	
	
	/**
	 * 人数get()方法
	 * @return
	 */
	public Long getNum() {
		return num;
	}
	/**
	 * 人数set()方法
	 * @param num
	 */
	public void setNum(Long num) {
		this.num = num;
	}
	/**
	 * id get()方法
	 * @return
	 */
	public String getKlassId() {
		return klassId;
	}
	/**
	 * id set()方法
	 * @param klassId
	 */
	public void setKlassId(String klassId) {
		this.klassId = klassId;
	}
	/**
	 * 生源地字符串get()方法
	 * @return
	 */
	public String getSourceLand() {
		return sourceLand;
	}
	/**
	 * 生源地字符串set()方法
	 * @param sourceLand
	 */
	public void setSourceLand(String sourceLand) {
		this.sourceLand = sourceLand;
	}
	
}
