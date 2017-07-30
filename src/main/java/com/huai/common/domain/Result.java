package com.huai.common.domain;

import lombok.Data;

/**
 * Created by huai23 on 2017/7/30.
 */
@Data
public class Result {

    Boolean success;

    String msg;

    String data;

    public static Result success(){
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

    public static Result success(String msg){
        Result result = new Result();
        result.setSuccess(true);
        result.setMsg(msg);
        return result;
    }

    public static Result success(String msg,String data){
        Result result = new Result();
        result.setSuccess(true);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setSuccess(false);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String msg,String data){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
