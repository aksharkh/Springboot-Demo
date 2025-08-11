package com.example.Spring.demo.service.service;

import com.example.Spring.demo.dto.BookDto;
import com.example.Spring.demo.dto.BookRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    BookDto createBook(BookRequestDTO bookDto);
    Page<BookDto> getAllBooks(Pageable pageable);
    BookDto getBookById(Long id);
    BookDto updateBookById(BookRequestDTO bookDto, Long id);
    String  deleteBook(Long id);
}
