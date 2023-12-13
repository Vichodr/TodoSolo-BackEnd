package com.example.TodoSolo.Services;
import com.example.TodoSolo.Models.ProductModel;
import com.example.TodoSolo.Models.UserModel;
import com.example.TodoSolo.Repository.ProductRepository;
import com.example.TodoSolo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public String AddUser(@RequestBody UserModel userModel){
        userRepository.save(userModel);
        return "Usuario registrado correctamente";
    }
    public List<UserModel> ListUser(){
        return userRepository.findAll();
    }
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public String deleteUserById(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "Usuario eliminado correctamente";
        } else {
            return "Usuario no encontrado";
        }
    }

}
