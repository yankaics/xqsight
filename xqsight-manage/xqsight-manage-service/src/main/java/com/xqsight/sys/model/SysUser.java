package com.xqsight.sys.model;/******************************************************************************* * javaBeans * SYS_USER --> SysUser  * <table explanation> * @author 2015-12-30 10:11:31 *  */	public class SysUser extends SysLogin implements java.io.Serializable {	/**	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）	 */	private static final long serialVersionUID = -5812459021004720459L;	//field	/** 用户编号 **/	private String userCode;	/** 用户名称 **/	private String userName;	/** 电话 **/	private String cellPhone;	/** 邮箱 **/	private String email;	/** Qq **/	private String qq;	/** 微信 **/	private String wecaht;	/** 兴趣 **/	private String interest;	/** 国家 **/	private int country;	/** 省份 **/	private int province;	/** 县 **/	private int city;	/** 详细地址 **/	private String adress;	/** 支付宝 **/	private String alipay;	public String getUserCode() {		return userCode;	}	public void setUserCode(String userCode) {		this.userCode = userCode;	}	public String getUserName() {		return userName;	}	public void setUserName(String userName) {		this.userName = userName;	}	public String getCellPhone() {		return cellPhone;	}	public void setCellPhone(String cellPhone) {		this.cellPhone = cellPhone;	}	public String getEmail() {		return email;	}	public void setEmail(String email) {		this.email = email;	}	public String getQq() {		return qq;	}	public void setQq(String qq) {		this.qq = qq;	}	public String getWecaht() {		return wecaht;	}	public void setWecaht(String wecaht) {		this.wecaht = wecaht;	}	public String getInterest() {		return interest;	}	public void setInterest(String interest) {		this.interest = interest;	}	public int getCountry() {		return country;	}	public void setCountry(int country) {		this.country = country;	}	public int getProvince() {		return province;	}	public void setProvince(int province) {		this.province = province;	}	public int getCity() {		return city;	}	public void setCity(int city) {		this.city = city;	}	public String getAdress() {		return adress;	}	public void setAdress(String adress) {		this.adress = adress;	}	public String getAlipay() {		return alipay;	}	public void setAlipay(String alipay) {		this.alipay = alipay;	}	}