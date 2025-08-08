package com.example.Spring.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private List<LessonsDto> lessonsList;
}
