package com.itgaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.itgaoshu.mapper")
@EnableCaching
public class Sp1Application {

    public static void main(String[] args) {

        SpringApplication.run(Sp1Application.class, args);
    }

}
