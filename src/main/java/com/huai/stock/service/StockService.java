package com.huai.stock.service;

import com.huai.stock.dao.StockRepository;
import com.huai.stock.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huai23 on 2017/8/4.
 */
@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> findStockList() {
        List<Stock> stockList = stockRepository.findStockList();
        return stockList;
    }
}
