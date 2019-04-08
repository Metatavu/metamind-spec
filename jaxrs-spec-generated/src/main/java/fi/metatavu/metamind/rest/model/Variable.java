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


public class Variable   {
  private @Valid UUID id = null;
  private @Valid String name = null;
  private @Valid VariableType type = null;
  private @Valid UUID storyId = null;
  private @Valid String validationScript = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * variable id.
   **/
  public Variable id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "variable id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public Variable name(String name) {
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
  public Variable type(VariableType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public VariableType getType() {
    return type;
  }
  public void setType(VariableType type) {
    this.type = type;
  }

  /**
   * Story id
   **/
  public Variable storyId(UUID storyId) {
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
   * Validation script
   **/
  public Variable validationScript(String validationScript) {
    this.validationScript = validationScript;
    return this;
  }

  
  //@ApiModelProperty(value = "Validation script")
  @JsonProperty("validationScript")

  public String getValidationScript() {
    return validationScript;
  }
  public void setValidationScript(String validationScript) {
    this.validationScript = validationScript;
  }

  /**
   * Creation time
   **/
  public Variable createdAt(OffsetDateTime createdAt) {
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
  public Variable modifiedAt(OffsetDateTime modifiedAt) {
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
    Variable variable = (Variable) o;
    return Objects.equals(id, variable.id) &&
        Objects.equals(name, variable.name) &&
        Objects.equals(type, variable.type) &&
        Objects.equals(storyId, variable.storyId) &&
        Objects.equals(validationScript, variable.validationScript) &&
        Objects.equals(createdAt, variable.createdAt) &&
        Objects.equals(modifiedAt, variable.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, storyId, validationScript, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    storyId: ").append(toIndentedString(storyId)).append("\n");
    sb.append("    validationScript: ").append(toIndentedString(validationScript)).append("\n");
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
