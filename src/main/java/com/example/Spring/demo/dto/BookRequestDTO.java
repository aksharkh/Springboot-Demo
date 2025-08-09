package com.example.Spring.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class BookRequestDTO {
    @NotBlank(message = "this filed should n't be empty")
    private String title;

    @NotBlank(message = "Author cant be blank")
    private String author;
    private List<LessonsDto> lessonsList;
}
