package com.huai.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    String login() {
        logger.info("1122 = {}","haha");
        return "auth/login";
    }

    @PostMapping("/auth")
    @ResponseBody
    Object auth(@RequestBody Map vo) {
        logger.info("  auth   vo = {}",vo);
        Map result = new HashMap();
        result.put("success",true);
        result.put("msg","登录成功");
        result.put("page","/index");
        return result;
    }

    @RequestMapping("/index")
    String index() {
        logger.info(" LoginController index");
        return "index";
    }

}
