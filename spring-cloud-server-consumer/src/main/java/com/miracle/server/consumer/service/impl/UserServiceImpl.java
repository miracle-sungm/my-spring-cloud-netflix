package com.miracle.server.consumer.service.impl;

import com.miracle.api.entity.User;
import com.miracle.server.consumer.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : sungm
 * @date : 2021-04-04 21:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "serverProviderRestTemplate")
    private RestTemplate serverProviderRestTemplate;

    /**
     * 获取用户
     *
     * @param userId 用户编码
     * @return User     用户信息
     */
    @Override
    public User getUser(Long userId) {
        return serverProviderRestTemplate.getForObject("http://localhost:8081/user/getUser?userId={userId}", User.class, userId);
    }
}
