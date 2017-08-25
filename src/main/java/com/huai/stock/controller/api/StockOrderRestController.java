package com.huai.stock.controller.api;

import com.huai.common.domain.Result;
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
    Object saveIn(@RequestBody List<StockOrder> orders) {
        logger.info("  saveIn   orders = {}",orders);
        return stockOrderService.saveIn(orders);
    }

    @PostMapping("/saveOut")
    Object saveOut(@RequestBody List<StockOrder> orders) {
        logger.info("  saveOut   orders = {}",orders);
        try{
            return stockOrderService.saveOut(orders);
        }catch(Exception e){
            Result result = new Result();
            result.setSuccess(false);
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @PostMapping("/saveBackin")
    Object saveBackin(@RequestBody List<StockOrder> orders) {
        logger.info("  saveBackin   orders = {}",orders);
        try{
            return stockOrderService.saveBackin(orders);
        }catch(Exception e){
            Result result = new Result();
            result.setSuccess(false);
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @PostMapping("/saveBackout")
    Object saveBackout(@RequestBody List<StockOrder> orders) {
        logger.info("  saveBackout   orders = {}",orders);
        try{
            return stockOrderService.saveBackout(orders);
        }catch(Exception e){
            Result result = new Result();
            result.setSuccess(false);
            result.setMsg(e.getMessage());
            return result;
        }
    }


}
