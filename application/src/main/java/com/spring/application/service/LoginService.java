package com.spring.application.service;

import com.spring.application.UserEntity;
import com.spring.application.repositry.UserRepository;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
@RequiredArgsConstructor
public class LoginService {


    private final UserRepository userRepository;

    public String login(String userName, String password) throws Exception {

        validateLoginDetails(userName, password);

        return "User details are valid";
    }

    private void validateLoginDetails(String userName, String password) throws Exception {
        //null validate username and password
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            throw new Exception("User Name and Password should not be null or empty");
        }
        //1)validate user name is available or not
        UserEntity userEntity = userRepository.getUserDetails(userName);
        if (userEntity == null || ObjectUtils.isEmpty(userEntity)) {
            throw new Exception("User entered is not available");
        }
        // 2) validate user name with password
        //        a) both user name and password is valid need to show success message and then re-direct to home page
//        b) if user name and password is invalid then we need to throw error
        if (!userName.equals(userEntity.getUser_name()) || !password.equals(userEntity.getUser_password())) {
            throw new Exception("Please enter the valida credentials for user :" + userName);
        }
    }
}
