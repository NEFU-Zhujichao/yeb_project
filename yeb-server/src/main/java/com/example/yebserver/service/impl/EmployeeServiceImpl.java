package com.example.yebserver.service.impl;

import com.example.yebserver.pojo.Employee;
import com.example.yebserver.mapper.EmployeeMapper;
import com.example.yebserver.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
