package com.anonimo.Bakend_TaskManager.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends  RuntimeException{
    private  String message;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
