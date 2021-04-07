package com.miracle.server.consumer.controller;

import com.miracle.api.entity.User;
import com.miracle.server.consumer.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-04 21:11
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(Long userId) {
        return userService.getUser(userId);
    }

}
