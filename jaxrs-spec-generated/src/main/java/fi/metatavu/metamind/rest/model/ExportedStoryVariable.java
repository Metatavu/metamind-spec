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


public class ExportedStoryVariable   {
  private @Valid String name = null;
  private @Valid VariableType type = null;
  private @Valid String validationScript = null;

  /**
   **/
  public ExportedStoryVariable name(String name) {
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
  public ExportedStoryVariable type(VariableType type) {
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
   * Validation script
   **/
  public ExportedStoryVariable validationScript(String validationScript) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStoryVariable exportedStoryVariable = (ExportedStoryVariable) o;
    return Objects.equals(name, exportedStoryVariable.name) &&
        Objects.equals(type, exportedStoryVariable.type) &&
        Objects.equals(validationScript, exportedStoryVariable.validationScript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, validationScript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStoryVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validationScript: ").append(toIndentedString(validationScript)).append("\n");
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
