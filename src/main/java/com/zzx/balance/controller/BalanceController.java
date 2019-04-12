package com.zzx.balance.controller;


import com.zzx.balance.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {


    @GetMapping("/data")
    public UserEntity doData(){

        return null;
    }
}
