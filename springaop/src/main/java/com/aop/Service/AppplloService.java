package com.aop.Service;

import com.aop.dao.ApolloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: bxguo
 * @time: 2019/11/6 11:52
 */
@Service
public class AppplloService {
    @Autowired
    private ApolloDao apolloDao;

    public List<Map<String,Object>> list(){
        apolloDao.list();
        return apolloDao.list();
    };
}
