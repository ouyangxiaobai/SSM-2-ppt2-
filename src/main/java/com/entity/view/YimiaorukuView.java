package com.entity.view;

import com.entity.YimiaorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@TableName("yimiaoruku")
public class YimiaorukuView  extends YimiaorukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaorukuView(){
	}
 
 	public YimiaorukuView(YimiaorukuEntity yimiaorukuEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaorukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
