package com.example.yebserver.controller;

import com.example.yebserver.pojo.Menu;
import com.example.yebserver.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private IMenuService menuService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/menu")
    public Map<String, List<Menu>> getMenusWithRole(){
        List<Menu> menus = menuService.getMenusWithRole();
        return Map.of("menu",menus);
    }
    @GetMapping("/employee/basic/hello")
    public String hello2() {
        return "/employee/basic/hello";
    }
    @GetMapping("/employee/advanced/hello")
    public String hello3() {
        return "/employee/advanced/hello";
    }
}
