package com.base.dubbo.tool;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Table;


/**
 * sql自动生成
 * @author
 * @date 2018年4月11日
 */
public class SqlGenerator {
    private static final Logger logger = LoggerFactory.getLogger(SqlGenerator.class);

    public static String generateSql(String className)  {
        try {
            Class<?> clz = Class.forName(className);
            Table tableAnnotation = clz.getAnnotation(Table.class);
            String tableName=tableAnnotation.name();

            StringBuffer sql = new StringBuffer();
            sql.append("\n DROP TABLE IF EXISTS `"+tableName+"`; ")
                    .append(" \n CREATE TABLE `"+tableName+"`  (")
                    .append(" \n    `id` int(10) NOT NULL AUTO_INCREMENT,");

            Field[] fields = clz.getDeclaredFields();
            for(Field field:fields){
                String col_name=field.getName();
                if(col_name.equals("id")){continue;}
                String type=judgeType(field.getType().getTypeName());
                if (field.isAnnotationPresent(Column.class)) {
                    Column declaredAnnotation = field.getDeclaredAnnotation(Column.class);
                    col_name = declaredAnnotation.name();
                }
                sql.append(" \n     `"+col_name+"`"+type +" DEFAULT NULL ,");
            }
//            sql.deleteCharAt(sql.length()-1);
            sql.append(" \n     PRIMARY KEY (`id`)");
            sql.append(" \n ) ENGINE=InnoDB DEFAULT CHARSET=utf8;\n");
            return sql.toString();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    private static String judgeType(Object type){
        if(type.equals("java.lang.Integer")){
            return "integer(10) ";
        }else if(type.equals("java.lang.Boolean")){
            return "tinyint(1)  ";
        }else if(type.equals("java.lang.Date") ){
            return "datetime ";
        }else if(type.equals("java.lang.BigDecimal") ){
            return "decimal(10,2) ";
        }else{
            return "varchar(20) ";
        }

    }
    public static void main(String[] args){
        System.out.println(generateSql("com.base.dubbo.model.BasAccount"));
        System.out.println(generateSql("com.base.dubbo.model.BasConfig"));
        System.out.println(generateSql("com.base.dubbo.model.BasConfigParam"));
        System.out.println(generateSql("com.base.dubbo.model.BasLogin"));
        System.out.println(generateSql("com.base.dubbo.model.BasTest"));
        System.out.println(generateSql("com.base.dubbo.model.BasUser"));
    }

}