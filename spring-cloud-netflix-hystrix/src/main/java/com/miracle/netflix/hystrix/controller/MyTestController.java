package com.miracle.netflix.hystrix.controller;

import com.miracle.api.client.UserClient;
import com.miracle.api.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author : sungm
 * @date : 2021-04-06 20:23
 */
@RestController
public class MyTestController {

    @Resource
    private UserClient userClient;

    /**
     * test方法在一定时间内调用失败将触发服务熔断，这里设置了调用备用方法hystrixTest
     *
     * @param id        param
     * @return String   result
     */
    @GetMapping(value = "/test")
    @HystrixCommand(fallbackMethod = "hystrixTest")
    public String test(Long id) {
        if (Objects.isNull(id) || id < 1) {
            throw new RuntimeException("ID无效");
        }
        return String.valueOf(id);
    }

    public String hystrixTest(Long id) {
        return "-1";
    }

    @GetMapping(value = "/getUserByUserId")
    public User getUser(Long userId) {
        return userClient.getBy(userId);
    }

}
