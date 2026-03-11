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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class BookRequest {

  @jakarta.validation.constraints.NotBlank(message = "{Title Required}")
  private String title;

  @jakarta.validation.constraints.Pattern(regexp = "^(97[89])-\\d{1,5}-\\d{1,7}-\\d{1,7}-\\d$", message = "{validation.book.isbn.invalid}")
  private @Nullable String isbn;

  @jakarta.validation.constraints.NotNull(message = "{validation.book.authorId.required}") @jakarta.validation.constraints.Min(value = 1, message = "{validation.book.authorId.min}")
  private Long authorId;

  @jakarta.validation.constraints.Min(value = 1000, message = "{validation.book.publishedYear.min}") @jakarta.validation.constraints.Max(value = 2100, message = "{validation.book.publishedYear.max}")
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
   * Title of the book
   * @return title
   */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "title", description = "Title of the book", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * ISBN-13 of the book
   * @return isbn
   */
  @Pattern(regexp = "^(97[89])-\\\\d{1,5}-\\\\d{1,7}-\\\\d{1,7}-\\\\d$") @Size(max = 17) 
  @Schema(name = "isbn", description = "ISBN-13 of the book", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
   * ID of the author
   * minimum: 1
   * @return authorId
   */
  @NotNull @Min(1L) 
  @Schema(name = "authorId", description = "ID of the author", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Year the book was published
   * minimum: 1000
   * maximum: 2100
   * @return publishedYear
   */
  @Min(1000) @Max(2100) 
  @Schema(name = "publishedYear", description = "Year the book was published", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

