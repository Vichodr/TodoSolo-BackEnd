package com.example.TodoSolo.Repository;

import com.example.TodoSolo.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}
