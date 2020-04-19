package com.kyw.eduproject.controller;

import com.kyw.eduproject.config.WeChatConfig;
import com.kyw.eduproject.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/4/19 20:27
 * @Created by kyw
 */
@RestController
public class TestController {

    @Autowired
    private WeChatConfig WeChatConfig;

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("test_config")
    public String testConfig(){

        System.out.println(WeChatConfig.getAppId());
        return "hello config";
    }

    @RequestMapping("testDB")
    public Object testDB(){
        return videoMapper.findAll();
    }

}
