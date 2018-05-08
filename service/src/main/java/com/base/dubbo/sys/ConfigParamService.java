package com.base.dubbo.sys;

import com.base.dubbo.mapper.BasConfigParamMapper;
import com.base.dubbo.model.BasConfigParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("configParamService")
public class ConfigParamService {
    @Autowired
    BasConfigParamMapper configParamMapper;
    /**
     * 查询所有数据
     */
    public List<BasConfigParam> findList(){
        return configParamMapper.findList();
    }
}
