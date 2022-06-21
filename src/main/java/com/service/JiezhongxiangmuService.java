package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongxiangmuView;


/**
 * 接种项目
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface JiezhongxiangmuService extends IService<JiezhongxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongxiangmuVO> selectListVO(Wrapper<JiezhongxiangmuEntity> wrapper);
   	
   	JiezhongxiangmuVO selectVO(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
   	
   	List<JiezhongxiangmuView> selectListView(Wrapper<JiezhongxiangmuEntity> wrapper);
   	
   	JiezhongxiangmuView selectView(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongxiangmuEntity> wrapper);
   	
}

