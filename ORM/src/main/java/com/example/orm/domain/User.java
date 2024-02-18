package com.example.orm.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long no;

    private String name;

    private String userId;

    private String userPw;
}
