package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(UrlConstant.COURSE_PREFIX)
public class RatingController {

    @PostMapping("/{courseId}/ratings")
    public ResponseEntity<Map<String, Object>> rateCourse(@PathVariable Long courseId, @RequestBody Map<String, Object> ratingDetails) {
        // Xử lý đánh giá khóa học
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingDetails);
    }

    @PostMapping("/{courseId}/comments")
    public ResponseEntity<Map<String, Object>> commentCourse(@PathVariable Long courseId, @RequestBody Map<String, Object> commentDetails) {
        // Xử lý nhận xét khóa học
        return ResponseEntity.status(HttpStatus.CREATED).body(commentDetails);
    }
}

