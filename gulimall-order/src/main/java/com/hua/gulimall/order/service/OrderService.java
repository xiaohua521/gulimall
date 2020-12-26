package com.hua.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.common.utils.PageUtils;
import com.hua.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author quzhenhua
 * @email zhenhua708@163.com
 * @date 2020-12-26 10:04:00
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

