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


import com.dao.YimiaozhishiDao;
import com.entity.YimiaozhishiEntity;
import com.service.YimiaozhishiService;
import com.entity.vo.YimiaozhishiVO;
import com.entity.view.YimiaozhishiView;

@Service("yimiaozhishiService")
public class YimiaozhishiServiceImpl extends ServiceImpl<YimiaozhishiDao, YimiaozhishiEntity> implements YimiaozhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaozhishiEntity> page = this.selectPage(
                new Query<YimiaozhishiEntity>(params).getPage(),
                new EntityWrapper<YimiaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaozhishiEntity> wrapper) {
		  Page<YimiaozhishiView> page =new Query<YimiaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaozhishiVO> selectListVO(Wrapper<YimiaozhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaozhishiVO selectVO(Wrapper<YimiaozhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaozhishiView> selectListView(Wrapper<YimiaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaozhishiView selectView(Wrapper<YimiaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
