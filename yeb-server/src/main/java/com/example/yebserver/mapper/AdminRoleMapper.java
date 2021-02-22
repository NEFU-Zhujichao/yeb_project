package com.example.yebserver.mapper;

import com.example.yebserver.pojo.AdminRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    int addAdminRole(@Param("adminId") Integer adminId,@Param("rids") Integer[] rids);
}
