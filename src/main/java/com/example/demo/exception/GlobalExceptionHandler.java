package com.example.demo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {
//
//    @ExceptionHandler(CustomException.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseEntity<String> handleCustomException(CustomException e, HttpServletRequest request) {
//        ErrorResponse errorResponse = new ErrorResponse(
//                "Internal Server Error",
//                HttpStatus.INTERNAL_SERVER_ERROR.value(),
//                e.getMessage(),
//                request.getRequestURI()
//        );
//        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse.toString());
//    }
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseEntity<String> handleInternalError(Exception e, HttpServletRequest request) {
//        String path = request.getRequestURI();  // Get the request path dynamically
//        ErrorResponse errorResponse = new ErrorResponse(
//                "Internal Server Error",
//                HttpStatus.INTERNAL_SERVER_ERROR.value(),
//                e.getMessage(),
//                path
//        );
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse.toString());
//    }
}
