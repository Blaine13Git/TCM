package com.tc.framework.service;

import com.tc.framework.entity.request.auth.UserLoginReq;
import com.tc.framework.entity.request.auth.UserRegisterReq;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *  *
 */
public interface UserService {
    Integer register(UserRegisterReq req, HttpServletRequest request, HttpServletResponse response);
    Integer login(UserLoginReq req, HttpServletRequest request, HttpServletResponse response);
    Integer logout(HttpServletRequest request, HttpServletResponse response);

    /**
     * 获取用户对应权限的路径匹配列表
     *
     * @param username 用户名称
     * @return 对应权限的路径匹配列表
     */
    List<String> getUserAuthorityContent(String username);
}
