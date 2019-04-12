package com.zzx.balance.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserEntity {

    private String id;
    private String name;
    private String password;
    private String createdBy;

}
