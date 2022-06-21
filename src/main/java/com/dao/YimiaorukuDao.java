package com.dao;

import com.entity.YimiaorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaorukuVO;
import com.entity.view.YimiaorukuView;


/**
 * 疫苗入库
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface YimiaorukuDao extends BaseMapper<YimiaorukuEntity> {
	
	List<YimiaorukuVO> selectListVO(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
	
	YimiaorukuVO selectVO(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
	
	List<YimiaorukuView> selectListView(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);

	List<YimiaorukuView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
	
	YimiaorukuView selectView(@Param("ew") Wrapper<YimiaorukuEntity> wrapper);
	
}
