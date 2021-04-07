package com.miracle.server.provider.repository;

import com.miracle.api.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @author : sungm
 * @date : 2021-04-04 19:54
 */
@Mapper
public interface UserRepository {

    /**
     * 获取用户信息
     *
     * @param userId    用户ID
     * @return User     用户信息
     */
    @Select("select * from db_user where user_id = #{userId}")
    User getUser(@Param(value = "userId") Long userId);

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return Integer  影响的行数
     */
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    @Insert("insert into db_user(user_name, created_by, last_modified_by, enabled, remarks) " +
            "values (#{user.userName}, #{user.createdBy}, #{user.lastModifiedBy}, #{user.enabled}, #{remarks})")
    Integer save(@Param(value = "user")User user);
}
