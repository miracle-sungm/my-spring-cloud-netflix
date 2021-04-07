package com.miracle.netflix.eureka.client.service;

import com.miracle.api.entity.User;
import com.miracle.api.client.UserClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author : sungm
 * @date : 2021-04-06 19:50
 */
@Service
public class UserService implements UserClient {

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return User     用户信息
     */
    @Override
    public User getBy(Long userId) {
        //for test
        return new User(Objects.isNull(userId) ? 0L : userId, "admin");
    }

}
