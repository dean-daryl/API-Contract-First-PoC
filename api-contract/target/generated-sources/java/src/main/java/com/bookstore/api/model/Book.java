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
 * Book
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class Book {

  private Long id;

  private @Nullable String bookTitle;

  private @Nullable String isbn;

  private Long authorId;

  private @Nullable Integer publishedYear;

  public Book() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Book(Long id, Long authorId) {
    this.id = id;
    this.authorId = authorId;
  }

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book bookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
    return this;
  }

  /**
   * Title of the book
   * @return bookTitle
   */
  @Size(min = 1, max = 255) 
  @Schema(name = "bookTitle", description = "Title of the book", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookTitle")
  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * ISBN-13 of the book
   * @return isbn
   */
  @Size(max = 17) 
  @Schema(name = "isbn", description = "ISBN-13 of the book", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Book authorId(Long authorId) {
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

  public Book publishedYear(Integer publishedYear) {
    this.publishedYear = publishedYear;
    return this;
  }

  /**
   * Year published
   * minimum: 1000
   * maximum: 2100
   * @return publishedYear
   */
  @Min(1000) @Max(2100) 
  @Schema(name = "publishedYear", description = "Year published", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.bookTitle, book.bookTitle) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.authorId, book.authorId) &&
        Objects.equals(this.publishedYear, book.publishedYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bookTitle, isbn, authorId, publishedYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bookTitle: ").append(toIndentedString(bookTitle)).append("\n");
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

