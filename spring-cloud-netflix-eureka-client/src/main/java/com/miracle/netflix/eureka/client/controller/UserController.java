package com.miracle.netflix.eureka.client.controller;

import com.miracle.api.entity.User;
import com.miracle.netflix.eureka.client.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-06 19:50
 */
@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/user/getBy")
    public User getBy(Long userId) {
        return userService.getBy(userId);
    }

}
