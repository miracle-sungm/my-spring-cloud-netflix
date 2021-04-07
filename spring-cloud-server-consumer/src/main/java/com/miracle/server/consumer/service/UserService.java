package com.miracle.server.consumer.service;

import com.miracle.api.entity.User;

/**
 * @author : sungm
 * @date : 2021-04-04 21:07
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param userId    用户编码
     * @return User     用户信息
     */
    User getUser(Long userId);

}
