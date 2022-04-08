package org.zy.ones.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.zy.ones.manager.mapper")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
