package com.qtt.selectcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author XC
 */
@EnableSwagger2
@SpringBootApplication
@MapperScan("com.qtt.selectcar.user.dao")
public class SelectCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelectCarApplication.class, args);
    }

}
