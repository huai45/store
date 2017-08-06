package com.huai.stock.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by huai23 on 2017/8/4.
 */
@Data
public class Stock {

    private String stockId;

    private String stockName;

    private String abbr;

    private String type;

    private BigDecimal price;

    private BigDecimal count;

    private String unit;

    private String categoryId;

    private String storageId;

    private String supplierId;

    private String brand;

    private String origin;

    private Double alarmCount;

    private Double alarmTop;

    private String status;

    private String image;

    private String remark;

    private Date created;

}
