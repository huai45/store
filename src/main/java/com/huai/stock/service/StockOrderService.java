package com.huai.stock.service;

import com.huai.common.domain.Result;
import com.huai.stock.dao.StockOrderRepository;
import com.huai.stock.dao.StockRepository;
import com.huai.stock.domain.OrderIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huai23 on 2017/8/5.
 */
@Service
public class StockOrderService {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private StockOrderRepository stockOrderRepository;

    public Result saveIn(List<OrderIn> orderIns) {
        Result result = new Result();


        return result;
    }
}
