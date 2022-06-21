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

import com.entity.JiezhongxiangmuEntity;
import com.entity.view.JiezhongxiangmuView;

import com.service.JiezhongxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 接种项目
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@RestController
@RequestMapping("/jiezhongxiangmu")
public class JiezhongxiangmuController {
    @Autowired
    private JiezhongxiangmuService jiezhongxiangmuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiezhongxiangmuEntity jiezhongxiangmu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yihurenyuan")) {
			jiezhongxiangmu.setYihuxingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiezhongxiangmuEntity> ew = new EntityWrapper<JiezhongxiangmuEntity>();
		PageUtils page = jiezhongxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongxiangmu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiezhongxiangmuEntity jiezhongxiangmu, HttpServletRequest request){
        EntityWrapper<JiezhongxiangmuEntity> ew = new EntityWrapper<JiezhongxiangmuEntity>();
		PageUtils page = jiezhongxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiezhongxiangmuEntity jiezhongxiangmu){
       	EntityWrapper<JiezhongxiangmuEntity> ew = new EntityWrapper<JiezhongxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiezhongxiangmu, "jiezhongxiangmu")); 
        return R.ok().put("data", jiezhongxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiezhongxiangmuEntity jiezhongxiangmu){
        EntityWrapper< JiezhongxiangmuEntity> ew = new EntityWrapper< JiezhongxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiezhongxiangmu, "jiezhongxiangmu")); 
		JiezhongxiangmuView jiezhongxiangmuView =  jiezhongxiangmuService.selectView(ew);
		return R.ok("查询接种项目成功").put("data", jiezhongxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiezhongxiangmuEntity jiezhongxiangmu = jiezhongxiangmuService.selectById(id);
        return R.ok().put("data", jiezhongxiangmu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiezhongxiangmuEntity jiezhongxiangmu = jiezhongxiangmuService.selectById(id);
        return R.ok().put("data", jiezhongxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiezhongxiangmuEntity jiezhongxiangmu, HttpServletRequest request){
    	jiezhongxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongxiangmu);

        jiezhongxiangmuService.insert(jiezhongxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiezhongxiangmuEntity jiezhongxiangmu, HttpServletRequest request){
    	jiezhongxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongxiangmu);

        jiezhongxiangmuService.insert(jiezhongxiangmu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiezhongxiangmuEntity jiezhongxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiezhongxiangmu);
        jiezhongxiangmuService.updateById(jiezhongxiangmu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiezhongxiangmuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiezhongxiangmuEntity> wrapper = new EntityWrapper<JiezhongxiangmuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yihurenyuan")) {
			wrapper.eq("yihugonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiezhongxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
