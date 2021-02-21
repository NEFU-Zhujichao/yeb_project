package com.example.yebserver.service;

import com.example.yebserver.pojo.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yebserver.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
public interface IMenuRoleService extends IService<MenuRole> {
    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid,Integer[] mids);
}
