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
 * BookRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-07T14:42:09.989632+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class BookRequest {

  private String title;

  private @Nullable String isbn;

  private Long authorId;

  private @Nullable Integer publishedYear;

  public BookRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BookRequest(String title, Long authorId) {
    this.title = title;
    this.authorId = authorId;
  }

  public BookRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BookRequest isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
   */
  
  @Schema(name = "isbn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public BookRequest authorId(Long authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
   */
  @NotNull 
  @Schema(name = "authorId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("authorId")
  public Long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }

  public BookRequest publishedYear(Integer publishedYear) {
    this.publishedYear = publishedYear;
    return this;
  }

  /**
   * Get publishedYear
   * @return publishedYear
   */
  
  @Schema(name = "publishedYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishedYear")
  public Integer getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(Integer publishedYear) {
    this.publishedYear = publishedYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookRequest bookRequest = (BookRequest) o;
    return Objects.equals(this.title, bookRequest.title) &&
        Objects.equals(this.isbn, bookRequest.isbn) &&
        Objects.equals(this.authorId, bookRequest.authorId) &&
        Objects.equals(this.publishedYear, bookRequest.publishedYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, isbn, authorId, publishedYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    publishedYear: ").append(toIndentedString(publishedYear)).append("\n");
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

