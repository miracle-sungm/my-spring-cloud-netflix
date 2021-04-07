package com.miracle.netflix.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : sungm
 * @date : 2021-04-06 19:01
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.miracle.api"})
@ComponentScan(basePackages = {"com.miracle.api", "com.miracle.netflix.feign"})
public class MyFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFeignApplication.class, args);
    }

}
