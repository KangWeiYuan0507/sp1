package com.itgaoshu.controller;

import com.itgaoshu.bean.emp;
import com.itgaoshu.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class empController {
    @Autowired
   private empService empservice;
    @RequestMapping(value = "/selectEmp.do", produces = "application/json; charset=utf-8")
    public String selectEmp(Model model){
        List<emp> emps = empservice.selectEmp();
        model.addAttribute("emps",emps);
        return "index2";
    }
}
