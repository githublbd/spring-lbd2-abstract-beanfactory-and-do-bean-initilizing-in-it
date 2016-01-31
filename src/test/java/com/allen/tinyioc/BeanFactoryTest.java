package com.allen.tinyioc;

import com.allen.tinyioc.factory.BeanFactory;
import org.junit.Test;
import com.allen.tinyioc.factory.AutowireCapableBeanFactory;

public class BeanFactoryTest {

	@Test
	public void test() {
		// 1.初始化beanfactory
		BeanFactory beanFactory = new AutowireCapableBeanFactory();

		// 2.注入bean
		BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.allen.tinyioc.HelloWorldService");
		beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }
}
