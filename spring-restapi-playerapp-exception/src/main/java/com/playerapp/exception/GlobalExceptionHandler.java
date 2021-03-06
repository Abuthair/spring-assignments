package com.playerapp.exception;


import com.playerapp.model.ApiErrors;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        headers.add("desc","Method not allowed");
        String error= ex.getMessage();
        List<String> messages=Arrays.asList(error,"Method not supported");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),status,status.value(),error,messages);
        return ResponseEntity.status(status).headers(headers).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        headers.add("desc","Media Type Not Supported");
        String error= ex.getMessage();
        List<String> messages=Arrays.asList(error,"invalid Media Type");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),status,status.value(),error,messages);
        return ResponseEntity.status(status).headers(headers).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
       headers.add("desc"," pathvariable is missing");
       String error = ex.getMessage();
       List<String> messages= Arrays.asList(error,"Missing Pathvariable");
       ApiErrors errors = new ApiErrors(LocalDateTime.now(),status,status.value(),error,messages);
       return  ResponseEntity.status(status).headers(headers).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        headers.add("desc","req param is missing");
        String error = ex.getMessage();
        List<String> messages= Arrays.asList(error,"invalid request param");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),status,status.value(),error,messages);
        return  ResponseEntity.status(status).headers(headers).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        headers.add("desc","Invalid dataType");
        String error = ex.getMessage();
        List<String> messages= Arrays.asList(error,"Invalid data type");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),status, status.value(), error,messages);
        return  ResponseEntity.status(status).headers(headers).body(errors);
    }
    @ExceptionHandler(PlayerNotFoundException.class)
    public  ResponseEntity<Object> handleFurnNotFound(Exception ex){
        HttpHeaders  headers = new HttpHeaders();
        headers.add("desc","PlayerNotFoundException");
        String error = ex.getMessage();
        List<String> messages= Arrays.asList(error,"player not Available");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(), error,messages);
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(errors);
    }
    @ExceptionHandler(Exception.class)
    public  ResponseEntity<Object> handleOther(Exception ex){
        HttpHeaders  headers = new HttpHeaders();
        headers.add("desc","Other Exception");
        String error = ex.getMessage();
        List<String> messages= Arrays.asList(error,"Other type of exception");
        ApiErrors errors = new ApiErrors(LocalDateTime.now(),HttpStatus.NOT_ACCEPTABLE,HttpStatus.NOT_ACCEPTABLE.value(),error,messages);
        return  ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).headers(headers).body(errors);
    }
}
