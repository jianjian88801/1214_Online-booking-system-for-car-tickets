package com.entity.view;

import com.entity.HuanpiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 换票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
@TableName("huanpiao")
public class HuanpiaoView  extends HuanpiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanpiaoView(){
	}
 
 	public HuanpiaoView(HuanpiaoEntity huanpiaoEntity){
 	try {
			BeanUtils.copyProperties(this, huanpiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
