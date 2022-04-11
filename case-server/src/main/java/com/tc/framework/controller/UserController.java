package com.tc.framework.controller;

import com.tc.framework.entity.request.auth.UserLoginReq;
import com.tc.framework.entity.request.auth.UserRegisterReq;
import com.tc.framework.entity.response.controller.Response;
import com.tc.framework.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  *
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    UserService userService;
    /**
     * 用户注册
     * @param req
     * @param request
     * @param response
     * @return
     */
    @PostMapping("/register")
    public Response<?> register(@RequestBody UserRegisterReq req, HttpServletRequest request, HttpServletResponse response) {
        return Response.success(userService.register(req,request,response));
    }

    /**
     * 用户登录
     * @param req
     * @param request
     * @param response
     * @return
     */
    @PostMapping("/login")
    public Response<?> login(@RequestBody UserLoginReq req, HttpServletRequest request, HttpServletResponse response) {
        return Response.success(userService.login(req,request,response));
    }

    @PostMapping("/quit")
    public Response<?> logout(HttpServletRequest request,HttpServletResponse response) {
        return Response.success(userService.logout(request, response));
    }
}
