package com.mita.controller;

import com.mita.dto.LoginRequest;
import com.mita.dto.LoginResponse;
import com.mita.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    /**
     * Login endpoint - returns mock JWT token.
     * 
     * TODO: Implement real authentication with database lookup and JWT generation
     */
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        // Mock response - always returns success for any credentials
        // TODO: Replace with real authentication logic
        
        UserDto user = new UserDto(1L, request.getUsername());
        String mockToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwidXNlcm5hbWUiOiJ0ZXN0dXNlciJ9.MOCK";
        
        return ResponseEntity.ok(new LoginResponse(mockToken, user));
    }
    
    // TODO: Implement registration endpoint
    // @PostMapping("/register")
    
    // TODO: Implement logout endpoint
    // @PostMapping("/logout")
}
