package com.example.gateway.service;

import com.example.gateway.bean.auth.User;

public interface ILoginService {
    String login(String username, String password);

    User saveUser(User user);

    boolean logout(String token);

    Boolean isValidToken(String token);

    String createNewToken(String token);
}
