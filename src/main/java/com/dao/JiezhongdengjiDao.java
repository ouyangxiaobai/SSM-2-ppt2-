package com.dao;

import com.entity.JiezhongdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongdengjiVO;
import com.entity.view.JiezhongdengjiView;


/**
 * 接种登记
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
public interface JiezhongdengjiDao extends BaseMapper<JiezhongdengjiEntity> {
	
	List<JiezhongdengjiVO> selectListVO(@Param("ew") Wrapper<JiezhongdengjiEntity> wrapper);
	
	JiezhongdengjiVO selectVO(@Param("ew") Wrapper<JiezhongdengjiEntity> wrapper);
	
	List<JiezhongdengjiView> selectListView(@Param("ew") Wrapper<JiezhongdengjiEntity> wrapper);

	List<JiezhongdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongdengjiEntity> wrapper);
	
	JiezhongdengjiView selectView(@Param("ew") Wrapper<JiezhongdengjiEntity> wrapper);
	
}
