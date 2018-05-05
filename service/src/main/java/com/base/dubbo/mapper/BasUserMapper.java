package com.base.dubbo.mapper;

import com.base.dubbo.model.BasUser;
import tk.mybatis.mapper.common.Mapper;

public interface BasUserMapper extends Mapper<BasUser> {
    BasUser findById(Integer id);
}