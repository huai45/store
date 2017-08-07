package com.huai.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
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
    Object hello() {
        List data = jdbcTemplate.queryForList("select * from td_food ");
        System.out.println("中文");
        logger.info("data = {}",data);
        Map result = new HashMap();
        result.put("data","Hello World!"+data);
        return result;
    }

    @GetMapping("/data")
    @ResponseBody
    Object data(HttpServletRequest request, HttpServletResponse response) {

        logger.info(" username = {} ",request.getParameter("username"));
        logger.info(" password = {} ",request.getParameter("password"));
        logger.info(" category = {} ",request.getParameter("category"));

        List foods = Collections.EMPTY_LIST;
//        List foods = jdbcTemplate.queryForList("select CONCAT(abbr,'__',food_id) as value, food_name label from td_food ");
        logger.info(" foods = {} ",foods.size());

        Map result = new HashMap();
        result.put("data",foods);
        return result;
    }

}
