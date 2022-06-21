package com.entity.model;

import com.entity.JiezhongdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 接种登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public class JiezhongdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 接种卡号
	 */
	
	private String jiezhongkahao;
		
	/**
	 * 出生日期
	 */
	
	private String chushengriqi;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 监护人姓名
	 */
	
	private String jianhurenxingming;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 家长电话
	 */
	
	private String yonghushouji;
		
	/**
	 * 接种日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhongriqi;
		
	/**
	 * 疫苗名称
	 */
	
	private String yimiaomingcheng;
		
	/**
	 * 接种次数
	 */
	
	private String jiezhongcishu;
		
	/**
	 * 接种历史
	 */
	
	private String jiezhonglishi;
		
	/**
	 * 下次接种时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiacijiezhongshijian;
		
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
	 * 设置：接种卡号
	 */
	 
	public void setJiezhongkahao(String jiezhongkahao) {
		this.jiezhongkahao = jiezhongkahao;
	}
	
	/**
	 * 获取：接种卡号
	 */
	public String getJiezhongkahao() {
		return jiezhongkahao;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(String chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public String getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：身份证号
	 */
	 
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
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
	 * 设置：接种日期
	 */
	 
	public void setJiezhongriqi(Date jiezhongriqi) {
		this.jiezhongriqi = jiezhongriqi;
	}
	
	/**
	 * 获取：接种日期
	 */
	public Date getJiezhongriqi() {
		return jiezhongriqi;
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
	 * 设置：接种次数
	 */
	 
	public void setJiezhongcishu(String jiezhongcishu) {
		this.jiezhongcishu = jiezhongcishu;
	}
	
	/**
	 * 获取：接种次数
	 */
	public String getJiezhongcishu() {
		return jiezhongcishu;
	}
				
	
	/**
	 * 设置：接种历史
	 */
	 
	public void setJiezhonglishi(String jiezhonglishi) {
		this.jiezhonglishi = jiezhonglishi;
	}
	
	/**
	 * 获取：接种历史
	 */
	public String getJiezhonglishi() {
		return jiezhonglishi;
	}
				
	
	/**
	 * 设置：下次接种时间
	 */
	 
	public void setXiacijiezhongshijian(Date xiacijiezhongshijian) {
		this.xiacijiezhongshijian = xiacijiezhongshijian;
	}
	
	/**
	 * 获取：下次接种时间
	 */
	public Date getXiacijiezhongshijian() {
		return xiacijiezhongshijian;
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
