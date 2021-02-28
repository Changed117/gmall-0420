package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 商品三级分类
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-01-06 21:53:50
 */
@Mapper
@Repository //解决了在service注入报找不到实体类的问题
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
