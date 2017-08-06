package com.huai.stock.dao;

import com.huai.stock.domain.StockOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by huai23 on 2017/8/4.
 */
@Mapper
public interface StockOrderRepository {

    @Insert("")
    int saveOrder(StockOrder order);



}
