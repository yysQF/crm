package com.crm.web.controller;

import com.crm.bean.Role;
import com.crm.exception.CrmException;
import com.crm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/selectById")
    // restful请求响应
    public ResponseEntity selectById(Long id){
        // Web层不处理异常,交给全局异常处理
        Role role = roleService.findById(id);
        return ResponseEntity.ok(role);
    }
}
