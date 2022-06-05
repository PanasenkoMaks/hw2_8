package com.example.hw2_8.sevice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadParamsException extends RuntimeException{
    public BadParamsException() {

    }
}
