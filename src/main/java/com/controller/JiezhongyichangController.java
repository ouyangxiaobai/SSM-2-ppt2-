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

import com.entity.JiezhongyichangEntity;
import com.entity.view.JiezhongyichangView;

import com.service.JiezhongyichangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 接种异常
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 22:25:20
 */
@RestController
@RequestMapping("/jiezhongyichang")
public class JiezhongyichangController {
    @Autowired
    private JiezhongyichangService jiezhongyichangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiezhongyichangEntity jiezhongyichang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiezhongyichang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			jiezhongyichang.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiezhongyichangEntity> ew = new EntityWrapper<JiezhongyichangEntity>();
		PageUtils page = jiezhongyichangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongyichang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiezhongyichangEntity jiezhongyichang, HttpServletRequest request){
        EntityWrapper<JiezhongyichangEntity> ew = new EntityWrapper<JiezhongyichangEntity>();
		PageUtils page = jiezhongyichangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongyichang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiezhongyichangEntity jiezhongyichang){
       	EntityWrapper<JiezhongyichangEntity> ew = new EntityWrapper<JiezhongyichangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiezhongyichang, "jiezhongyichang")); 
        return R.ok().put("data", jiezhongyichangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiezhongyichangEntity jiezhongyichang){
        EntityWrapper< JiezhongyichangEntity> ew = new EntityWrapper< JiezhongyichangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiezhongyichang, "jiezhongyichang")); 
		JiezhongyichangView jiezhongyichangView =  jiezhongyichangService.selectView(ew);
		return R.ok("查询接种异常成功").put("data", jiezhongyichangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiezhongyichangEntity jiezhongyichang = jiezhongyichangService.selectById(id);
        return R.ok().put("data", jiezhongyichang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiezhongyichangEntity jiezhongyichang = jiezhongyichangService.selectById(id);
        return R.ok().put("data", jiezhongyichang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiezhongyichangEntity jiezhongyichang, HttpServletRequest request){
    	jiezhongyichang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongyichang);

        jiezhongyichangService.insert(jiezhongyichang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiezhongyichangEntity jiezhongyichang, HttpServletRequest request){
    	jiezhongyichang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongyichang);

        jiezhongyichangService.insert(jiezhongyichang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiezhongyichangEntity jiezhongyichang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiezhongyichang);
        jiezhongyichangService.updateById(jiezhongyichang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiezhongyichangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiezhongyichangEntity> wrapper = new EntityWrapper<JiezhongyichangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			wrapper.eq("yihugonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiezhongyichangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
