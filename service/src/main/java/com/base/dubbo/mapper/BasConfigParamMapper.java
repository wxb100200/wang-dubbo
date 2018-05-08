package com.base.dubbo.mapper;

import com.base.dubbo.model.BasConfigParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BasConfigParamMapper extends Mapper<BasConfigParam> {
    /**
     * 查询所有数据
     */
    List<BasConfigParam> findList();
}