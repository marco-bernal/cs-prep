package com.mab.mocks.qualified.example.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException e, WebRequest request) {
        Error errorResponseMessage = generateErrorMessage(e.getLocalizedMessage(), HttpStatus.NOT_FOUND, request);
        return handleExceptionInternal(e, errorResponseMessage, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public final ResponseEntity<Object> handleBadRequestException(RuntimeException e, WebRequest request) {
        Error errorResponseMessage = generateErrorMessage(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST, request);
        return handleExceptionInternal(e, errorResponseMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAll(Exception e, WebRequest request) {
        Error errorResponseMessage = generateErrorMessage(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        return handleExceptionInternal(e, errorResponseMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    private Error generateErrorMessage(String errorMessage, HttpStatus status, WebRequest request) {
        return new Error(
                LocalDateTime.now().toString(),
                String.valueOf(status.value()),
                status.getReasonPhrase(),
                errorMessage,
                ((ServletWebRequest) request).getRequest().getServletPath()
        );
    }
}