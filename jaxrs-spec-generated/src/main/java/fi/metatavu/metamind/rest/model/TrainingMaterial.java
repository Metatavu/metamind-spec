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


public class TrainingMaterial   {
  private @Valid UUID id = null;
  private @Valid TrainingMaterialType type = null;
  private @Valid UUID storyId = null;
  private @Valid String text = null;
  private @Valid String name = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * intent id.
   **/
  public TrainingMaterial id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "intent id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public TrainingMaterial type(TrainingMaterialType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("type")

  public TrainingMaterialType getType() {
    return type;
  }
  public void setType(TrainingMaterialType type) {
    this.type = type;
  }

  /**
   **/
  public TrainingMaterial storyId(UUID storyId) {
    this.storyId = storyId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("storyId")

  public UUID getStoryId() {
    return storyId;
  }
  public void setStoryId(UUID storyId) {
    this.storyId = storyId;
  }

  /**
   **/
  public TrainingMaterial text(String text) {
    this.text = text;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("text")
  @NotNull

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public TrainingMaterial name(String name) {
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
   * Creation time
   **/
  public TrainingMaterial createdAt(OffsetDateTime createdAt) {
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
  public TrainingMaterial modifiedAt(OffsetDateTime modifiedAt) {
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
    TrainingMaterial trainingMaterial = (TrainingMaterial) o;
    return Objects.equals(id, trainingMaterial.id) &&
        Objects.equals(type, trainingMaterial.type) &&
        Objects.equals(storyId, trainingMaterial.storyId) &&
        Objects.equals(text, trainingMaterial.text) &&
        Objects.equals(name, trainingMaterial.name) &&
        Objects.equals(createdAt, trainingMaterial.createdAt) &&
        Objects.equals(modifiedAt, trainingMaterial.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, storyId, text, name, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingMaterial {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    storyId: ").append(toIndentedString(storyId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
