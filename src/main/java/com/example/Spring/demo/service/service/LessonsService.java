package com.example.Spring.demo.service.service;

import com.example.Spring.demo.dto.LessonsDto;

public interface LessonsService {
        LessonsDto createLesson(LessonsDto lessonDto);
        LessonsDto getLessons(Long id);
}
