package com.huai.stock.dao;

import com.huai.stock.domain.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by huai23 on 2017/8/4.
 */
@Mapper
public interface StockRepository {

    @Select(" select stock_id , stock_name , abbr from ts_stock  ")
    List<Stock> findStockList();

}
