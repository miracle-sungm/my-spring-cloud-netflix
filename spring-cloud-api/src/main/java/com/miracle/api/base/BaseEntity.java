package com.miracle.api.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author : sungm
 * @date : 2021-04-04 19:41
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -5477000708911027360L;

    private Long createdBy;
    private LocalDateTime createdTime;
    private Long lastModifiedBy;
    private LocalDateTime lastModifiedTime;
    private Boolean enabled;
    private String remarks;

}
