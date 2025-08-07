package com.example.Spring.demo.controller;


import com.example.Spring.demo.dto.BookDto;
import com.example.Spring.demo.dto.BookRequestDTO;
import com.example.Spring.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookRequestDTO  bookDto){
        BookDto createdBook = bookService.createBook(bookDto);
        return ResponseEntity.ok(createdBook);
    }
    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        List<BookDto> allBooks= bookService.getAllBooks();
        return ResponseEntity.ok(allBooks);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable Long id){
        BookDto book= bookService.getBookById(id);
        return  ResponseEntity.ok(book);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<BookDto> updateBookById(@PathVariable Long id, @RequestBody BookRequestDTO bookDto){
        BookDto book= bookService.updateBookById(bookDto,id);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id){
        String book= bookService.deleteBook(id);
        return ResponseEntity.ok(book);
    }


}
