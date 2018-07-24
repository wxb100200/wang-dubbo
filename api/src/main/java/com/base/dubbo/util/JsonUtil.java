package com.base.dubbo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright 2015-2019 Yunfucloud technology co., Ltd.
 * Created by fuxx on 15/11/16.
 */
public class JsonUtil {
    public static String toJson(Object value){
        ObjectMapper mapper = new ObjectMapper();
        String json="";
        try {
           json= mapper.writeValueAsString(value);
        }catch (Exception e){

        }
        return json;
    }

    //将json 对象转为Map
    public static Map json2Map(String jsondata){

        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<String,Object>();

        try {
            map=mapper.readValue(jsondata, HashMap.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    //将json对象转为指定对象类型
    public static <T> T json2Object(String jsondata,Class<T> tClass){

        ObjectMapper mapper = new ObjectMapper();
        //Map<String,Object> map = new HashMap<>();
        T o=null;
        try {
            o = mapper.readValue(jsondata, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return o;
    }



}
