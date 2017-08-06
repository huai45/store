package com.huai.stock.service;

import com.huai.common.domain.Result;
import com.huai.common.util.XUtil;
import com.huai.stock.dao.StockOrderRepository;
import com.huai.stock.dao.StockRepository;
import com.huai.stock.domain.Stock;
import com.huai.stock.domain.StockOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Result saveIn(List<StockOrder> orderIns) {
        Result result = new Result();
        for(StockOrder order : orderIns){
            Stock stock = new Stock();
            stock.setStockId(order.getStockId());
            stock.setPrice(order.getPrice());
            stock.setCount(order.getCount());
            stockRepository.updateStockCount(stock);

            order.setOrderId(XUtil.newId());
            order.setUsable(order.getCount());
            stockOrderRepository.saveOrder(order);
        }
        result.setSuccess(true);
        result.setMsg("提交成功");
        return result;
    }

    public List<StockOrder> getUseableInOrderList(String stockId) {
        List<StockOrder> orders = stockOrderRepository.getUseableInOrderList(stockId);
        return orders;
    }
}
