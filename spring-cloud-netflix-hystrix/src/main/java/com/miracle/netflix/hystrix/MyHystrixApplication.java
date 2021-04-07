package com.miracle.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 开启断路器配置 : EnableCircuitBreaker
 *
 * @author : sungm
 * @date : 2021-04-06 20:22
 */
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients(basePackages = {"com.miracle.api"})
@ComponentScan(basePackages = {"com.miracle.api", "com.miracle.netflix.hystrix"})
public class MyHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHystrixApplication.class, args);
    }

}
