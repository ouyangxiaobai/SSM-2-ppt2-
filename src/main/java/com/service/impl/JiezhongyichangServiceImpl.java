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


import com.dao.JiezhongyichangDao;
import com.entity.JiezhongyichangEntity;
import com.service.JiezhongyichangService;
import com.entity.vo.JiezhongyichangVO;
import com.entity.view.JiezhongyichangView;

@Service("jiezhongyichangService")
public class JiezhongyichangServiceImpl extends ServiceImpl<JiezhongyichangDao, JiezhongyichangEntity> implements JiezhongyichangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongyichangEntity> page = this.selectPage(
                new Query<JiezhongyichangEntity>(params).getPage(),
                new EntityWrapper<JiezhongyichangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongyichangEntity> wrapper) {
		  Page<JiezhongyichangView> page =new Query<JiezhongyichangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongyichangVO> selectListVO(Wrapper<JiezhongyichangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongyichangVO selectVO(Wrapper<JiezhongyichangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongyichangView> selectListView(Wrapper<JiezhongyichangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongyichangView selectView(Wrapper<JiezhongyichangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
