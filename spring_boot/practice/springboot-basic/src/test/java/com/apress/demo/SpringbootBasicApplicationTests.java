package com.apress.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes=SpringbootBasicApplication.class)
class SpringbootBasicApplicationTests {
    @Autowired
   private TestLogin testlogin;

    @Test
    public void registrar() {
       System.out.println(testlogin);
    }


}
