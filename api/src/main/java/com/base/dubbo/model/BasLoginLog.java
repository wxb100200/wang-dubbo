package com.base.dubbo.model;

import javax.persistence.*;

@Table(name = "bas_login_log")
public class BasLoginLog {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 登陆时间
     */
    @Column(name = "login_time")
    private String loginTime;

    /**
     * 登陆ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登陆状态：0、失败，1、成功
     */
    @Column(name = "login_status")
    private Boolean loginStatus;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取登陆时间
     *
     * @return login_time - 登陆时间
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登陆时间
     *
     * @param loginTime 登陆时间
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登陆ip
     *
     * @return login_ip - 登陆ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登陆ip
     *
     * @param loginIp 登陆ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登陆状态：0、失败，1、成功
     *
     * @return login_status - 登陆状态：0、失败，1、成功
     */
    public Boolean getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置登陆状态：0、失败，1、成功
     *
     * @param loginStatus 登陆状态：0、失败，1、成功
     */
    public void setLoginStatus(Boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}