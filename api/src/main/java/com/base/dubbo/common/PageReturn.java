package com.base.dubbo.common;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

public class PageReturn implements Serializable {
    /**
     * 返回结果
     */
    private boolean result;
    /**
     * 编码
     */
    private String messageCode;
    /**
     * 内容
     */
    private String messageText;
    /**
     * 分页信息
     */
    private Paginator paginator;
    /**
     * 数据
     */
    private Object data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Paginator getPaginator() {
        return paginator;
    }

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static PageReturn success(){
        return multiple(true,"200","成功",null,null);
    }
    public static PageReturn success(String messageText){
        return multiple(true,"200",messageText,null,null);
    }
    public static PageReturn success(String messageCode,String messageText){
        return multiple(true,messageCode,messageText,null,null);
    }
    public static PageReturn successData(Object obj){
        return multiple(true,"200","成功",obj,null);
    }
    public static PageReturn fail(){
        return multiple(false,"500","失败",null,null);
    }
    public static PageReturn fail(String messageText){
        return multiple(false,"500",messageText,null,null);
    }
    public static PageReturn fail(String messageCode,String messageText){
        return multiple(false,messageCode,messageText,null,null);
    }
    public  static  PageReturn list(List list){
        return multiple(true,"200","成功",null,list);
    }
    private static PageReturn multiple(Boolean result,String messageCode, String messageText,Object data,List list){
        PageReturn pageReturn=new PageReturn();
        pageReturn.result=result;
        pageReturn.messageCode=messageCode;
        pageReturn.messageText=messageText;
        if(list instanceof  Page){
            pageReturn.paginator=new Paginator((Page)list);
            pageReturn.data=list;
        }else{
            pageReturn.paginator=null;
            pageReturn.data=data;
        }
        return pageReturn;
    }
}
