package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by 98100 on 2018/9/10.
 */
@Data
public class User {
    private String userName;
    private String userAvatar;

    public User(String userName, String userAvatar) {
        this.userName = userName;
        this.userAvatar = userAvatar;
    }

    public User() {
    }
}