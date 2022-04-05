package com.example.projeto_final.service.userService;

import com.example.projeto_final.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUser(Integer id);

    public void deleteUser(Integer id);

}
