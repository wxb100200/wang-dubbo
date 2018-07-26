package com.base.dubbo.controller;

import com.base.dubbo.util.EncodeUtils;
import com.base.dubbo.util.HttpUtil;
import com.base.dubbo.util.JsonUtil;
import com.base.dubbo.util.MD5Util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YScredit on 2018/7/24.
 */
public class ZXSearch {

    public static void main(String[] args){
        //100001
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("all",null);
        map.put("key","数据");
        map.put("size",10);
        String strMap= EncodeUtils.urlEncode(JsonUtil.toJson(map));
        System.out.println(strMap);
        String params="uid=qqqq&api=100001&args="+strMap;
        String sign= MD5Util.signature(params+"&key=3d8d4ffdd6472071725a7a9f4d89997e");
        String url="http://10.1.1.30:7887/api/request?"+params+ "&sign="+sign;
        System.out.println(url);
        String result= HttpUtil.URLGet(url,null,"UTF-8");
        System.out.print(result);
    }
}
