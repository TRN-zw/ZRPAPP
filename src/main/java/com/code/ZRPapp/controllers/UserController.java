package com.code.ZRPapp.controllers;

import com.code.ZRPapp.models.User;
import com.code.ZRPapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    public PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }

    @GetMapping("/addUser")
    public ModelAndView addUser(){
    ModelAndView mv = new ModelAndView("addUsers");
    return mv;
    }

    @GetMapping("/admin")
    public ModelAndView admin(){
        ModelAndView view = new ModelAndView("admin");
        view.addObject("insertUser", new User());
        return view;
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)// @PostMapping("/regForm")
    public ResponseEntity<UserDto> addUser(@ModelAttribute("addUserForm") User user ){
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        User user1 = userService.saveUser(user);
        return ResponseEntity.ok(UserDto.constructUser(user));
    }
    @GetMapping("/allUsers")
    public ModelAndView display() {
        ModelAndView mv = new ModelAndView("viewUsers");
        List<User> userList = userService.getUserList();
        mv.addObject("userList", userList);
        return mv;
    }
}
