package com.entity.view;

import com.entity.WutuanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 舞团类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 19:21:35
 */
@TableName("wutuanleixing")
public class WutuanleixingView  extends WutuanleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WutuanleixingView(){
	}
 
 	public WutuanleixingView(WutuanleixingEntity wutuanleixingEntity){
 	try {
			BeanUtils.copyProperties(this, wutuanleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
