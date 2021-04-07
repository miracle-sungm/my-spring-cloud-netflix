package com.miracle.server.provider.service.impl;

import com.miracle.api.entity.User;
import org.springframework.stereotype.Service;
import com.miracle.server.provider.repository.UserRepository;
import com.miracle.server.provider.service.UserService;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author : sungm
 * @date : 2021-04-04 19:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return User     用户信息
     */
    @Override
    public User getUser(Long userId) {
        if (Objects.isNull(userId) || userId <= 0) {
            return null;
        }
        return userRepository.getUser(userId);
    }

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return Integer  影响的行数
     */
    @Override
    public Integer save(User user) {
        return userRepository.save(user);
    }
}
