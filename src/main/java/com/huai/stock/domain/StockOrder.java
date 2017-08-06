package com.huai.stock.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by huai23 on 2017/8/5.
 */
@Data
public class StockOrder {

    private String orderId;

    private String type;

    private String gz;

    private String stockId;

    private String stockName;

    private BigDecimal price;

    private BigDecimal count;

    private BigDecimal total;

    private BigDecimal usable;

    private Integer status;

    private String supplierId;

    private String supplierName;

    private String departId;

    private String departName;

    private String relationId;

    private Date operDate;

    private String staffId;

    private String auditStaffId;

    private Integer auditTag;

    private Date auditTime;

    private Date created;

    private String remark;

}
