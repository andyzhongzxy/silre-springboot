package com.silre.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: andyzhongzxy
 * @Date: create in 2021/7/20 17:00
 * 配置文件读取，自定义配置到对象
 */
@Component//将此类交给spring容器管理
@ConfigurationProperties(prefix = "school")
public class school {

    private String name;

    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

