package com.miracle.server.provider.service;

import com.miracle.api.entity.User;

/**
 * @author : sungm
 * @date : 2021-04-04 19:53
 */
public interface UserService {

    /**
     * 获取用户信息
     *
     * @param userId    用户ID
     * @return User     用户信息
     */
    User getUser(Long userId);

    /**
     * 保存用户信息
     *
     * @param user      用户信息
     * @return Integer  影响的行数
     */
    Integer save(User user);

}
