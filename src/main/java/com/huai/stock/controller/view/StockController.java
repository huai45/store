package com.huai.stock.controller.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/in")
    String in() {
        logger.info("StockController.in");
        return "stock/in";
    }

    @RequestMapping("/out")
    String out() {
        logger.info("StockController.out");
        return "stock/out";
    }

    @RequestMapping("/return")
    String returnPage() {
        logger.info("StockController.return");
        return "stock/return";
    }

    @RequestMapping("/back")
    String back() {
        logger.info("StockController.out");
        return "stock/out";
    }





}
