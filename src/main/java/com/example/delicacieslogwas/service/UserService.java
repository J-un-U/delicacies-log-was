package com.example.delicacieslogwas.service;

import com.example.delicacieslogwas.dao.UserDao;
import com.example.delicacieslogwas.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor //@RequiredArgsConstructor 사용시 @Autowired 이 없어 의존성 주입이 가능하고 생성를 직접 만들지 않아도 됨
public class UserService {

    private final UserDao userMapper;

    public Map<String, Object> getUserById(String userId) {
        Map<String, Object> param = new HashMap<>();
        param.put("userId", String.valueOf(userId));

        //Map<String, Object> result = userMapper.getUserById(param);

        return userMapper.getUserById(param);
    }

    public boolean createUser(UserDto user) {
        return userMapper.insertUser(user) > 0;
    }
}
