package com.aop.config;

import com.aop.register.CardDaoImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: bxguo
 * @time: 2019/11/5 11:40
 */
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{CardDaoImpl.class.getName()};
    }
}
