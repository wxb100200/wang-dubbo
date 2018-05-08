package com.base.dubbo.constant;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 全局性常量
 */
public class Global {
    public static Map<String,String> CONFIG = new ConcurrentHashMap<String,String>();
}
