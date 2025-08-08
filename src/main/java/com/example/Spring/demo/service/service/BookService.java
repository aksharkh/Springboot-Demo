package com.example.Spring.demo.service.service;

import com.example.Spring.demo.dto.BookDto;
import com.example.Spring.demo.dto.BookRequestDTO;

import java.util.List;

public interface BookService {
    BookDto createBook(BookRequestDTO bookDto);
    List<BookDto> getAllBooks();
    BookDto getBookById(Long id);
    BookDto updateBookById(BookRequestDTO bookDto, Long id);
    String  deleteBook(Long id);
}
