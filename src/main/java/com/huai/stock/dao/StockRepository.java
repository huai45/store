package com.huai.stock.dao;

import com.huai.stock.domain.Stock;
import com.huai.stock.domain.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by huai23 on 2017/8/4.
 */
@Mapper
public interface StockRepository {

    @Select(" select stock_id,stock_name,abbr,type,price,count,unit,category_id,storage_id,supplier_id,brand,origin,alart_count,alarm_top,status,image,remark,created from stock  ")
    List<Stock> findStockList();

    @Select(" select stock_id,stock_name,abbr,type,price,count,unit,category_id,storage_id,supplier_id,brand,origin,alart_count,alarm_top,status,image,remark,created from stock where stock_id = #{stockId} ")
    Stock getStockById(@Param("stockId")String stockId);

    @Select(" select supplier_id , supplier_name , remark from stock_supplier  ")
    List<Supplier> findSupplierList();

    @Update("<script>  update stock  set count = count + #{stock.count} " +
            " <if test=\"stock.price != null\">, price = #{stock.price}</if> " +
            " , modified = now() where stock_id = #{stock.stockId} " +
            "</script> ")
    int updateStockCount(@Param("stock")Stock stock);

}
