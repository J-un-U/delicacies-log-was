package com.example.delicacieslogwas.service;
import com.example.delicacieslogwas.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface UserService {

    Map<String, Object> getUserById(String userId);

    boolean createUser(UserDto userDto);

}
