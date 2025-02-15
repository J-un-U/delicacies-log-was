package com.example.delicacieslogwas.service;

import com.example.delicacieslogwas.dao.UserDao;
import com.example.delicacieslogwas.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //@RequiredArgsConstructor 사용시 @Autowired 이 없어 의존성 주입이 가능하고 생성를 직접 만들지 않아도 됨
public class UserService {

    private final UserDao userMapper;

    public UserDto getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    public boolean createUser(UserDto user) {
        return userMapper.insertUser(user) > 0;
    }
}
