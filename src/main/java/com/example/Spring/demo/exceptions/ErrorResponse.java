package com.example.Spring.demo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ErrorResponse {

    private String msg;
    private LocalDateTime localDateTime;

}
