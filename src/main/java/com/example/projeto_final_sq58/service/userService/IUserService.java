package com.example.projeto_final_sq58.service.userService;

import com.example.projeto_final_sq58.model.Login;
import com.example.projeto_final_sq58.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUser(Integer id);

    public void deleteUser(Integer id);

    public User getUserByEmailAndPassword(Login login);
}
