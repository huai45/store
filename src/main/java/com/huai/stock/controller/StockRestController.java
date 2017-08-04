package com.huai.stock.controller;

import com.huai.common.domain.Result;
import com.huai.stock.domain.Stock;
import com.huai.stock.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stock/api")
public class StockRestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockService stockService;

    @GetMapping("/list")
    Object list() {
        logger.info(" StockRestController list");
        List<Stock> stocks = stockService.findStockList();
        logger.info("stock : {} ",stocks);
        return stocks;
    }

    @PostMapping("/submitIn")
    Object submitIn(@RequestBody Map vo) {
        logger.info("  auth   vo = {}",vo);
        return Result.success("登录成功","/index");
    }



}
