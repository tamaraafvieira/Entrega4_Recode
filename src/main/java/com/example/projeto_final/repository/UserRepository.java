package com.example.projeto_final.repository;

import com.example.projeto_final.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
//     public User getUserByEmailAndPassword(String email, String password);
}
