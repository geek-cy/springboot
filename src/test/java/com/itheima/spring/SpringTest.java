package com.itheima.spring;

import com.itheima.springboot.DataSourceDto;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void Test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        DataSourceDto dataSource = applicationContext.getBean("dataSource", DataSourceDto.class);
        System.out.println(dataSource.getDriver());
    }
}
