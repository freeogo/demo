package com.example.demo.tes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author free-go
 * @Date Created in 11:16 2019/12/6
 **/

@Controller
@RequestMapping("/demo")
public class TestBean {
    @GetMapping("/jsp")
    public String TestDemo(){
        return "sd/hello";
    }
}
