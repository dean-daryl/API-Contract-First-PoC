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
 * AuthorRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T12:22:08.883947+02:00[Africa/Kigali]", comments = "Generator version: 7.12.0")
public class AuthorRequest {

  @jakarta.validation.constraints.NotBlank(message = "{validation.author.name.required}")
  private String name;

  @jakarta.validation.constraints.Size(max = 2000, message = "{validation.author.bio.maxLength}")
  private @Nullable String bio;

  public AuthorRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthorRequest(String name) {
    this.name = name;
  }

  public AuthorRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the author
   * @return name
   */
  @NotNull @Size(min = 1, max = 150) 
  @Schema(name = "name", description = "Full name of the author", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorRequest bio(String bio) {
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
    AuthorRequest authorRequest = (AuthorRequest) o;
    return Objects.equals(this.name, authorRequest.name) &&
        Objects.equals(this.bio, authorRequest.bio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorRequest {\n");
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

