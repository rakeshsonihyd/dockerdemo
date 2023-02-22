package com.login.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;




    private String userName;


    private String password;
}
