package com.miracle.netflix.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : sungm
 * @date : 2021-04-06 17:36
 */
@EnableEurekaClient
@SpringBootApplication
public class MyRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRibbonApplication.class, args);
    }

}
