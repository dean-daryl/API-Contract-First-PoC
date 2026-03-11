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
 * Author
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class Author {

  private Long id;

  private @Nullable String authorName;

  private @Nullable String bio;

  public Author() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Author(Long id) {
    this.id = id;
  }

  public Author id(Long id) {
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

  public Author authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * Full name of the author
   * @return authorName
   */
  @Size(min = 1, max = 150) 
  @Schema(name = "authorName", description = "Full name of the author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorName")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Author bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Biography of the author
   * @return bio
   */
  @Size(max = 2000) 
  @Schema(name = "bio", description = "Biography of the author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.id, author.id) &&
        Objects.equals(this.authorName, author.authorName) &&
        Objects.equals(this.bio, author.bio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authorName, bio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
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

