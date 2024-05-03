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

import com.entity.WutuanleixingEntity;
import com.entity.view.WutuanleixingView;

import com.service.WutuanleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 舞团类型
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
@RestController
@RequestMapping("/wutuanleixing")
public class WutuanleixingController {
    @Autowired
    private WutuanleixingService wutuanleixingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WutuanleixingEntity wutuanleixing,
		HttpServletRequest request){
        EntityWrapper<WutuanleixingEntity> ew = new EntityWrapper<WutuanleixingEntity>();
		PageUtils page = wutuanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wutuanleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WutuanleixingEntity wutuanleixing, 
		HttpServletRequest request){
        EntityWrapper<WutuanleixingEntity> ew = new EntityWrapper<WutuanleixingEntity>();
		PageUtils page = wutuanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wutuanleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WutuanleixingEntity wutuanleixing){
       	EntityWrapper<WutuanleixingEntity> ew = new EntityWrapper<WutuanleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wutuanleixing, "wutuanleixing")); 
        return R.ok().put("data", wutuanleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WutuanleixingEntity wutuanleixing){
        EntityWrapper< WutuanleixingEntity> ew = new EntityWrapper< WutuanleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wutuanleixing, "wutuanleixing")); 
		WutuanleixingView wutuanleixingView =  wutuanleixingService.selectView(ew);
		return R.ok("查询舞团类型成功").put("data", wutuanleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WutuanleixingEntity wutuanleixing = wutuanleixingService.selectById(id);
        return R.ok().put("data", wutuanleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WutuanleixingEntity wutuanleixing = wutuanleixingService.selectById(id);
        return R.ok().put("data", wutuanleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WutuanleixingEntity wutuanleixing, HttpServletRequest request){
    	wutuanleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wutuanleixing);
        wutuanleixingService.insert(wutuanleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WutuanleixingEntity wutuanleixing, HttpServletRequest request){
    	wutuanleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wutuanleixing);
        wutuanleixingService.insert(wutuanleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WutuanleixingEntity wutuanleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wutuanleixing);
        wutuanleixingService.updateById(wutuanleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wutuanleixingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WutuanleixingEntity> wrapper = new EntityWrapper<WutuanleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wutuanleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
