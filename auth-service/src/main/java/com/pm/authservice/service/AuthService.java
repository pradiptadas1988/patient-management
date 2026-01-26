package com.pm.authservice.service;

import com.pm.authservice.dto.LoginRequestDTO;

import java.util.Optional;

public class AuthService {

    public Optional<String> authenticate(LoginRequestDTO loginRequestDTO) {

        return Optional.of("123");
    }
}
