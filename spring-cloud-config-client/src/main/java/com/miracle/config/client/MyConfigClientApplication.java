package com.miracle.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : sungm
 * @date : 2021-04-07 17:39
 */
@EnableEurekaClient
@SpringBootApplication
public class MyConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyConfigClientApplication.class, args);
    }

}
