package io.unicorn.qb.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/17/17.
 */
@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    ResponseEntity<ErrorVO> productNotFoundAdvice(ProductNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorVO.builder().message(e.getMessage()).build());
    }
}
