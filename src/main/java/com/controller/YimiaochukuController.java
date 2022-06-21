package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YimiaochukuEntity;
import com.entity.view.YimiaochukuView;

import com.service.YimiaochukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 疫苗出库
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@RestController
@RequestMapping("/yimiaochuku")
public class YimiaochukuController {
    @Autowired
    private YimiaochukuService yimiaochukuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YimiaochukuEntity yimiaochuku, 
		HttpServletRequest request){

        EntityWrapper<YimiaochukuEntity> ew = new EntityWrapper<YimiaochukuEntity>();
		PageUtils page = yimiaochukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaochuku), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YimiaochukuEntity yimiaochuku, HttpServletRequest request){
        EntityWrapper<YimiaochukuEntity> ew = new EntityWrapper<YimiaochukuEntity>();
		PageUtils page = yimiaochukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaochuku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YimiaochukuEntity yimiaochuku){
       	EntityWrapper<YimiaochukuEntity> ew = new EntityWrapper<YimiaochukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yimiaochuku, "yimiaochuku")); 
        return R.ok().put("data", yimiaochukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YimiaochukuEntity yimiaochuku){
        EntityWrapper< YimiaochukuEntity> ew = new EntityWrapper< YimiaochukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yimiaochuku, "yimiaochuku")); 
		YimiaochukuView yimiaochukuView =  yimiaochukuService.selectView(ew);
		return R.ok("查询疫苗出库成功").put("data", yimiaochukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YimiaochukuEntity yimiaochuku = yimiaochukuService.selectById(id);
        return R.ok().put("data", yimiaochuku);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YimiaochukuEntity yimiaochuku = yimiaochukuService.selectById(id);
        return R.ok().put("data", yimiaochuku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YimiaochukuEntity yimiaochuku, HttpServletRequest request){
    	yimiaochuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaochuku);

        yimiaochukuService.insert(yimiaochuku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YimiaochukuEntity yimiaochuku, HttpServletRequest request){
    	yimiaochuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaochuku);

        yimiaochukuService.insert(yimiaochuku);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YimiaochukuEntity yimiaochuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yimiaochuku);
        yimiaochukuService.updateById(yimiaochuku);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yimiaochukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YimiaochukuEntity> wrapper = new EntityWrapper<YimiaochukuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yimiaochukuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
