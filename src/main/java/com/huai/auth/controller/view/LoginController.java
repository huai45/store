package com.huai.auth.controller.view;

import com.huai.common.util.SessionUtil;
import com.huai.common.util.XUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    String login() {
        logger.info("LoginController.login");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getSession().setAttribute("user","huai23"+ XUtil.currentTime());
        SessionUtil.put("user","haha"+ XUtil.currentTime());
        return "auth/login";
    }

    @RequestMapping("/index")
    String index() {
        logger.info(" LoginController index");
        return "index";
    }

}
