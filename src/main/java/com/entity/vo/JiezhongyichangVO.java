package com.entity.vo;

import com.entity.JiezhongyichangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 接种异常
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public class JiezhongyichangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 家长电话
	 */
	
	private String yonghushouji;
		
	/**
	 * 监护人姓名
	 */
	
	private String jianhurenxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 接种日期
	 */
	
	private String jiezhongriqi;
		
	/**
	 * 反应日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fanyingriqi;
		
	/**
	 * 反应表现
	 */
	
	private String fanyingbiaoxian;
		
	/**
	 * 临床诊断
	 */
	
	private String linchuangzhenduan;
		
	/**
	 * 诊断报告
	 */
	
	private String zhenduanbaogao;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
				
	
	/**
	 * 设置：儿童姓名
	 */
	 
	public void setErtongxingming(String ertongxingming) {
		this.ertongxingming = ertongxingming;
	}
	
	/**
	 * 获取：儿童姓名
	 */
	public String getErtongxingming() {
		return ertongxingming;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：家长电话
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：家长电话
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：监护人姓名
	 */
	 
	public void setJianhurenxingming(String jianhurenxingming) {
		this.jianhurenxingming = jianhurenxingming;
	}
	
	/**
	 * 获取：监护人姓名
	 */
	public String getJianhurenxingming() {
		return jianhurenxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：接种日期
	 */
	 
	public void setJiezhongriqi(String jiezhongriqi) {
		this.jiezhongriqi = jiezhongriqi;
	}
	
	/**
	 * 获取：接种日期
	 */
	public String getJiezhongriqi() {
		return jiezhongriqi;
	}
				
	
	/**
	 * 设置：反应日期
	 */
	 
	public void setFanyingriqi(Date fanyingriqi) {
		this.fanyingriqi = fanyingriqi;
	}
	
	/**
	 * 获取：反应日期
	 */
	public Date getFanyingriqi() {
		return fanyingriqi;
	}
				
	
	/**
	 * 设置：反应表现
	 */
	 
	public void setFanyingbiaoxian(String fanyingbiaoxian) {
		this.fanyingbiaoxian = fanyingbiaoxian;
	}
	
	/**
	 * 获取：反应表现
	 */
	public String getFanyingbiaoxian() {
		return fanyingbiaoxian;
	}
				
	
	/**
	 * 设置：临床诊断
	 */
	 
	public void setLinchuangzhenduan(String linchuangzhenduan) {
		this.linchuangzhenduan = linchuangzhenduan;
	}
	
	/**
	 * 获取：临床诊断
	 */
	public String getLinchuangzhenduan() {
		return linchuangzhenduan;
	}
				
	
	/**
	 * 设置：诊断报告
	 */
	 
	public void setZhenduanbaogao(String zhenduanbaogao) {
		this.zhenduanbaogao = zhenduanbaogao;
	}
	
	/**
	 * 获取：诊断报告
	 */
	public String getZhenduanbaogao() {
		return zhenduanbaogao;
	}
				
	
	/**
	 * 设置：医护工号
	 */
	 
	public void setYihugonghao(String yihugonghao) {
		this.yihugonghao = yihugonghao;
	}
	
	/**
	 * 获取：医护工号
	 */
	public String getYihugonghao() {
		return yihugonghao;
	}
				
	
	/**
	 * 设置：医护姓名
	 */
	 
	public void setYihuxingming(String yihuxingming) {
		this.yihuxingming = yihuxingming;
	}
	
	/**
	 * 获取：医护姓名
	 */
	public String getYihuxingming() {
		return yihuxingming;
	}
			
}
