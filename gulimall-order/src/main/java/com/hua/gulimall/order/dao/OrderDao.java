package com.hua.gulimall.order.dao;

import com.hua.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author quzhenhua
 * @email zhenhua708@163.com
 * @date 2020-12-26 10:04:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
