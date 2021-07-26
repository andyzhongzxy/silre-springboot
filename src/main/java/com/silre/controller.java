package com.silre;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class controller {
    @RequestMapping("/test")
    public String index(){
        return "test";
    }
}