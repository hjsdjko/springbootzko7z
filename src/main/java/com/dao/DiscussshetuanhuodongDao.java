package com.dao;

import com.entity.DiscussshetuanhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshetuanhuodongVO;
import com.entity.view.DiscussshetuanhuodongView;


/**
 * 社团活动评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public interface DiscussshetuanhuodongDao extends BaseMapper<DiscussshetuanhuodongEntity> {
	
	List<DiscussshetuanhuodongVO> selectListVO(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
	
	DiscussshetuanhuodongVO selectVO(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
	
	List<DiscussshetuanhuodongView> selectListView(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);

	List<DiscussshetuanhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
	
	DiscussshetuanhuodongView selectView(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
	

}
