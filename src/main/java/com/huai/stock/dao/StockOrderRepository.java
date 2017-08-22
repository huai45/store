package com.huai.stock.dao;

import com.huai.stock.domain.StockOrder;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by huai23 on 2017/8/4.
 */
@Mapper
public interface StockOrderRepository {

    @Insert("<script> insert into  stock_order ( order_id,type,stock_id,price,count,created " +
            " <if test=\"order.gz != null\">,gz</if> " +
            " <if test=\"order.stockName != null\">,stock_name</if> " +
            " <if test=\"order.total != null\">,total</if> " +
            " <if test=\"order.usable != null\">,usable</if> " +
            " <if test=\"order.supplierId != null\">,supplier_id</if> " +
            " <if test=\"order.supplierName != null\">,supplier_name</if> " +
            " <if test=\"order.departId != null\">,depart_id</if> " +
            " <if test=\"order.departName != null\">,depart_name</if> " +
            " <if test=\"order.relationId != null\">,relation_id</if> " +
            " <if test=\"order.operDate != null\">,oper_date</if> " +
            " <if test=\"order.status != null\">,status</if> " +
            " <if test=\"order.staffId != null\">,staff_id</if> " +
            " <if test=\"order.auditStaffId != null\">,audit_staff_id</if> " +
            " <if test=\"order.remark != null\">,remark</if> " +
            " ) values ( #{order.orderId},#{order.type},#{order.stockId},#{order.price},#{order.count},now() " +
            " <if test=\"order.gz != null\">,#{order.gz}</if> " +
            " <if test=\"order.stockName != null\">,#{order.stockName}</if> " +
            " <if test=\"order.total != null\">,#{order.total}</if> " +
            " <if test=\"order.usable != null\">,#{order.usable}</if> " +
            " <if test=\"order.supplierId != null\">,#{order.supplierId}</if> " +
            " <if test=\"order.supplierName != null\">,#{order.supplierName}</if> " +
            " <if test=\"order.departId != null\">,#{order.departId}</if> " +
            " <if test=\"order.departName != null\">,#{order.departName}</if> " +
            " <if test=\"order.relationId != null\">,#{order.relationId}</if> " +
            " <if test=\"order.operDate != null\">,#{order.operDate}</if> " +
            " <if test=\"order.status != null\">,#{order.status}</if> " +
            " <if test=\"order.staffId != null\">,#{order.staffId}</if> " +
            " <if test=\"order.auditStaffId != null\">,#{order.auditStaffId}</if> " +
            " <if test=\"order.remark != null\">,#{order.remark}</if> " +
            " ) </script>")
    int saveOrder(@Param("order") StockOrder order);


    @Select(" select order_id,stock_id,stock_name,price,count,total,usable,oper_date,status " +
            " from stock_order where stock_id = #{stockId} and type = 'in' and status = 1 and usable > 0 ")
    List<StockOrder> getUseableInOrderList(@Param("stockId")String stockId);

    @Select(" select order_id,charge_id,type,gz,stock_id,stock_name,price,count,total,usable," +
            " supplier_id,supplier_name,depart_id,depart_name,relation_id,oper_date,status," +
            " staff_id,audit_staff_id,audit_tag,auditTime,remark,created,modified " +
            " from stock_order where order_id = #{orderId} ")
    StockOrder getOrderById(@Param("orderId") String orderId);

    @Update("<script>  update stock_order  set usable = usable - #{order.count} " +
            " , modified = now() where order_id = #{order.orderId} and  usable >=  #{order.count}  " +
            "</script> ")
    int reduceValidCount(@Param("order") StockOrder order);

    @Update("<script>  update stock_order  set status = #{order.status} " +
            " , modified = now() where order_id = #{order.orderId}  " +
            "</script> ")
    void closeValidStatus(@Param("order") StockOrder order);
}
