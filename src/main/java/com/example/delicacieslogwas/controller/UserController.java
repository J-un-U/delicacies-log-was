package com.example.delicacieslogwas.controller;

import com.example.delicacieslogwas.dto.UserDto;
import com.example.delicacieslogwas.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor //@RequiredArgsConstructor 사용시 @Autowired 이 없어 의존성 주입이 가능하고 생성를 직접 만들지 않아도 됨
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getUser(@PathVariable("id") String id) {
        Map<String, Object> user = new HashMap<String, Object>();
        System.out.println(id.toString());
        try {
            user = userService.getUserById(id);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto user) {
        boolean isSuccess = userService.createUser(user);
        return isSuccess ? ResponseEntity.ok("유저 생성에 성공 하였습니다!") : ResponseEntity.badRequest().body("유저 생성에 실패하였습니다!");
    }
}