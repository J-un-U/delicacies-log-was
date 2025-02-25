package com.example.delicacieslogwas.dao;

import com.example.delicacieslogwas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface UserDao {
    // 사용자 정보 조회
    Map<String, Object> getUserById(Map<String, Object> param);

    // 사용자 추가
    int insertUser(User user);
}
