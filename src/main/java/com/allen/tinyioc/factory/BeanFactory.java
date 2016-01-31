package com.allen.tinyioc.factory;

import com.allen.tinyioc.BeanDefinition;

public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
