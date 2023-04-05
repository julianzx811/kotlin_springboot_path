package com.apress.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicApplication implements CommandLineRunner{
   private final DataSourceConfig dataSourceConfig;
   public SpringbootBasicApplication(DataSourceConfig dataSourceConfig){
        this.dataSourceConfig = dataSourceConfig;
    }  
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception{
		System.err.println(dataSourceConfig);
	}

}
