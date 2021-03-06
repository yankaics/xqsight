<#include "copyright.ftl"/>
package ${basePackage}.${moduleName}.controller;

import com.github.pagehelper.Page;
import com.xqsight.common.model.XqsightPage;
import com.xqsight.common.support.XqsightPageHelper;
import com.xqsight.commons.support.MessageSupport;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import ${basePackage}.${moduleName}.model.${table.className};
import ${basePackage}.${moduleName}.service.${table.className}Service;

/**
 * <p>${table.remarks} controller</p>
 * <p>Table: ${table.tableName} - ${table.remarks}</p>
 * @since ${.now}
 * @author wangganggang
 */
@RestController
@RequestMapping("/${table.controllerPath}/")
public class ${table.className}Controller{

	@Autowired
	private ${table.className}Service ${table.javaProperty}Service;

	@RequestMapping("save")
	@RequiresPermissions("${table.permissions}:save")
	public Object save(${table.className} ${table.javaProperty}) {
		${table.javaProperty}Service.save(${table.javaProperty});
		return MessageSupport.successMsg("保存成功");
	}
	
	@RequestMapping("update")
	@RequiresPermissions("${table.permissions}:update")
	public Object update(${table.className} ${table.javaProperty}) {
		${table.javaProperty}Service.update(${table.javaProperty}, true);
		return MessageSupport.successMsg("修改成功");
	}
	
	@RequestMapping("delete")
	@RequiresPermissions("${table.permissions}:delete")
	public Object delete(<#list table.primaryKeys as key>${key.javaType} ${key.javaProperty}</#list>) {
		${table.javaProperty}Service.delete(<#list table.primaryKeys as key>${key.javaProperty}</#list>);
		return MessageSupport.successMsg("删除成功");
	}

	@RequestMapping("logicDel")
	@RequiresPermissions("${table.permissions}:delete")
	public Object logicDel(<#list table.primaryKeys as key>${key.javaType} ${key.javaProperty}</#list>) {
		${table.javaProperty}Service.logicDel(<#list table.primaryKeys as key>${key.javaProperty}</#list>);
		return MessageSupport.successMsg("删除成功");
	}

	@RequestMapping("query")
	@RequiresPermissions("${table.permissions}:query")
	public Object query(XqsightPage xqsightPage) {
		Page page = XqsightPageHelper.startPageWithPageIndex(xqsightPage.getiDisplayStart(), xqsightPage.getiDisplayLength());
		List<${table.className}> ${table.javaProperty}s = ${table.javaProperty}Service.search(null);
		xqsightPage.setTotalCount(page.getTotal());
		return MessageSupport.successDataTableMsg(xqsightPage, ${table.javaProperty}s);
    }

	@RequestMapping("querybyid")
	@RequiresPermissions("${table.permissions}:query")
	public Object queryById(<#list table.primaryKeys as key>${key.javaType} ${key.javaProperty}</#list>) {
		${table.className} ${table.javaProperty} = ${table.javaProperty}Service.get(<#list table.primaryKeys as key>${key.javaProperty}</#list>);
		return MessageSupport.successDataMsg(${table.javaProperty}, "查询成功");
	}

	@RequestMapping("queryall")
	@RequiresPermissions("${table.permissions}:query")
	public Object queryall() {
		List<${table.className}> ${table.javaProperty}s = ${table.javaProperty}Service.search(null);
		return MessageSupport.successDataMsg(${table.javaProperty}s, "查询成功");
    }

}