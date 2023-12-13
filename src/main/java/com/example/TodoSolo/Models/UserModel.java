package com.example.TodoSolo.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "User")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String userName;
    @Column
    private String userEmail;
    @Column
    private String userPassword;
}
