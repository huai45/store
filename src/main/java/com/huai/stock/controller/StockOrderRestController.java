package com.huai.stock.controller;

import com.huai.common.domain.Result;
import com.huai.stock.domain.OrderIn;
import com.huai.stock.domain.Stock;
import com.huai.stock.domain.Supplier;
import com.huai.stock.service.StockOrderService;
import com.huai.stock.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stock/api/order")
public class StockOrderRestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockOrderService stockOrderService;

    @PostMapping("/saveIn")
    Object saveIn(@RequestBody List<OrderIn> OrderIns) {
        logger.info("  saveIn   OrderIns = {}",OrderIns);
        return stockOrderService.saveIn(OrderIns);
    }



}
