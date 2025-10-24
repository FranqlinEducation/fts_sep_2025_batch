package com.spring.application.service;

import com.spring.application.UserEntity;
import com.spring.application.repositry.UserRepository;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;



    public UserEntity getUserInformation(String userName) {
        return userRepository.getUserDetails(userName);
    }
}
