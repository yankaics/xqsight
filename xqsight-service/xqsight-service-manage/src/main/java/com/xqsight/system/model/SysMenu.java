/**
 * 新启工作室
 * Copyright (c) 1994-2015 All Rights Reserved.
 */
package com.xqsight.system.model;

import com.xqsight.common.model.Model;

import java.io.Serializable;


/**
 * <p>菜单信息表实体类</p>
 * <p>Table: sys_menu - --> SysMenu</p>
 * <p>菜单信息表</p>
 * @since 2017-01-05 06:10:54
 * @author wangganggang
 */
public class SysMenu extends Model{

	/** 主键 */
    private Long menuId;

    /** parent_id - 父级内码 */
    private Long parentId;
    /** menu_name - 菜单名称 */
    private String menuName;
    /** url - 菜单访问URL */
    private String url;
    /** icon - 图标 */
    private String icon;
    /** type - 类型 0：菜单1：功能 */
    private Integer type;
    /** permission - 允许字符串 */
    private String permission;
    /** sort - 排序 */
    private Integer sort;

    public Long getMenuId(){
        return this.menuId;
    }
    public void setMenuId(Long menuId){
        this.menuId = menuId;
    }
	public Long getParentId(){
        return this.parentId;
    }
    public void setParentId(Long parentId){
        this.parentId = parentId;
    }
	public String getMenuName(){
        return this.menuName;
    }
    public void setMenuName(String menuName){
        this.menuName = menuName;
    }
	public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }
	public String getIcon(){
        return this.icon;
    }
    public void setIcon(String icon){
        this.icon = icon;
    }
	public Integer getType(){
        return this.type;
    }
    public void setType(Integer type){
        this.type = type;
    }
	public String getPermission(){
        return this.permission;
    }
    public void setPermission(String permission){
        this.permission = permission;
    }
	public Integer getSort(){
        return this.sort;
    }
    public void setSort(Integer sort){
        this.sort = sort;
    }

    @Override
    public Serializable getPK() {
        return this.menuId;
    }
}