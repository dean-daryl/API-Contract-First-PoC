package com.bookstore.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class ValidationError {

  private String field;

  private String messageKey;

  private @Nullable String message;

  private @Nullable Object rejectedValue;

  public ValidationError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationError(String field, String messageKey) {
    this.field = field;
    this.messageKey = messageKey;
  }

  public ValidationError field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field that failed validation
   * @return field
   */
  @NotNull 
  @Schema(name = "field", description = "The field that failed validation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ValidationError messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Translation key for the validation message (e.g. Title Required)
   * @return messageKey
   */
  @NotNull 
  @Schema(name = "messageKey", description = "Translation key for the validation message (e.g. Title Required)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageKey")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public ValidationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Default English message (fallback when translation is not available)
   * @return message
   */
  
  @Schema(name = "message", description = "Default English message (fallback when translation is not available)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationError rejectedValue(Object rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * The value that was rejected
   * @return rejectedValue
   */
  
  @Schema(name = "rejectedValue", description = "The value that was rejected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectedValue")
  public Object getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(Object rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.field, validationError.field) &&
        Objects.equals(this.messageKey, validationError.messageKey) &&
        Objects.equals(this.message, validationError.message) &&
        Objects.equals(this.rejectedValue, validationError.rejectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, messageKey, message, rejectedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
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

