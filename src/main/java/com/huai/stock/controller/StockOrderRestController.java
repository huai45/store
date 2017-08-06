package com.huai.stock.controller;

import com.huai.stock.domain.StockOrder;
import com.huai.stock.service.StockOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock/api/order")
public class StockOrderRestController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockOrderService stockOrderService;

    @PostMapping("/saveIn")
    Object saveIn(@RequestBody List<StockOrder> OrderIns) {
        logger.info("  saveIn   OrderIns = {}",OrderIns);
        return stockOrderService.saveIn(OrderIns);
    }



}
