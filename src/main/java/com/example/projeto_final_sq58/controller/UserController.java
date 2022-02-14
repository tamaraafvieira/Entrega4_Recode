package com.example.projeto_final_sq58.controller;

import com.example.projeto_final_sq58.model.Login;
import com.example.projeto_final_sq58.model.User;
import com.example.projeto_final_sq58.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "*")
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

    @PostMapping(path = "/login")
    public User login(@RequestBody Login login){
        return userService.getUserByEmailAndPassword(login);
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


