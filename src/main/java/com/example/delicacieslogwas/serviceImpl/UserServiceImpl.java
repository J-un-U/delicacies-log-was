package com.example.delicacieslogwas.serviceImpl;

import com.example.delicacieslogwas.entity.User;
import com.example.delicacieslogwas.dao.UserDao;
import com.example.delicacieslogwas.dto.UserDto;
import com.example.delicacieslogwas.service.UserService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userMapper;

    public Map<String, Object> getUserById(String userId) {
        Map<String, Object> param = new HashMap<>();
        param.put("userId", String.valueOf(userId));

        //Map<String, Object> result = userMapper.getUserById(param);

        return userMapper.getUserById(param);
    }

//    public boolean createUser(UserDto user) {
//        return userMapper.insertUser(user) > 0;
//    }

    @Override
    public boolean createUser(UserDto userDto) {

        // DTO -> Domain 변환
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setUserNm(userDto.getUserNm());
        user.setEmail(userDto.getEmail());

        // DB 저장
        userMapper.insertUser(user);

        return true;
    }
}
