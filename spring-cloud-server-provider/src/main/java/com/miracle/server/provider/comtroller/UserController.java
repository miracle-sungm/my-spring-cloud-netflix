package com.miracle.server.provider.comtroller;

import com.miracle.api.entity.User;
import com.miracle.server.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-04 20:27
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/getUser")
    public User getUser(Long userId) {
        return userService.getUser(userId);
    }

}
