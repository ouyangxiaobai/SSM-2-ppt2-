package com.dao;

import com.entity.JiezhongxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongxiangmuVO;
import com.entity.view.JiezhongxiangmuView;


/**
 * 接种项目
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface JiezhongxiangmuDao extends BaseMapper<JiezhongxiangmuEntity> {
	
	List<JiezhongxiangmuVO> selectListVO(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
	
	JiezhongxiangmuVO selectVO(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
	
	List<JiezhongxiangmuView> selectListView(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);

	List<JiezhongxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
	
	JiezhongxiangmuView selectView(@Param("ew") Wrapper<JiezhongxiangmuEntity> wrapper);
	
}
