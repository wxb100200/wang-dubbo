package com.base.dubbo.model;

import javax.persistence.*;

@Table(name = "bas_user")
public class BasUser {
    @Id
    private Integer id;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 身份证号
     */
    @Column(name = "identity_card")
    private String identityCard;

    /**
     * 性别：1、男，2、女
     */
    private Integer sex;

    /**
     * 籍贯
     */
    @Column(name = "native_place")
    private String nativePlace;

    /**
     * 学历
     */
    private String education;

    /**
     * 婚姻
     */
    private String marriage;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户类型
     */
    private Integer type;

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
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取身份证号
     *
     * @return identity_card - 身份证号
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * 设置身份证号
     *
     * @param identityCard 身份证号
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    /**
     * 获取性别：1、男，2、女
     *
     * @return sex - 性别：1、男，2、女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别：1、男，2、女
     *
     * @param sex 性别：1、男，2、女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取籍贯
     *
     * @return native_place - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取学历
     *
     * @return education - 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置学历
     *
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取婚姻
     *
     * @return marriage - 婚姻
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置婚姻
     *
     * @param marriage 婚姻
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取用户类型
     *
     * @return type - 用户类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型
     *
     * @param type 用户类型
     */
    public void setType(Integer type) {
        this.type = type;
    }
}