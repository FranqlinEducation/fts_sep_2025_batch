package com.spring.application.controller;

import com.spring.application.UserEntity;
import com.spring.application.service.LoginService;
import com.spring.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;
    @PostMapping(value = "/user/info")
    public UserEntity getUserInformation(@RequestParam("userName") String userName) throws Exception {
      return userService.getUserInformation(userName);
    }
}
