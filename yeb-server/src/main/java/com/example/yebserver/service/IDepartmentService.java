package com.example.yebserver.service;

import com.example.yebserver.pojo.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yebserver.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
public interface IDepartmentService extends IService<Department> {
    /**
     * 查询所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param department
     * @return
     */
    RespBean addDep(Department department);

    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
