package com.miracle.netflix.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author : sungm
 * @date : 2021-04-07 15:40
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyZuulApplication.class, args);
    }

}
