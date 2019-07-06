package com.cheer.controller;

import com.cheer.domain.Emp;
import com.cheer.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("hello")
    public String hello(){
        List<Emp> list = empService.getEmp();
        System.out.println(list);
        return "hello";
    }
}
