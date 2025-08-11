package com.mahelacode.todos.service;

import com.mahelacode.todos.request.AuthenticationRequest;
import com.mahelacode.todos.request.RegisterRequest;
import com.mahelacode.todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
