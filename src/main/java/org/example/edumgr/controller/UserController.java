package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(UrlConstant.USER_PREFIX)
public class UserController {

    @GetMapping("/{userId}/courses")
    public ResponseEntity<List<String>> getUserCourses(@PathVariable Long userId) {
        // Xử lý lấy danh sách khóa học của user
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Map<String, String>> updateUser(@PathVariable Long userId, @RequestBody Map<String, String> userDetails) {
        // Xử lý cập nhật thông tin user
        userDetails.put("userId", userId.toString());
        return ResponseEntity.ok(userDetails);
    }

    @PutMapping("/{userId}/deactivate")
    public ResponseEntity<Void> deactivateUser(@PathVariable Long userId) {
        // Xử lý soft delete: Thay đổi trạng thái user thành "INACTIVE"
        return ResponseEntity.noContent().build();
    }
}

