package com.huai.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    @ResponseBody
    Object hello(@ModelAttribute Map report) {
        logger.info(" report = {} ",report);
        List data = jdbcTemplate.queryForList("select * from td_food ");
        System.out.println("中文");
        logger.info("data = {}",data);
        Map result = new HashMap();
        result.put("data","Hello World!"+data);
        return result;
    }

    @PostMapping("/data")
    @ResponseBody
    Object data(@RequestBody Map report) {
        logger.info(" report = {} ",report);
        Map result = new HashMap();
        result.put("data","Hello World!");
        return result;
    }

}
