package com.entity.view;

import com.entity.JiezhongyichangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接种异常
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@TableName("jiezhongyichang")
public class JiezhongyichangView  extends JiezhongyichangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiezhongyichangView(){
	}
 
 	public JiezhongyichangView(JiezhongyichangEntity jiezhongyichangEntity){
 	try {
			BeanUtils.copyProperties(this, jiezhongyichangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
