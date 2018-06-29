/**
 * 
 * 项目名称：tikie-eureka-config-client
 * 创建日期：2018年6月29日
 * 修改历史：
 * 		1、[2018年6月29日]创建文件 by zhaocs
 */
package com.tikie.eureka.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaocs
 *
 */
@RestController
public class TestValueController {
    @Value("${spring.application.name}")
    private String config;
    
    @RequestMapping("/config")
    public String from() {
        return this.config;
    }
}
