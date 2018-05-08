package com.base.dubbo.mapper;

import com.base.dubbo.model.BasTest;
import tk.mybatis.mapper.common.Mapper;

public interface BasTestMapper extends Mapper<BasTest> {
    BasTest findById(Integer id);
}