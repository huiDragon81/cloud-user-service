package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 50, unique = true)
    String email;

    @Column(nullable = false, length = 50)
    String name;

    @Column(nullable = false, length = 50, unique = true)
    String userId;

    @Column(nullable = false, length = 100, unique = true)
    String encryptedPwd;
}
