package com.entity.model;

import com.entity.ShetuanhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 社团活动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public class ShetuanhuodongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动类型
	 */
	
	private String huodongleixing;
		
	/**
	 * 活动图片
	 */
	
	private String huodongtupian;
		
	/**
	 * 舞蹈曲目
	 */
	
	private String wudaoqumu;
		
	/**
	 * 视频内容
	 */
	
	private String shipinneirong;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 社团编号
	 */
	
	private String shetuanbianhao;
		
	/**
	 * 社团名称
	 */
	
	private String shetuanmingcheng;
				
	
	/**
	 * 设置：活动类型
	 */
	 
	public void setHuodongleixing(String huodongleixing) {
		this.huodongleixing = huodongleixing;
	}
	
	/**
	 * 获取：活动类型
	 */
	public String getHuodongleixing() {
		return huodongleixing;
	}
				
	
	/**
	 * 设置：活动图片
	 */
	 
	public void setHuodongtupian(String huodongtupian) {
		this.huodongtupian = huodongtupian;
	}
	
	/**
	 * 获取：活动图片
	 */
	public String getHuodongtupian() {
		return huodongtupian;
	}
				
	
	/**
	 * 设置：舞蹈曲目
	 */
	 
	public void setWudaoqumu(String wudaoqumu) {
		this.wudaoqumu = wudaoqumu;
	}
	
	/**
	 * 获取：舞蹈曲目
	 */
	public String getWudaoqumu() {
		return wudaoqumu;
	}
				
	
	/**
	 * 设置：视频内容
	 */
	 
	public void setShipinneirong(String shipinneirong) {
		this.shipinneirong = shipinneirong;
	}
	
	/**
	 * 获取：视频内容
	 */
	public String getShipinneirong() {
		return shipinneirong;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：社团编号
	 */
	 
	public void setShetuanbianhao(String shetuanbianhao) {
		this.shetuanbianhao = shetuanbianhao;
	}
	
	/**
	 * 获取：社团编号
	 */
	public String getShetuanbianhao() {
		return shetuanbianhao;
	}
				
	
	/**
	 * 设置：社团名称
	 */
	 
	public void setShetuanmingcheng(String shetuanmingcheng) {
		this.shetuanmingcheng = shetuanmingcheng;
	}
	
	/**
	 * 获取：社团名称
	 */
	public String getShetuanmingcheng() {
		return shetuanmingcheng;
	}
			
}
