package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(UrlConstant.ADMIN_PREFIX)
public class AdminController {

    // Quản lý User
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        // Xử lý xóa user
        return ResponseEntity.noContent().build();
    }

    // Quản lý Teacher
    @PutMapping("/teachers/{teacherId}")
    public ResponseEntity<Map<String, Object>> updateTeacher(@PathVariable Long teacherId, @RequestBody Map<String, Object> teacherDetails) {
        // Xử lý cập nhật giáo viên
        teacherDetails.put("teacherId", teacherId);
        return ResponseEntity.ok(teacherDetails);
    }

    @DeleteMapping("/teachers/{teacherId}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long teacherId) {
        // Xử lý xóa giáo viên
        return ResponseEntity.noContent().build();
    }

    // Quản lý Course
    @PostMapping("/courses")
    public ResponseEntity<Map<String, String>> addCourse(@RequestBody Map<String, String> courseDetails) {
        // Xử lý thêm khóa học
        return ResponseEntity.status(HttpStatus.CREATED).body(courseDetails);
    }

    @PutMapping("/courses/{courseId}")
    public ResponseEntity<Map<String, String>> updateCourse(@PathVariable Long courseId, @RequestBody Map<String, String> courseDetails) {
        // Xử lý cập nhật khóa học
        courseDetails.put("courseId", courseId.toString());
        return ResponseEntity.ok(courseDetails);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long courseId) {
        // Xử lý xóa khóa học
        return ResponseEntity.noContent().build();
    }
}
