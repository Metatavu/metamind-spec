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


public class ExportedStoryKnot   {
  private @Valid UUID id = null;
  private @Valid KnotType type = null;
  private @Valid TokenizerType tokenizer = null;
  private @Valid String name = null;
  private @Valid String content = null;
  private @Valid String hint = null;
  private @Valid Coordinates coordinates = null;

  /**
   * knot id.
   **/
  public ExportedStoryKnot id(UUID id) {
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
  public ExportedStoryKnot type(KnotType type) {
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
  public ExportedStoryKnot tokenizer(TokenizerType tokenizer) {
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
  public ExportedStoryKnot name(String name) {
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
  public ExportedStoryKnot content(String content) {
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
  public ExportedStoryKnot hint(String hint) {
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
   **/
  public ExportedStoryKnot coordinates(Coordinates coordinates) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStoryKnot exportedStoryKnot = (ExportedStoryKnot) o;
    return Objects.equals(id, exportedStoryKnot.id) &&
        Objects.equals(type, exportedStoryKnot.type) &&
        Objects.equals(tokenizer, exportedStoryKnot.tokenizer) &&
        Objects.equals(name, exportedStoryKnot.name) &&
        Objects.equals(content, exportedStoryKnot.content) &&
        Objects.equals(hint, exportedStoryKnot.hint) &&
        Objects.equals(coordinates, exportedStoryKnot.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, tokenizer, name, content, hint, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStoryKnot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tokenizer: ").append(toIndentedString(tokenizer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
