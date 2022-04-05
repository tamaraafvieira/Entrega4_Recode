package com.example.projeto_final.service.userService;

import com.example.projeto_final.model.User;
import com.example.projeto_final.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

}
