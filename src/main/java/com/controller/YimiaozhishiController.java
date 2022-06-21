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

import com.entity.YimiaozhishiEntity;
import com.entity.view.YimiaozhishiView;

import com.service.YimiaozhishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 疫苗知识
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@RestController
@RequestMapping("/yimiaozhishi")
public class YimiaozhishiController {
    @Autowired
    private YimiaozhishiService yimiaozhishiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YimiaozhishiEntity yimiaozhishi, 
		HttpServletRequest request){

        EntityWrapper<YimiaozhishiEntity> ew = new EntityWrapper<YimiaozhishiEntity>();
		PageUtils page = yimiaozhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaozhishi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YimiaozhishiEntity yimiaozhishi, HttpServletRequest request){
        EntityWrapper<YimiaozhishiEntity> ew = new EntityWrapper<YimiaozhishiEntity>();
		PageUtils page = yimiaozhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaozhishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YimiaozhishiEntity yimiaozhishi){
       	EntityWrapper<YimiaozhishiEntity> ew = new EntityWrapper<YimiaozhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yimiaozhishi, "yimiaozhishi")); 
        return R.ok().put("data", yimiaozhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YimiaozhishiEntity yimiaozhishi){
        EntityWrapper< YimiaozhishiEntity> ew = new EntityWrapper< YimiaozhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yimiaozhishi, "yimiaozhishi")); 
		YimiaozhishiView yimiaozhishiView =  yimiaozhishiService.selectView(ew);
		return R.ok("查询疫苗知识成功").put("data", yimiaozhishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YimiaozhishiEntity yimiaozhishi = yimiaozhishiService.selectById(id);
        return R.ok().put("data", yimiaozhishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YimiaozhishiEntity yimiaozhishi = yimiaozhishiService.selectById(id);
        return R.ok().put("data", yimiaozhishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YimiaozhishiEntity yimiaozhishi, HttpServletRequest request){
    	yimiaozhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaozhishi);

        yimiaozhishiService.insert(yimiaozhishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YimiaozhishiEntity yimiaozhishi, HttpServletRequest request){
    	yimiaozhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaozhishi);

        yimiaozhishiService.insert(yimiaozhishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YimiaozhishiEntity yimiaozhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yimiaozhishi);
        yimiaozhishiService.updateById(yimiaozhishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yimiaozhishiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YimiaozhishiEntity> wrapper = new EntityWrapper<YimiaozhishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yimiaozhishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
