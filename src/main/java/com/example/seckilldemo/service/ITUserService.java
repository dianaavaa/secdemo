package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.vo.LoginVo;
import com.example.seckilldemo.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author p
 * @since 2022-05-02
 */

public interface ITUserService extends IService<TUser> {


    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);


    TUser getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);



    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
