package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaozhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaozhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaozhishiView;


/**
 * 疫苗知识
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface YimiaozhishiService extends IService<YimiaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaozhishiVO> selectListVO(Wrapper<YimiaozhishiEntity> wrapper);
   	
   	YimiaozhishiVO selectVO(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
   	
   	List<YimiaozhishiView> selectListView(Wrapper<YimiaozhishiEntity> wrapper);
   	
   	YimiaozhishiView selectView(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaozhishiEntity> wrapper);
   	
}

