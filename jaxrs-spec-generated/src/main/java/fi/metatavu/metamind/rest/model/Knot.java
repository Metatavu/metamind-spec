package fi.metatavu.metamind.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.metamind.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;


public class Knot   {
  private @Valid UUID id = null;
  private @Valid KnotType type = null;
  private @Valid TokenizerType tokenizer = null;
  private @Valid String name = null;
  private @Valid String content = null;
  private @Valid String hint = null;
  private @Valid UUID storyId = null;
  private @Valid Coordinates coordinates = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * knot id.
   **/
  public Knot id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "knot id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public Knot type(KnotType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public KnotType getType() {
    return type;
  }
  public void setType(KnotType type) {
    this.type = type;
  }

  /**
   **/
  public Knot tokenizer(TokenizerType tokenizer) {
    this.tokenizer = tokenizer;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("tokenizer")
  @NotNull

  public TokenizerType getTokenizer() {
    return tokenizer;
  }
  public void setTokenizer(TokenizerType tokenizer) {
    this.tokenizer = tokenizer;
  }

  /**
   **/
  public Knot name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Knot content(String content) {
    this.content = content;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("content")
  @NotNull

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  public Knot hint(String hint) {
    this.hint = hint;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("hint")

  public String getHint() {
    return hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }

  /**
   * Story id
   **/
  public Knot storyId(UUID storyId) {
    this.storyId = storyId;
    return this;
  }

  
  //@ApiModelProperty(value = "Story id")
  @JsonProperty("storyId")

  public UUID getStoryId() {
    return storyId;
  }
  public void setStoryId(UUID storyId) {
    this.storyId = storyId;
  }

  /**
   **/
  public Knot coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("coordinates")

  public Coordinates getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  /**
   * Creation time
   **/
  public Knot createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  //@ApiModelProperty(value = "Creation time")
  @JsonProperty("createdAt")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Last modification time
   **/
  public Knot modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  
  //@ApiModelProperty(value = "Last modification time")
  @JsonProperty("modifiedAt")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Knot knot = (Knot) o;
    return Objects.equals(id, knot.id) &&
        Objects.equals(type, knot.type) &&
        Objects.equals(tokenizer, knot.tokenizer) &&
        Objects.equals(name, knot.name) &&
        Objects.equals(content, knot.content) &&
        Objects.equals(hint, knot.hint) &&
        Objects.equals(storyId, knot.storyId) &&
        Objects.equals(coordinates, knot.coordinates) &&
        Objects.equals(createdAt, knot.createdAt) &&
        Objects.equals(modifiedAt, knot.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, tokenizer, name, content, hint, storyId, coordinates, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Knot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tokenizer: ").append(toIndentedString(tokenizer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    storyId: ").append(toIndentedString(storyId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
