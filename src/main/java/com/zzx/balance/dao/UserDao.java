package com.zzx.balance.dao;

import com.zzx.balance.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("Select * from user")
    List<UserEntity> user();
}
