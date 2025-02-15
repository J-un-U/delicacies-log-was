package com.example.delicacieslogwas.service;

import com.example.delicacieslogwas.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public void testXML() {
        System.out.println("----------------Database Connect----------------");

        String text = testMapper.testXML();

        // USERS 테이블에 있는 데이터 가져오기
        System.out.println("USER_NM: " + text);
    }
}
