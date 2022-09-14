package com.example.seckilldemo.vo;

import com.example.seckilldemo.entity.TUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 秒杀信息
 *
 * @author: p
 * @date 2022/5/8 6:38 下午
 * @ClassName: SeckillMessage
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeckillMessage {

    private TUser tUser;

    private Long goodsId;
}
