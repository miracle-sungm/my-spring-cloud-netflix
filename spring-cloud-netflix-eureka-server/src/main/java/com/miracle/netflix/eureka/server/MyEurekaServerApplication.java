package com.miracle.netflix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : sungm
 * @date : 2021-04-06 14:16
 */
@EnableEurekaServer
@SpringBootApplication
public class MyEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaServerApplication.class, args);
    }

}
