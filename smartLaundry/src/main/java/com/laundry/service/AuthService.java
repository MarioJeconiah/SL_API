package com.laundry.service;

import com.laundry.dto.request.LoginRequest;
import com.laundry.dto.request.RegisterRequest;
import com.laundry.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse login(LoginRequest request);
    AuthResponse register(RegisterRequest request);
}
