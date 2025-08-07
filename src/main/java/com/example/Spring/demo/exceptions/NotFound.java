package com.example.Spring.demo.exceptions;

public class NotFound extends RuntimeException{

    public  NotFound(String msg){
        super(msg);

    }
}
