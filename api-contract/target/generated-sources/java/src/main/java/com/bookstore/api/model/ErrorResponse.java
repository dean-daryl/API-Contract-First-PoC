package com.bookstore.api.model;

import java.net.URI;
import java.util.Objects;
import com.bookstore.api.model.ValidationError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class ErrorResponse {

  private Integer status;

  private String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timestamp;

  @Valid
  private List<@Valid ValidationError> validationErrors = new ArrayList<>();

  public ErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorResponse(Integer status, String message) {
    this.status = status;
    this.message = message;
  }

  public ErrorResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "HTTP status code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", description = "Error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * When the error occurred
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", description = "When the error occurred", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorResponse validationErrors(List<@Valid ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ErrorResponse addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Field-level validation errors (present on 400 responses)
   * @return validationErrors
   */
  @Valid 
  @Schema(name = "validationErrors", description = "Field-level validation errors (present on 400 responses)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationErrors")
  public List<@Valid ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<@Valid ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.status, errorResponse.status) &&
        Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.timestamp, errorResponse.timestamp) &&
        Objects.equals(this.validationErrors, errorResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, timestamp, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

