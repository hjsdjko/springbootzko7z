package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyuanxinxiView;


/**
 * 成员信息
 *
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
public interface ChengyuanxinxiService extends IService<ChengyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengyuanxinxiVO> selectListVO(Wrapper<ChengyuanxinxiEntity> wrapper);
   	
   	ChengyuanxinxiVO selectVO(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
   	
   	List<ChengyuanxinxiView> selectListView(Wrapper<ChengyuanxinxiEntity> wrapper);
   	
   	ChengyuanxinxiView selectView(@Param("ew") Wrapper<ChengyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengyuanxinxiEntity> wrapper);
   	

}

