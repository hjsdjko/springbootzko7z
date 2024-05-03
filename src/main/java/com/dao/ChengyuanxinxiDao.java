package com.dao;

import com.entity.ChengyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengyuanxinxiVO;
import com.entity.view.ChengyuanxinxiView;


/**
 * 成员信息
 * 
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public interface ChengyuanxinxiDao extends BaseMapper<ChengyuanxinxiEntity> {
	
	List<ChengyuanxinxiVO> selectListVO(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
	
	ChengyuanxinxiVO selectVO(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
	
	List<ChengyuanxinxiView> selectListView(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);

	List<ChengyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
	
	ChengyuanxinxiView selectView(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
	

}
