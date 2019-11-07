package com.aop.config;

import com.mysql.jdbc.Driver;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author: bxguo
 * @time: 2019/11/6 11:10
 */
@Configuration
@MapperScan("com.aop.dao")
public class DataConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        dataSource.setUrl("jdbc:mysql://localhost:3306/apolloconfigdb");
        return dataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        //开启sql日志方法一
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        //开启sql日志方法二
        //org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        //config.setLogImpl(Log4jImpl.class);
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean;
    }



}
