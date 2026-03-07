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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-07T14:42:09.989632+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class Book {

  private Long id;

  private String title;

  private @Nullable String isbn;

  private Long authorId;

  private @Nullable Integer publishedYear;

  public Book() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Book(Long id, String title, Long authorId) {
    this.id = id;
    this.title = title;
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

  public Book title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the book
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "Title of the book", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * ISBN
   * @return isbn
   */
  
  @Schema(name = "isbn", description = "ISBN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
   * @return authorId
   */
  @NotNull 
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
   * @return publishedYear
   */
  
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
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.authorId, book.authorId) &&
        Objects.equals(this.publishedYear, book.publishedYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, isbn, authorId, publishedYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

