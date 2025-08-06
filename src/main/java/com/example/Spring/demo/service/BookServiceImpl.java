package com.example.Spring.demo.service;


import com.example.Spring.demo.dto.BookDto;
import com.example.Spring.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    @Override
    public BookDto createBook(){

    }
}
