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


import com.dao.JiezhongxiangmuDao;
import com.entity.JiezhongxiangmuEntity;
import com.service.JiezhongxiangmuService;
import com.entity.vo.JiezhongxiangmuVO;
import com.entity.view.JiezhongxiangmuView;

@Service("jiezhongxiangmuService")
public class JiezhongxiangmuServiceImpl extends ServiceImpl<JiezhongxiangmuDao, JiezhongxiangmuEntity> implements JiezhongxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongxiangmuEntity> page = this.selectPage(
                new Query<JiezhongxiangmuEntity>(params).getPage(),
                new EntityWrapper<JiezhongxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongxiangmuEntity> wrapper) {
		  Page<JiezhongxiangmuView> page =new Query<JiezhongxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongxiangmuVO> selectListVO(Wrapper<JiezhongxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongxiangmuVO selectVO(Wrapper<JiezhongxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongxiangmuView> selectListView(Wrapper<JiezhongxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongxiangmuView selectView(Wrapper<JiezhongxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
