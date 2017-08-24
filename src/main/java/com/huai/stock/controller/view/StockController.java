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

    @RequestMapping("/backin")
    String backin() {
        logger.info("StockController.backin");
        return "stock/backin";
    }

    @RequestMapping("/backout")
    String backout() {
        logger.info("StockController.backout");
        return "stock/backout";
    }





}
