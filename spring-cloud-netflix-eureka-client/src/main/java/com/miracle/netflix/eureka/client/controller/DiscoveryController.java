package com.miracle.netflix.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : sungm
 * @date : 2021-04-06 15:22
 */
@RestController
public class DiscoveryController {

    @Value("${server.port:8091}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/getAllService")
    public List<String> getAllService() {
        return discoveryClient.getServices();
    }

    @GetMapping(value = "/getServerPort")
    public String getServerPort() {
        return serverPort;
    }

}
