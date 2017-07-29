package com.huai.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {

        List data = jdbcTemplate.queryForList("select * from td_food ");
        System.out.println("中文");
        logger.info("data = {}",data);
        return "Hello World!"+data;
    }

}
