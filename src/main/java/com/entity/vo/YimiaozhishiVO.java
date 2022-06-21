package com.entity.vo;

import com.entity.YimiaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫苗知识
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public class YimiaozhishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 接种好处
	 */
	
	private String jiezhonghaochu;
		
	/**
	 * 接种事项
	 */
	
	private String jiezhongshixiang;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 发布人
	 */
	
	private String faburen;
		
	/**
	 * 关于疫苗
	 */
	
	private String guanyuyimiao;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
				
	
	/**
	 * 设置：接种好处
	 */
	 
	public void setJiezhonghaochu(String jiezhonghaochu) {
		this.jiezhonghaochu = jiezhonghaochu;
	}
	
	/**
	 * 获取：接种好处
	 */
	public String getJiezhonghaochu() {
		return jiezhonghaochu;
	}
				
	
	/**
	 * 设置：接种事项
	 */
	 
	public void setJiezhongshixiang(String jiezhongshixiang) {
		this.jiezhongshixiang = jiezhongshixiang;
	}
	
	/**
	 * 获取：接种事项
	 */
	public String getJiezhongshixiang() {
		return jiezhongshixiang;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：发布人
	 */
	 
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
				
	
	/**
	 * 设置：关于疫苗
	 */
	 
	public void setGuanyuyimiao(String guanyuyimiao) {
		this.guanyuyimiao = guanyuyimiao;
	}
	
	/**
	 * 获取：关于疫苗
	 */
	public String getGuanyuyimiao() {
		return guanyuyimiao;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
			
}
