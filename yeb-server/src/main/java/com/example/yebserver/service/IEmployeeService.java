package com.example.yebserver.service;

import com.example.yebserver.pojo.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yebserver.pojo.RespBean;
import com.example.yebserver.pojo.RestPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
public interface IEmployeeService extends IService<Employee> {
    /**
     * 获取全部员工(分页)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RestPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, String[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean getMaxWorkId();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工工资账套
     * @param currentPage
     * @param size
     * @return
     */
    RestPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
