package com.magee.atcrowdfunding.manager.controller;

import com.magee.atcrowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test() {
        System.out.println("testController");
        testService.insert();
        return "success";
    }
}
