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


import com.dao.YimiaorukuDao;
import com.entity.YimiaorukuEntity;
import com.service.YimiaorukuService;
import com.entity.vo.YimiaorukuVO;
import com.entity.view.YimiaorukuView;

@Service("yimiaorukuService")
public class YimiaorukuServiceImpl extends ServiceImpl<YimiaorukuDao, YimiaorukuEntity> implements YimiaorukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaorukuEntity> page = this.selectPage(
                new Query<YimiaorukuEntity>(params).getPage(),
                new EntityWrapper<YimiaorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaorukuEntity> wrapper) {
		  Page<YimiaorukuView> page =new Query<YimiaorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaorukuVO> selectListVO(Wrapper<YimiaorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaorukuVO selectVO(Wrapper<YimiaorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaorukuView> selectListView(Wrapper<YimiaorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaorukuView selectView(Wrapper<YimiaorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
