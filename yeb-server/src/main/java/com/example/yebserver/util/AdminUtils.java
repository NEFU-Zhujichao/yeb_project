package com.example.yebserver.util;

import com.example.yebserver.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

public class AdminUtils {
    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin(){
        return ((Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
