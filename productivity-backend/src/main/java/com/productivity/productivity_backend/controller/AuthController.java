package com.productivity.productivity_backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productivity.productivity_backend.dto.LoginRequest;
import com.productivity.productivity_backend.dto.LoginResponse;
import com.productivity.productivity_backend.models.User;
import com.productivity.productivity_backend.repository.UserRepository;
import com.productivity.productivity_backend.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        System.out.println("Login attempt for email: " + request.getEmail());
        Optional<User> optionalUser = userRepo.findByEmail(request.getEmail());

        if (optionalUser.isEmpty()) {
            return ResponseEntity.status(401).body("User not found");
        }

        User user = optionalUser.get();

        if (!user.getPassword().equals(request.getPassword())) {
            return ResponseEntity.status(401).body("Invalid password");
        }
        System.out.println(user.getEmail());
        String token = jwtUtil.generateToken(request.getEmail());
        System.out.println(token);
        return ResponseEntity.ok(new LoginResponse(token));
        
    }

}
