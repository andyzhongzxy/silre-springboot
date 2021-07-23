package com.silre;

import com.silre.config.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: andyzhongzxy
 * @Date: create in 2021/7/20 13:21
 */

@Controller
public class controller {

    @Autowired
    private school school;
    @RequestMapping(value = "/hello")
    public @ResponseBody String say(){
        return school.getName();
    }
}
