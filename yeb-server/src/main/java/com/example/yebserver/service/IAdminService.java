package com.example.yebserver.service;

import com.example.yebserver.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yebserver.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);
}
