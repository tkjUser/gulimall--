package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tkj
 * @email 302994@163.com
 * @date 2022-09-19 22:38:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
