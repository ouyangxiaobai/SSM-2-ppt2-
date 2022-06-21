package com.entity.view;

import com.entity.YimiaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@TableName("yimiaozhishi")
public class YimiaozhishiView  extends YimiaozhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaozhishiView(){
	}
 
 	public YimiaozhishiView(YimiaozhishiEntity yimiaozhishiEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaozhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
