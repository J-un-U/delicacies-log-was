package com.example.delicacieslogwas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USER_NO")
    private Number userNo;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USER_NM")
    private String userNm;

    @Column(name = "EMAIL")
    private String email;

    /**
     * 기본값 'N'은 DB 레벨에서 적용됩니다.
     * JPA가 DDL을 직접 생성하도록 할 때는 columnDefinition을 통해 명시해줄 수도 있습니다.
     */
    @Column(name = "OUT_YN")
    private String outYn;

    @Column(name = "LAST_LOGIN_DT")
    private LocalDateTime lastLoginDt;

    @Column(name = "LAST_PSWD_CHG_DT")
    private LocalDateTime lastPswdChgDt;

    @Column(name = "ADMIN_YN")
    private String adminYn;

    @Column(name = "AUTH_YN")
    private String authYn;

    /**
     * SYSTIMESTAMP를 기본값으로 사용하고 싶다면
     * DB에서 DEFAULT 제약을 걸어두면 됩니다.
     * (JPA DDL 생성 시에도 columnDefinition을 통해 명시 가능)
     */
    @Column(name = "REG_DT")
    private LocalDateTime regDt;

    @Column(name = "REG_USER_NO")
    private Long regUserNo;

    @Column(name = "EDT_DT")
    private LocalDateTime edtDt;

    @Column(name = "EDT_USER_NO")
    private Long edtUserNo;

    @Column(name = "DEL_DT")
    private LocalDateTime delDt;

    @Column(name = "DEL_YN")
    private String delYn;

}
