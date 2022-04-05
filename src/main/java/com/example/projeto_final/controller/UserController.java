package com.example.projeto_final.controller;

import com.example.projeto_final.model.User;
import com.example.projeto_final.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(path = "/register")
    public void register(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping(path = "/update/{id}")
    public User update(@RequestBody User user, @PathVariable Integer id){
        User updateUser = userService.getUser(id);

        if(updateUser.getId() == id){
            userService.saveUser(user);
        }
        return updateUser;
    }

    @GetMapping(path = "/readAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);

    }
}


