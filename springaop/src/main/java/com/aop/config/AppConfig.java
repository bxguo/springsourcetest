package com.aop.config;

import com.aop.register.MyImportBeandefinationRegister;
import org.springframework.context.annotation.*;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:33
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aop")
@Import(MyImportBeandefinationRegister.class)
public class AppConfig {

    @Bean
    Integer integer(){
        return new Integer(1);
    }
}
