package com.base.dubbo.model;

import javax.persistence.*;

@Table(name = "bas_config_param")
public class BasConfigParam {
    @Id
    private Integer id;

    /**
     * 配置名称
     */
    private String name;

    /**
     * 配置编码
     */
    private String code;

    /**
     * 配置值
     */
    private String value;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取配置名称
     *
     * @return name - 配置名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置配置名称
     *
     * @param name 配置名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取配置编码
     *
     * @return code - 配置编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置配置编码
     *
     * @param code 配置编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取配置值
     *
     * @return value - 配置值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置配置值
     *
     * @param value 配置值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}