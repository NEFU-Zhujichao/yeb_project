package com.example.yebserver.mapper;

import com.example.yebserver.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

    /**
     * 获取所有操作员
     * @param id
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
