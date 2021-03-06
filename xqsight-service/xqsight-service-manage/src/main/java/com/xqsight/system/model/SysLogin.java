/**
 * 新启工作室
 * Copyright (c) 1994-2015 All Rights Reserved.
 */
package com.xqsight.system.model;

import com.xqsight.common.model.Model;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * <p>用户登陆表实体类</p>
 * <p>Table: sys_login - --> SysLogin</p>
 * <p>用户登陆表</p>
 * @since 2017-01-05 06:10:49
 * @author wangganggang
 */
public class SysLogin extends Model{

	/** 主键 */
    private Long id;

    /** org_id - 组织机构 */
    private Long orgId;
    /** login_id - 登陆名称 */
    private String loginId;
    /** user_name - 昵称 */
    private String userName;
    /** real_name - 真实姓名 */
    private String realName;
    /** password - 登陆密码 */
    private String password;
    /** login_type - 登陆类型 1:编号 2:邮箱 3:电话 */
    private Integer loginType;
    /** sex - 性别 0:未知 1:男 2:女 */
    private Integer sex;
    /** user_born - 生日 */
    private LocalDate userBorn;
    /** age - 年龄 */
    private Integer age;
    /** from_source - 来源 WECHAT  PC  MOBILE */
    private String fromSource;
    /** img_url - 图片地址 */
    private String imgUrl;
    /** salt - 随机数 */
    private String salt;
    /** locked - 是否锁定 0-未锁定 -1-锁定 */
    private Integer locked;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
	public Long getOrgId(){
        return this.orgId;
    }
    public void setOrgId(Long orgId){
        this.orgId = orgId;
    }
	public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
	public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
	public String getRealName(){
        return this.realName;
    }
    public void setRealName(String realName){
        this.realName = realName;
    }
	public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
	public Integer getLoginType(){
        return this.loginType;
    }
    public void setLoginType(Integer loginType){
        this.loginType = loginType;
    }
	public Integer getSex(){
        return this.sex;
    }
    public void setSex(Integer sex){
        this.sex = sex;
    }
	public LocalDate getUserBorn(){
        return this.userBorn;
    }
    public void setUserBorn(LocalDate userBorn){
        this.userBorn = userBorn;
    }
	public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
	public String getFromSource(){
        return this.fromSource;
    }
    public void setFromSource(String fromSource){
        this.fromSource = fromSource;
    }
	public String getImgUrl(){
        return this.imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }
	public String getSalt(){
        return this.salt;
    }
    public void setSalt(String salt){
        this.salt = salt;
    }
	public Integer getLocked(){
        return this.locked;
    }
    public void setLocked(Integer locked){
        this.locked = locked;
    }

    @Override
    public Serializable getPK() {
        return this.id;
    }
}