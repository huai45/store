package com.huai.stock.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by huai23 on 2017/8/5.
 */
@Data
public class OrderIn {

    private String stockId;

    private BigDecimal price;

    private BigDecimal count;

    private BigDecimal total;

    private String supplierId;

    private String status;

    private String staffId;

    private Date buyDate;

    private String auditStaffId;

    private Date auditTime;

    private Date created;

    private String remark;

}
