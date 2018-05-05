package com.base.dubbo.service;



import java.util.List;

/**
 * Created by fuxx on 15/10/9.
 */

public interface BaseService<T> {

    T selectByKey(Object key);
    
    T selectOne(T entity);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectPage(int pageNum, int pageSize);

    List<T> selectPage(int pageNum, int pageSize, T entity);
    
}