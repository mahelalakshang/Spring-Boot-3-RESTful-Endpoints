package com.mahelacode.todos.service;

import com.mahelacode.todos.request.PasswordUpdateRequest;
import com.mahelacode.todos.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();

    void deleteUser();

    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
