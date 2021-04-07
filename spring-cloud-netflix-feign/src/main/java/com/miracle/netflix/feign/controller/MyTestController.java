package com.miracle.netflix.feign.controller;

import com.miracle.api.entity.User;
import com.miracle.api.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-06 19:02
 */
@RestController
public class MyTestController {

    @Resource
    private UserClient userClient;

    @GetMapping(value = "/testFeign")
    public User testFeign() {
        return userClient.getBy(1L);
    }


}
