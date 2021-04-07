package com.miracle.api.client;

import com.miracle.api.entity.User;
import com.miracle.api.factory.UserHystrixFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : sungm
 * @date : 2021-04-06 19:44
 */
@Component
@FeignClient(name = "NETFLIX-EUREKA-CLIENT", fallbackFactory = UserHystrixFallbackFactory.class)
public interface UserClient {

    /**
     * 获取用户信息
     *
     * @param userId    用户ID
     * @return User     用户信息
     */
    @GetMapping(value = "/user/getBy")
    User getBy(@RequestParam("userId") Long userId);

}
