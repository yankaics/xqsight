package com.xqsight.common.dao;


import com.xqsight.common.orm.Criterion;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, PK extends Serializable> {

    int deleteByPrimaryKey(final PK id);


    int insert(final T t);


    int insertSelective(final T t);


    T selectByPrimaryKey(final PK id);


    int updateByPrimaryKeySelective(final T t);


    int updateByPrimaryKey(final T t);

    /**
     * 根据分页获取数据, rowBounds如果为空，则没有分页
     */
    List<T> find(Criterion criterion);

    /**
     * 计算总记录数
     *
     * @param criterion
     * @return
     */
    long count(Criterion criterion);
}
