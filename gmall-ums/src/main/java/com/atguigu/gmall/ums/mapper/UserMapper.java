package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-01-10 11:11:06
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
