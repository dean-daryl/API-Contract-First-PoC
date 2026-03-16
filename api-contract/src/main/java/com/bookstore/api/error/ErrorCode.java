package com.bookstore.api.error;

public enum ErrorCode {
    BOOK_NOT_FOUND(404, "The requested book could not be found"),
    BOOK_ALREADY_EXISTS(409, "A book with this ISBN already exists"),
    BOOK_INVALID_DATA(400, "Invalid book data provided"),
    BOOK_DELETE_FAILED(500, "Failed to delete the book"),
    BOOK_UPDATE_FAILED(500, "Failed to update the book"),

    AUTHOR_NOT_FOUND(404, "The requested author could not be found"),
    AUTHOR_ALREADY_EXISTS(409, "An author with this name already exists"),
    AUTHOR_INVALID_DATA(400, "Invalid author data provided"),
    AUTHOR_DELETE_FAILED(500, "Failed to delete the author"),
    AUTHOR_UPDATE_FAILED(500, "Failed to update the author"),
    AUTHOR_HAS_BOOKS(409, "Cannot delete author with existing books"),

    INTERNAL_SERVER_ERROR(500, "An unexpected error occurred");

    private final int httpStatus;
    private final String message;

    ErrorCode(int httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}

