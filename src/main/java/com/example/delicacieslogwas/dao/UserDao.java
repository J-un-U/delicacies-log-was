package com.example.delicacieslogwas.dao;

import com.example.delicacieslogwas.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    // 사용자 정보 조회
    UserDto getUserById(@Param("userId") Long userId);

    // 사용자 추가
    int insertUser(UserDto user);
}
