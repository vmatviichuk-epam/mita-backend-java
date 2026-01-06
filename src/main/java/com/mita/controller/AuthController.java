package com.mita.controller;

import com.mita.dto.LoginRequest;
import com.mita.dto.LoginResponse;
import com.mita.dto.UserDto;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

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
        
        logger.info("Login successful for user: {}", request.getUsername());
        
        return ResponseEntity.ok(new LoginResponse(mockToken, user));
    }
    
    // TODO: Implement registration endpoint
    // @PostMapping("/register")
    
    // TODO: Implement logout endpoint
    // @PostMapping("/logout")
}
