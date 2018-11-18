package ng.openbanking.api.controller.advice;


import ng.openbanking.api.payload.ErrorResponse;
import ng.openbanking.api.payload.definition.ErrorCode;
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
