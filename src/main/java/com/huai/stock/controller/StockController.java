package com.huai.stock.controller;

import com.huai.common.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/stock")
public class StockController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/in")
    String in() {
        logger.info("LoginController.login");
        return "stock/in";
    }



}
