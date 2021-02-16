package com.example.yebserver.service.impl;

import com.example.yebserver.pojo.Nation;
import com.example.yebserver.mapper.NationMapper;
import com.example.yebserver.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
