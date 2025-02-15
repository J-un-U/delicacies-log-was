package com.example.delicacieslogwas.dto;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class UserDto {
    private String userid;
    private String password;
    private String username;
    private String email;

//    Lombok의 @Data, @Getter 어노테이션 사용시 하단 코드를 축약가능
/*    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }*/
}
