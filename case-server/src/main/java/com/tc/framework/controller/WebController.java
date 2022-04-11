package com.tc.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/history/*")
    public String history() {
        return "index";
    }

    @RequestMapping("/caseManager/historyContrast/*/*")
    public String historyContrast() {
        return "index";
    }

    @RequestMapping("/case/caseList/1")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/test/1/*")
    public String requirementId(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/caseManager/1/*/*/*")
    public String tcRecord(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/caseManager/1/*/*")
    public String tcCase(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/api/file/*")
    public String file(HttpServletRequest request) {
        System.out.println("pre request");
        return "index";
    }
}
