package com.entity.vo;

import com.entity.YimiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫苗信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public class YimiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 批次号
	 */
	
	private String picihao;
		
	/**
	 * 疫苗名称
	 */
	
	private String yimiaomingcheng;
		
	/**
	 * 疫苗属性
	 */
	
	private String yimiaoshuxing;
		
	/**
	 * 疫苗数量
	 */
	
	private Integer yimiaoshuliang;
		
	/**
	 * 批准文号
	 */
	
	private String pizhunwenhao;
		
	/**
	 * 有效期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxiaoqi;
				
	
	/**
	 * 设置：批次号
	 */
	 
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
				
	
	/**
	 * 设置：疫苗名称
	 */
	 
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
				
	
	/**
	 * 设置：疫苗属性
	 */
	 
	public void setYimiaoshuxing(String yimiaoshuxing) {
		this.yimiaoshuxing = yimiaoshuxing;
	}
	
	/**
	 * 获取：疫苗属性
	 */
	public String getYimiaoshuxing() {
		return yimiaoshuxing;
	}
				
	
	/**
	 * 设置：疫苗数量
	 */
	 
	public void setYimiaoshuliang(Integer yimiaoshuliang) {
		this.yimiaoshuliang = yimiaoshuliang;
	}
	
	/**
	 * 获取：疫苗数量
	 */
	public Integer getYimiaoshuliang() {
		return yimiaoshuliang;
	}
				
	
	/**
	 * 设置：批准文号
	 */
	 
	public void setPizhunwenhao(String pizhunwenhao) {
		this.pizhunwenhao = pizhunwenhao;
	}
	
	/**
	 * 获取：批准文号
	 */
	public String getPizhunwenhao() {
		return pizhunwenhao;
	}
				
	
	/**
	 * 设置：有效期
	 */
	 
	public void setYouxiaoqi(Date youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	
	/**
	 * 获取：有效期
	 */
	public Date getYouxiaoqi() {
		return youxiaoqi;
	}
			
}
