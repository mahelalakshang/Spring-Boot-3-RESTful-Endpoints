package com.mahelacode.todos.controller;

import com.mahelacode.todos.entity.User;
import com.mahelacode.todos.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User rest api endpoint", description = "operations required to get user details")
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/info")
    public User getUserInfo(){
        return userService.getUserInfo();
    }
}
