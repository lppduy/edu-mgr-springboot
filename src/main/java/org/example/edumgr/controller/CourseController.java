package org.example.edumgr.controller;

import org.example.edumgr.constant.UrlConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(UrlConstant.COURSE_PREFIX)
public class CourseController {

    // Bài học
    @PostMapping("/{courseId}/chapters")
    public ResponseEntity<Map<String, String>> addChapter(@PathVariable Long courseId, @RequestBody Map<String, String> chapterDetails) {
        // Xử lý thêm chapter
        chapterDetails.put("courseId", courseId.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(chapterDetails);
    }

    @PutMapping("/chapters/{chapterId}")
    public ResponseEntity<Map<String, String>> updateChapter(@PathVariable Long chapterId, @RequestBody Map<String, String> chapterDetails) {
        // Xử lý cập nhật chapter
        chapterDetails.put("chapterId", chapterId.toString());
        return ResponseEntity.ok(chapterDetails);
    }

    @DeleteMapping("/chapters/{chapterId}")
    public ResponseEntity<Void> deleteChapter(@PathVariable Long chapterId) {
        // Xử lý xóa chapter
        return ResponseEntity.noContent().build();
    }

    // Bắt đầu và kết thúc bài học
    @PostMapping("/lessons/{lessonId}/start")
    public ResponseEntity<Void> startLesson(@PathVariable Long lessonId) {
        // Xử lý bắt đầu bài học
        return ResponseEntity.ok().build();
    }

    @PostMapping("/lessons/{lessonId}/end")
    public ResponseEntity<Void> endLesson(@PathVariable Long lessonId) {
        // Xử lý kết thúc bài học
        return ResponseEntity.ok().build();
    }
}

