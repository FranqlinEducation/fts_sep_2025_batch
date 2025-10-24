package com.spring.application.repositry;

import com.spring.application.CartEntity;
import com.spring.application.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {


    @Query(value = "select * from t_user where user_name= :userName",nativeQuery = true)
    UserEntity getUserDetails(String userName);
}
