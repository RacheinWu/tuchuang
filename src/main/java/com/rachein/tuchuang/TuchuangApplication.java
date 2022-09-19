package com.rachein.tuchuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rachein.tuchuang.core.mapper")
public class TuchuangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuchuangApplication.class, args);
    }

}
