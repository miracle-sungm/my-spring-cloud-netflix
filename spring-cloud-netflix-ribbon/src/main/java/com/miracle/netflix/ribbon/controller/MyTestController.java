package com.miracle.netflix.ribbon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-06 17:47
 */
@RestController
public class MyTestController {

    /**
     * 通过服务名进行调用
     */
    private static final String NETFLIX_EUREKA_CLIENT_URI = "http://NETFLIX-EURAKE-CLIENT/getServerPort";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/callNetflixEurekaClient")
    public String callNetflixEurekaClient() {
        return restTemplate.getForObject(NETFLIX_EUREKA_CLIENT_URI, String.class);
    }

}
