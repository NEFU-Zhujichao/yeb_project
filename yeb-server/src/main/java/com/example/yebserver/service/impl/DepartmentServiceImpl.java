package com.example.yebserver.service.impl;

import com.example.yebserver.pojo.Department;
import com.example.yebserver.mapper.DepartmentMapper;
import com.example.yebserver.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
