package com.huai.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    String login() {
        logger.info("1122 = {}","haha");
        return "index";
    }

}
