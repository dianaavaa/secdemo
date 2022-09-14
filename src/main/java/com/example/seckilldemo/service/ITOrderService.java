package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TOrder;
import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.vo.GoodsVo;
import com.example.seckilldemo.vo.OrderDeatilVo;
import org.apache.catalina.User;

/**
 * 服务类
 *
 * @author p
 * @since 2022-05-03
 */
public interface ITOrderService extends IService<TOrder> {


    TOrder secKill(TUser user, GoodsVo goodsVo);


    OrderDeatilVo detail(Long orderId);


    String createPath(TUser user, Long goodsId);


    boolean checkPath(TUser user, Long goodsId, String path);


    boolean checkCaptcha(TUser tuser, Long goodsId, String captcha);
}
