package com.tc.framework.entity.request.auth;

import lombok.Data;

/**
 *  *
 */
@Data
public class UserLoginReq {
    private String username;

    private String password;
}
