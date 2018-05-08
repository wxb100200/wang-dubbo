package com.base.dubbo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bas_account")
public class BasAccount {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 登陆系统的用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 盐
     */
    private String salt;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号类型：1、普通账号，2、平台账号
     */
    private Integer type;

    /**
     * 账号状态：0、关闭，1、开启
     */
    private Integer status;

    /**
     * 首次次登陆
     */
    @Column(name = "first_login")
    private Boolean firstLogin;

    /**
     * 解锁时间：用户连续登陆失败次数过多，进行锁定
     */
    @Column(name = "unlock_time")
    private Date unlockTime;

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
     * 获取登陆系统的用户名
     *
     * @return user_name - 登陆系统的用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登陆系统的用户名
     *
     * @param userName 登陆系统的用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取账号类型：1、普通账号，2、平台账号
     *
     * @return type - 账号类型：1、普通账号，2、平台账号
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置账号类型：1、普通账号，2、平台账号
     *
     * @param type 账号类型：1、普通账号，2、平台账号
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取账号状态：0、关闭，1、开启
     *
     * @return status - 账号状态：0、关闭，1、开启
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置账号状态：0、关闭，1、开启
     *
     * @param status 账号状态：0、关闭，1、开启
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取首次次登陆
     *
     * @return first_login - 首次次登陆
     */
    public Boolean getFirstLogin() {
        return firstLogin;
    }

    /**
     * 设置首次次登陆
     *
     * @param firstLogin 首次次登陆
     */
    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * 获取解锁时间：用户连续登陆失败次数过多，进行锁定
     *
     * @return unlock_time - 解锁时间：用户连续登陆失败次数过多，进行锁定
     */
    public Date getUnlockTime() {
        return unlockTime;
    }

    /**
     * 设置解锁时间：用户连续登陆失败次数过多，进行锁定
     *
     * @param unlockTime 解锁时间：用户连续登陆失败次数过多，进行锁定
     */
    public void setUnlockTime(Date unlockTime) {
        this.unlockTime = unlockTime;
    }
}