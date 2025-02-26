package com.example.delicacieslogwas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserDto {

    @NotBlank(message = "아이디는 필수 항목입니다.")
    private String userId;

    @NotBlank(message = "비밀번호는 필수 항목입니다.")
    private String password;

    @NotBlank(message = "이름은 필수 항목입니다.")
    private String userNm;

    @Email(message = "올바른 이메일 형식을 입력해주세요.")
    private String email;


    @Builder
    public UserDto(String userId, String password, String userNm, String email) {
        this.userId = userId;
        this.password = password;
        this.userNm = userNm;
        this.email = email;
    }

//    Lombok @Data, @Getter 어노테이션 사용시 하단 코드를 축약가능
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
