package com.miracle.netflix.hyxstrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : sungm
 * @date : 2021-04-07 10:44
 */
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
public class MyHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHystrixDashboardApplication.class, args);
    }

}
