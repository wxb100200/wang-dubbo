package com.base.dubbo.util;

import org.apache.log4j.Logger;

/**
 * 为了封装Log4j,防止调用是报错！
 */
public class LoggerUtil {

    Logger logger = null;
    String name = null;
    
    protected LoggerUtil(org.apache.log4j.Logger logger, String name){
        this.logger = logger;
        this.name = name;
    }

    public static LoggerUtil getLogger(String name) {
        return new LoggerUtil(org.apache.log4j.Logger.getLogger(name),name);
    }

    public static LoggerUtil getLogger(Class clazz) {
        return new LoggerUtil(org.apache.log4j.Logger.getLogger(clazz), clazz.getName());
    }

    public void debug(Object message) {
        try{
            logger.debug(message);
        }catch(Throwable t){
            
        }
    }
    
    public void info(Object message) {
        try{
            logger.info(message);
        }catch(Throwable t){
            
        }
    }
    
    public void warn(Object message) {
        try{
            logger.warn(message);
        }catch(Throwable t){
            
        }
    }


    public void error(Object message) {
        try{
            logger.error(message);
        }catch(Throwable t){
            
        }
    }    

    public void error(Object message, Throwable t) {
        try{
            logger.error(message, t);
        }catch(Throwable t0){
            
        }
    }
    /**
     * 同时保存到数据库和日志文件
     * @param message
     */
    public void errorToDb(Object message) {
        try{
            logger.error(message);
        }catch(Throwable t){
        }
    }



}