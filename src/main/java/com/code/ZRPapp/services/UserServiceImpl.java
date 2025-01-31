package com.code.ZRPapp.services;

import com.code.ZRPapp.models.User;
import com.code.ZRPapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        User user1 = User.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .username(user.getUsername())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
        return userRepository.save(user);
    }

    @Override
    public User getUSer(int id) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
