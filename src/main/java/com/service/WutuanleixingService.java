package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WutuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WutuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WutuanleixingView;


/**
 * 舞团类型
 *
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public interface WutuanleixingService extends IService<WutuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WutuanleixingVO> selectListVO(Wrapper<WutuanleixingEntity> wrapper);
   	
   	WutuanleixingVO selectVO(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
   	
   	List<WutuanleixingView> selectListView(Wrapper<WutuanleixingEntity> wrapper);
   	
   	WutuanleixingView selectView(@Param("ew") Wrapper<WutuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WutuanleixingEntity> wrapper);
   	

}

