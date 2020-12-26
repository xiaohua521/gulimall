package com.hua.gulimall.product.dao;

import com.hua.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author quzhenhua
 * @email zhenhua708@163.com
 * @date 2020-12-26 09:31:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
