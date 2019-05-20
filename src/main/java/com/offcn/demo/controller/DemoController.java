package com.offcn.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@responsebody @controller
public class DemoController {

    @Value("${url}")
    private String url;


    @Autowired
    private Environment env;


    @RequestMapping("/hello")
    public String hello(String name){
        return  "hello:"+url+":url2gfchgvjhbv789879:"+env.getProperty("url")+":"+name;
    }


}
