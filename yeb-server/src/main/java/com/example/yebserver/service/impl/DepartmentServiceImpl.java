package com.example.yebserver.service.impl;

import com.example.yebserver.pojo.Department;
import com.example.yebserver.mapper.DepartmentMapper;
import com.example.yebserver.pojo.RespBean;
import com.example.yebserver.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询所有部门
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);
    }
    /**
     * 添加部门
     * @param department
     * @return
     */
    @Override
    public RespBean addDep(Department department) {
        department.setEnabled(true);
        departmentMapper.addDep(department);
        if (department.getResult() == 1){
            return RespBean.success("添加成功",department);
        }
        return RespBean.error("添加失败");
    }
    /**
     * 删除部门
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department department = new Department();
        department.setId(id);
        departmentMapper.deleteDep(department);
        if (department.getResult() == -2){
            return RespBean.error("该部门下有子部门，删除失败");
        }
        if (department.getResult() == -1){
            return RespBean.error("该部门下有员工，删除失败");
        }
        if (department.getResult() == 1){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
