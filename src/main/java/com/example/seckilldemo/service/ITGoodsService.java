package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TGoods;
import com.example.seckilldemo.vo.GoodsVo;

import java.util.List;

/**
 * 商品表 服务类
 *
 * @author p
 * @since 2022-05-03
 */
public interface ITGoodsService extends IService<TGoods> {


    List<GoodsVo> findGoodsVo();


    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
