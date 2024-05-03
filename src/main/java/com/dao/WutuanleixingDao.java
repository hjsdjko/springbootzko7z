package com.dao;

import com.entity.WutuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WutuanleixingVO;
import com.entity.view.WutuanleixingView;


/**
 * 舞团类型
 * 
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public interface WutuanleixingDao extends BaseMapper<WutuanleixingEntity> {
	
	List<WutuanleixingVO> selectListVO(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
	
	WutuanleixingVO selectVO(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
	
	List<WutuanleixingView> selectListView(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);

	List<WutuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
	
	WutuanleixingView selectView(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
	

}
