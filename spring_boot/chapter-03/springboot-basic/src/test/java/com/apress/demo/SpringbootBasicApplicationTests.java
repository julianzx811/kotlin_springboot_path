package com.apress.demo;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = SpringbootBasicApplication.class)
class SpringbootBasicApplicationTests {

    @Autowired
    private DataSourceConfig dataSourceConfig;
    
    @Test
    public void primertesteo(){
        System.out.println(dataSourceConfig);
    }

}
