package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaorukuView;


/**
 * 疫苗入库
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface YimiaorukuService extends IService<YimiaorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaorukuVO> selectListVO(Wrapper<YimiaorukuEntity> wrapper);
   	
   	YimiaorukuVO selectVO(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
   	
   	List<YimiaorukuView> selectListView(Wrapper<YimiaorukuEntity> wrapper);
   	
   	YimiaorukuView selectView(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaorukuEntity> wrapper);
   	
}

