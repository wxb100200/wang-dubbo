package com.base.dubbo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bas_login")
public class BasLogin {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 登陆时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登陆ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登陆状态
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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取登陆时间
     *
     * @return login_time - 登陆时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登陆时间
     *
     * @param loginTime 登陆时间
     */
    public void setLoginTime(Date loginTime) {
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
     * 获取登陆状态
     *
     * @return login_status - 登陆状态
     */
    public Boolean getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置登陆状态
     *
     * @param loginStatus 登陆状态
     */
    public void setLoginStatus(Boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}