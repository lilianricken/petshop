package com.wipro.petshop.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;
import java.util.stream.Collectors;

public class ErrorMessage {
    private Integer code;
    private String message;
    private String detail;
    private List<String> details;

    public ErrorMessage(Integer code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    public ErrorMessage(MethodArgumentNotValidException exception) {
        code = 400;
        message = "Invalid request";
        details = exception.getBindingResult().getFieldErrors()
                .stream()
                .map(e -> e.getField() + ": " + e.getDefaultMessage())
                .collect(Collectors.toList());
    }

}