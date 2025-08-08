package com.example.Spring.demo.service.serviceImpl;


import com.example.Spring.demo.dto.BookDto;
import com.example.Spring.demo.dto.BookRequestDTO;
import com.example.Spring.demo.dto.LessonsDto;
import com.example.Spring.demo.entity.Book;
import com.example.Spring.demo.entity.Lessons;
import com.example.Spring.demo.exceptions.NotFound;
import com.example.Spring.demo.repository.BookRepository;
import com.example.Spring.demo.service.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    @Override
    public BookDto createBook(BookRequestDTO bookDto){
        Book book = modelMapper.map(bookDto, Book.class);
        Book saved= bookRepository.save(book);
        return modelMapper.map(saved, BookDto.class);

    }
    @Override
    public List<BookDto> getAllBooks(){
        List<Book> books= bookRepository.findAll();
        return  books.stream().map(book -> modelMapper.map(book, BookDto.class)).collect(Collectors.toList());
    }
    @Override
    public BookDto getBookById(Long id){
        Book book=bookRepository.findById(id).orElseThrow(() -> new NotFound("Book with Id " +id+" not found"));
        return  modelMapper.map(book, BookDto.class);
    }

    @Override
    public BookDto updateBookById(BookRequestDTO bookDto, Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new NotFound("Book with id "+id+ " not found"));
        modelMapper.map(bookDto,book);
        Book updatedBook= bookRepository.save(book);
        return modelMapper.map(updatedBook,BookDto.class);
    }

    @Override
    public String deleteBook(Long id){
        Book book= bookRepository.findById(id).orElseThrow(() -> new NotFound("Book with id "+id+" is not found"));
        bookRepository.delete(book);
        return "Book deleted";
    }
}
