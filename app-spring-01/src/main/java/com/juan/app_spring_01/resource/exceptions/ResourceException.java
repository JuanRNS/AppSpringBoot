package com.juan.app_spring_01.resource.exceptions;


import com.juan.app_spring_01.service.exception.NotFound;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceException{

    @ExceptionHandler(NotFound.class)
    public ResponseEntity<Error> notFound(NotFound e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        Error error = new Error(request.getRequestURI(),status.value(),"Não encontrado",e.getMessage(),System.currentTimeMillis());
        return ResponseEntity.status(status).body(error);
    }

}
