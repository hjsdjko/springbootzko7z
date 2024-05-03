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


import com.dao.ChengyuanxinxiDao;
import com.entity.ChengyuanxinxiEntity;
import com.service.ChengyuanxinxiService;
import com.entity.vo.ChengyuanxinxiVO;
import com.entity.view.ChengyuanxinxiView;

@Service("chengyuanxinxiService")
public class ChengyuanxinxiServiceImpl extends ServiceImpl<ChengyuanxinxiDao, ChengyuanxinxiEntity> implements ChengyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengyuanxinxiEntity> page = this.selectPage(
                new Query<ChengyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ChengyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengyuanxinxiEntity> wrapper) {
		  Page<ChengyuanxinxiView> page =new Query<ChengyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengyuanxinxiVO> selectListVO(Wrapper<ChengyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengyuanxinxiVO selectVO(Wrapper<ChengyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengyuanxinxiView> selectListView(Wrapper<ChengyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengyuanxinxiView selectView(Wrapper<ChengyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
