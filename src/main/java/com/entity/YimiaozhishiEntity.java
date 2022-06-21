package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 疫苗知识
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@TableName("yimiaozhishi")
public class YimiaozhishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaozhishiEntity() {
		
	}
	
	public YimiaozhishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
