package com.dao;

import com.entity.YimiaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaozhishiVO;
import com.entity.view.YimiaozhishiView;


/**
 * 疫苗知识
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface YimiaozhishiDao extends BaseMapper<YimiaozhishiEntity> {
	
	List<YimiaozhishiVO> selectListVO(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
	
	YimiaozhishiVO selectVO(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
	
	List<YimiaozhishiView> selectListView(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);

	List<YimiaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
	
	YimiaozhishiView selectView(@Param("ew") Wrapper<YimiaozhishiEntity> wrapper);
	
}
