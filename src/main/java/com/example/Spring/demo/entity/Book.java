package com.example.Spring.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;

    @OneToMany(targetEntity = Lessons.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Lessons> lessonsList;
}
