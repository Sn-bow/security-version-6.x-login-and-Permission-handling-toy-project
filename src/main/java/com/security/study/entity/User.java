package com.security.study.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class User {
    int id;
    String email;
    String password;
    String username;
    String role;
    Timestamp createDate;
}
