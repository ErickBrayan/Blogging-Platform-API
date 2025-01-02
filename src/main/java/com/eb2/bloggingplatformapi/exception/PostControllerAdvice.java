package com.eb2.bloggingplatformapi.exception;

import com.eb2.bloggingplatformapi.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class PostControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDTO> handleNotFoundException(NotFoundException e) {
        ErrorDTO errorDTO = new ErrorDTO(e.getCode(), e.getMessage());
        return new ResponseEntity<>(errorDTO, e.getStatus());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorDTO> handleNotFoundException(MethodArgumentTypeMismatchException e) {
        ErrorDTO errorDTO = new ErrorDTO("405",e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDTO> handleRuntimeException(RuntimeException e) {
        ErrorDTO errorDTO = new ErrorDTO("500",e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
