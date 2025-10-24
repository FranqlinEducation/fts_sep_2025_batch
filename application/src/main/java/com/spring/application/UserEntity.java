package com.spring.application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name="t_users")
@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    private Integer user_id;
    private String user_name;
    private String user_password;
    private Integer user_phn_number;
    private String user_address;

    private String user_information;
}
