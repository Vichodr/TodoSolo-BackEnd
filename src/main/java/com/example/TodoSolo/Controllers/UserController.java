package com.example.TodoSolo.Controllers;
import com.example.TodoSolo.Models.UserModel;
import com.example.TodoSolo.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping(value = "/showAllUsers")
    public List<UserModel> getAllUsers(){
        return userService.ListUser();
    }

    @CrossOrigin
    @PostMapping(value = "/addUser")
    public String postOneUser(@RequestBody UserModel userModel){
        return userService.AddUser(userModel);
    }

    @GetMapping(value = "/getUserById/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping(value = "/deleteUserById/{id}")
    public String deleteUserById(@PathVariable Long id) {
        return userService.deleteUserById(id);
    }
}
