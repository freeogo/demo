package com.example.demo.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspControllerDemo {
    @GetMapping("/jsp")
    String jspTest(Model model) {
        model.addAttribute("name", "my");
        return "index";
    }
}