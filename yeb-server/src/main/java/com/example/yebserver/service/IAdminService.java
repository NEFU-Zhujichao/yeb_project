package com.example.yebserver.service;

import com.example.yebserver.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yebserver.pojo.Menu;
import com.example.yebserver.pojo.RespBean;
import com.example.yebserver.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    RespBean login(String username, String password,String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新操作员角色列表
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
