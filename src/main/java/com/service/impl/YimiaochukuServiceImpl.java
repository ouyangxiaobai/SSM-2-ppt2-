package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YimiaochukuDao;
import com.entity.YimiaochukuEntity;
import com.service.YimiaochukuService;
import com.entity.vo.YimiaochukuVO;
import com.entity.view.YimiaochukuView;

@Service("yimiaochukuService")
public class YimiaochukuServiceImpl extends ServiceImpl<YimiaochukuDao, YimiaochukuEntity> implements YimiaochukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaochukuEntity> page = this.selectPage(
                new Query<YimiaochukuEntity>(params).getPage(),
                new EntityWrapper<YimiaochukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaochukuEntity> wrapper) {
		  Page<YimiaochukuView> page =new Query<YimiaochukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaochukuVO> selectListVO(Wrapper<YimiaochukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaochukuVO selectVO(Wrapper<YimiaochukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaochukuView> selectListView(Wrapper<YimiaochukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaochukuView selectView(Wrapper<YimiaochukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
