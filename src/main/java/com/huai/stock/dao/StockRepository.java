package com.huai.stock.dao;

import com.huai.stock.domain.Stock;
import com.huai.stock.domain.Supplier;
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

    @Select(" select stock_id , stock_name , abbr , type , price , unit , brand , origin , count , state from ts_stock where stock_id = #{stockId} ")
    Stock getStockById(@Param("stockId")String stockId);

    @Select(" select supplier_id , supplier_name , remark from ts_supplier  ")
    List<Supplier> findSupplierList();


}
