package com.openbanking.api.ng.controller.advice;

import com.openbanking.api.ng.definition.ErrorCode;
import com.openbanking.api.ng.payload.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handle(Throwable throwable) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(throwable.getMessage());
        errorResponse.setCode(ErrorCode.SERVER_ERROR.name());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
