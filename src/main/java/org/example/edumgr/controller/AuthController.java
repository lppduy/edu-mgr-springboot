package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(UrlConstant.API_PREFIX)
public class AuthController {

    @PostMapping("/admin/login")
    public ResponseEntity<Map<String, String>> adminLogin(@RequestBody Map<String, String> loginRequest) {
        // Xử lý logic đăng nhập admin
        return ResponseEntity.ok(loginRequest);
    }

    @PostMapping("/users/login")
    public ResponseEntity<Map<String, String>> userLogin(@RequestBody Map<String, String> loginRequest) {
        // Xử lý logic đăng nhập user
        return ResponseEntity.ok(loginRequest);
    }

    @PostMapping("/users/register")
    public ResponseEntity<Map<String, String>> registerUser(@RequestBody Map<String, String> registerRequest) {
        // Xử lý logic đăng ký user
        return ResponseEntity.status(HttpStatus.CREATED).body(registerRequest);
    }
}

