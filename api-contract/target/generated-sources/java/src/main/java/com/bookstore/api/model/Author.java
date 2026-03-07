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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-07T14:42:09.989632+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class Author {

  private Long id;

  private String name;

  private @Nullable String bio;

  public Author() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Author(Long id, String name) {
    this.id = id;
    this.name = name;
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

  public Author name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Full name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Biography
   * @return bio
   */
  
  @Schema(name = "bio", description = "Biography", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        Objects.equals(this.name, author.name) &&
        Objects.equals(this.bio, author.bio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

