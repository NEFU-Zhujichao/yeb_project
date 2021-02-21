package com.example.yebserver.mapper;

import com.example.yebserver.pojo.MenuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yebserver.pojo.RespBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
@Repository
public interface MenuRoleMapper extends BaseMapper<MenuRole> {
    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    Integer insertBatch(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
