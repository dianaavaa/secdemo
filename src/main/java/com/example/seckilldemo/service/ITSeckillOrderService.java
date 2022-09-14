package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TSeckillOrder;
import com.example.seckilldemo.entity.TUser;

/**
 * 秒杀订单表 服务类
 *
 * @author p
 * @since 2022-05-03
 */
public interface ITSeckillOrderService extends IService<TSeckillOrder> {


    Long getResult(TUser tUser, Long goodsId);
}
