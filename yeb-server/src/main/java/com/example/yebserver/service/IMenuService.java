package com.example.yebserver.service;

import com.example.yebserver.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 根据用户id查询菜单
     * @return
     */
    List<Menu> getMenusByAdminId();
}
