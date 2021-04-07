package com.miracle.api.factory;

import com.miracle.api.client.UserClient;
import com.miracle.api.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Hystrix 服务降级处理
 *
 * @author : sungm
 * @date : 2021-04-06 20:44
 */
@Component
public class UserHystrixFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {
        //UserClient是个函数式接口
        return userId -> new User(-1L, "null");
    }
}
