package com.qtt.selectcar.user.entity;

import lombok.Data;

@Data
public class Member {
    private Long id;

    private String username;

    private String password;

    private Byte source;
}