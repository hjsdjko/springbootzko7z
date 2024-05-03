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


import com.dao.WutuanleixingDao;
import com.entity.WutuanleixingEntity;
import com.service.WutuanleixingService;
import com.entity.vo.WutuanleixingVO;
import com.entity.view.WutuanleixingView;

@Service("wutuanleixingService")
public class WutuanleixingServiceImpl extends ServiceImpl<WutuanleixingDao, WutuanleixingEntity> implements WutuanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WutuanleixingEntity> page = this.selectPage(
                new Query<WutuanleixingEntity>(params).getPage(),
                new EntityWrapper<WutuanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WutuanleixingEntity> wrapper) {
		  Page<WutuanleixingView> page =new Query<WutuanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WutuanleixingVO> selectListVO(Wrapper<WutuanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WutuanleixingVO selectVO(Wrapper<WutuanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WutuanleixingView> selectListView(Wrapper<WutuanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WutuanleixingView selectView(Wrapper<WutuanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
