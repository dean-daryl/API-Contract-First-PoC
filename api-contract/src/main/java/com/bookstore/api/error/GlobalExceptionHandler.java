package com.bookstore.api.error;

import com.bookstore.api.model.ErrorResponse;
import com.bookstore.api.model.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorResponse> handleApiException(ApiException ex) {
        ErrorResponse response = new ErrorResponse();
        response.setErrorCode(ex.getErrorCode().name());
        response.setStatus(ex.getHttpStatus());
        response.setMessage(ex.getMessage());
        response.setTimestamp(OffsetDateTime.now());

        return new ResponseEntity<>(response, HttpStatus.valueOf(ex.getHttpStatus()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        List<ValidationError> validationErrors = new ArrayList<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            ValidationError validationError = new ValidationError();
            validationError.setField(error.getField());
            validationError.setMessageKey(error.getCode());
            validationError.setMessage(error.getDefaultMessage());
            validationError.setRejectedValue(error.getRejectedValue());
            validationErrors.add(validationError);
        }

        ErrorResponse response = new ErrorResponse();
        response.setErrorCode(ErrorCode.BOOK_INVALID_DATA.name());
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage("Invalid request data provided");
        response.setTimestamp(OffsetDateTime.now());
        response.setValidationErrors(validationErrors);

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGeneralException(Exception ex) {
        ErrorResponse response = new ErrorResponse();
        response.setErrorCode(ErrorCode.INTERNAL_SERVER_ERROR.name());
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(ErrorCode.INTERNAL_SERVER_ERROR.getMessage());
        response.setTimestamp(OffsetDateTime.now());

        ex.printStackTrace();

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

