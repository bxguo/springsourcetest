package com.aop.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author: bxguo
 * @time: 2019/11/3 13:23
 */
public interface ApolloDao {
    @Select("SELECT * FROM app")
    public List<Map<String,Object>> list();
}
