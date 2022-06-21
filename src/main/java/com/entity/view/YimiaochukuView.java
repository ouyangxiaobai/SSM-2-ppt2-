package com.entity.view;

import com.entity.YimiaochukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@TableName("yimiaochuku")
public class YimiaochukuView  extends YimiaochukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaochukuView(){
	}
 
 	public YimiaochukuView(YimiaochukuEntity yimiaochukuEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaochukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
