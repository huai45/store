package com.huai.stock.service;

import com.huai.stock.dao.StockRepository;
import com.huai.stock.domain.Stock;
import com.huai.stock.domain.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by huai23 on 2017/8/4.
 */
@Service
public class StockService {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> findStockList(String type) {
        List<Stock> stockList = stockRepository.findStockList(type);
        return stockList;
    }

    public List<Supplier> findSupplierList() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        logger.info(" findSupplierList    user = {} ",request.getSession().getAttribute("user"));

        List<Supplier> supplierList = stockRepository.findSupplierList();
        return supplierList;
    }


    public Stock getStockById(String stockId) {
        Stock stock = stockRepository.getStockById(stockId);
        return stock;
    }
}
