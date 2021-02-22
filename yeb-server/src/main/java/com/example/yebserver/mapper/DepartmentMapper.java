package com.example.yebserver.mapper;

import com.example.yebserver.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 查询所有部门
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    /**
     * 添加部门
     * @param department
     */
    void addDep(Department department);
    /**
     * 删除部门
     * @param department
     * @return
     */
    void deleteDep(Department department);
}
