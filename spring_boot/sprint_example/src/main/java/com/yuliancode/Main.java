package com.yuliancode;

import java.awt.*;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @EnableAutoConfiguration
// @ComponentScan(basePackages = "com.yuliancode")
// @Configuration
@RestController
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @GetMapping("/greet")
  public yulian ElYulian(){
    yulian theyulian = new yulian("yuli",List.of("arch","ubuntu"),new Pc("thinkpad"));
    return theyulian;
  }
  record Pc(String nombrePC){}
  record yulian(String nombre,List<String> distribuciones,Pc compu){}
}
