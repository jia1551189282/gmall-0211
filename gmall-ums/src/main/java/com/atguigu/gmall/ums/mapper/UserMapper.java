package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author fengge
 * @email zjiajia@155.com
 * @date 2020-07-29 15:18:28
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
