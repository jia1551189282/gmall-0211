package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengge
 * @email zjiajia@155.com
 * @date 2020-07-29 14:40:05
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
