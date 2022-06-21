package com.entity.vo;

import com.entity.YimiaorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫苗入库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public class YimiaorukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 疫苗编号
	 */
	
	private String yimiaobianhao;
		
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
	
	private String yimiaoshuliang;
		
	/**
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
		
	/**
	 * 操作人
	 */
	
	private String caozuoren;
				
	
	/**
	 * 设置：疫苗编号
	 */
	 
	public void setYimiaobianhao(String yimiaobianhao) {
		this.yimiaobianhao = yimiaobianhao;
	}
	
	/**
	 * 获取：疫苗编号
	 */
	public String getYimiaobianhao() {
		return yimiaobianhao;
	}
				
	
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
	 
	public void setYimiaoshuliang(String yimiaoshuliang) {
		this.yimiaoshuliang = yimiaoshuliang;
	}
	
	/**
	 * 获取：疫苗数量
	 */
	public String getYimiaoshuliang() {
		return yimiaoshuliang;
	}
				
	
	/**
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
				
	
	/**
	 * 设置：操作人
	 */
	 
	public void setCaozuoren(String caozuoren) {
		this.caozuoren = caozuoren;
	}
	
	/**
	 * 获取：操作人
	 */
	public String getCaozuoren() {
		return caozuoren;
	}
			
}
