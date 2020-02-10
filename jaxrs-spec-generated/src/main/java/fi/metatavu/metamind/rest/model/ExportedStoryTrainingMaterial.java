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


public class ExportedStoryTrainingMaterial   {
  private @Valid UUID id = null;
  private @Valid TrainingMaterialType type = null;
  private @Valid String text = null;
  private @Valid String name = null;
  private @Valid String visibility = null;

  /**
   * training material id.
   **/
  public ExportedStoryTrainingMaterial id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "training material id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public ExportedStoryTrainingMaterial type(TrainingMaterialType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public TrainingMaterialType getType() {
    return type;
  }
  public void setType(TrainingMaterialType type) {
    this.type = type;
  }

  /**
   **/
  public ExportedStoryTrainingMaterial text(String text) {
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
  public ExportedStoryTrainingMaterial name(String name) {
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
  public ExportedStoryTrainingMaterial visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("visibility")
  @NotNull

  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStoryTrainingMaterial exportedStoryTrainingMaterial = (ExportedStoryTrainingMaterial) o;
    return Objects.equals(id, exportedStoryTrainingMaterial.id) &&
        Objects.equals(type, exportedStoryTrainingMaterial.type) &&
        Objects.equals(text, exportedStoryTrainingMaterial.text) &&
        Objects.equals(name, exportedStoryTrainingMaterial.name) &&
        Objects.equals(visibility, exportedStoryTrainingMaterial.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, text, name, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStoryTrainingMaterial {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
