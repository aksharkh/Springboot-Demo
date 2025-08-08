package com.example.Spring.demo.controller;

import com.example.Spring.demo.dto.LessonsDto;
import com.example.Spring.demo.service.service.LessonsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons")
@RequiredArgsConstructor
public class LessonsController {
    public  final LessonsService lessonsService;

    @PostMapping
    public ResponseEntity<LessonsDto> createLesson(@RequestBody LessonsDto lesson){
        LessonsDto createdLesson= lessonsService.createLesson(lesson);
        return ResponseEntity.ok(createdLesson);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LessonsDto> getLessons(@PathVariable Long id){
        LessonsDto lessons= lessonsService.getLessons(id);
        return  ResponseEntity.ok(lessons);
    }
}
