package com.huai.stock.domain;

import lombok.Data;

import java.math.BigDecimal;

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

    private String unit;

    private String brand;

    private String origin;

    private BigDecimal count;

    private Double initCount;

    private Double alarmCount;

    private Double alarmTop;

    private String status;

    private String image;

    private String remark;

}