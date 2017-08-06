package com.huai.common.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by huai23 on 2017/8/6.
 */
public class XUtil {

    public static DateFormat df_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static DateFormat df_file_time = new SimpleDateFormat("yyyyMMddHHmmss");
    public static DateFormat df_day = new SimpleDateFormat("yyyy-MM-dd");
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static String currentDate(){
        return df_day.format(new Date());
    }

    public static String currentTime(){
        return df_time.format(new Date());
    }

    public static  String newId(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return System.currentTimeMillis()+uuid;
    }
}
