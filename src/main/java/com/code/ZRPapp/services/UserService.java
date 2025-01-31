package com.code.ZRPapp.services;

import com.code.ZRPapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> getUserList();
    User saveUser(User user);
    User getUSer(int id);
    void deleteUser(int id);
}
