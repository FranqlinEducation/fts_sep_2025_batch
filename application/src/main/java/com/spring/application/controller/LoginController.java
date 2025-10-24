package com.spring.application.controller;

import com.spring.application.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {


    private final LoginService loginService;
    @PostMapping(value = "/login")
    public String login(@RequestParam("userName") String userName,@RequestParam("password")  String password) throws Exception {
      return loginService.login(userName,password);
    }
}
