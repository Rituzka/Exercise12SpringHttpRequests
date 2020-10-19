package com.itAcademy.springrequests.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    //constructor #1 with a message
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
