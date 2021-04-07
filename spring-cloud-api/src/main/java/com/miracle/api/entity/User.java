package com.miracle.api.entity;

import com.miracle.api.base.BaseEntity;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author : sungm
 * @date : 2021-04-04 19:05
 */
@Getter
@Setter
@Accessors
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private Long userId;
    private String userName;

}
