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


public class IntentTrainingMaterials   {
  private @Valid UUID intentOpenNlpDoccatId = null;
  private @Valid UUID intentRegexId = null;
  private @Valid UUID variableOpenNlpNerId = null;
  private @Valid UUID variableOpenNlpRegex = null;

  /**
   * Intent OpenNLP Doccat training material id
   **/
  public IntentTrainingMaterials intentOpenNlpDoccatId(UUID intentOpenNlpDoccatId) {
    this.intentOpenNlpDoccatId = intentOpenNlpDoccatId;
    return this;
  }

  
  //@ApiModelProperty(value = "Intent OpenNLP Doccat training material id")
  @JsonProperty("intentOpenNlpDoccatId")

  public UUID getIntentOpenNlpDoccatId() {
    return intentOpenNlpDoccatId;
  }
  public void setIntentOpenNlpDoccatId(UUID intentOpenNlpDoccatId) {
    this.intentOpenNlpDoccatId = intentOpenNlpDoccatId;
  }

  /**
   * Intent regex training material id
   **/
  public IntentTrainingMaterials intentRegexId(UUID intentRegexId) {
    this.intentRegexId = intentRegexId;
    return this;
  }

  
  //@ApiModelProperty(value = "Intent regex training material id")
  @JsonProperty("intentRegexId")

  public UUID getIntentRegexId() {
    return intentRegexId;
  }
  public void setIntentRegexId(UUID intentRegexId) {
    this.intentRegexId = intentRegexId;
  }

  /**
   * Variable OpenNLP NER training material id
   **/
  public IntentTrainingMaterials variableOpenNlpNerId(UUID variableOpenNlpNerId) {
    this.variableOpenNlpNerId = variableOpenNlpNerId;
    return this;
  }

  
  //@ApiModelProperty(value = "Variable OpenNLP NER training material id")
  @JsonProperty("variableOpenNlpNerId")

  public UUID getVariableOpenNlpNerId() {
    return variableOpenNlpNerId;
  }
  public void setVariableOpenNlpNerId(UUID variableOpenNlpNerId) {
    this.variableOpenNlpNerId = variableOpenNlpNerId;
  }

  /**
   * Variable OpenNLP Regex training material id
   **/
  public IntentTrainingMaterials variableOpenNlpRegex(UUID variableOpenNlpRegex) {
    this.variableOpenNlpRegex = variableOpenNlpRegex;
    return this;
  }

  
  //@ApiModelProperty(value = "Variable OpenNLP Regex training material id")
  @JsonProperty("variableOpenNlpRegex")

  public UUID getVariableOpenNlpRegex() {
    return variableOpenNlpRegex;
  }
  public void setVariableOpenNlpRegex(UUID variableOpenNlpRegex) {
    this.variableOpenNlpRegex = variableOpenNlpRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentTrainingMaterials intentTrainingMaterials = (IntentTrainingMaterials) o;
    return Objects.equals(intentOpenNlpDoccatId, intentTrainingMaterials.intentOpenNlpDoccatId) &&
        Objects.equals(intentRegexId, intentTrainingMaterials.intentRegexId) &&
        Objects.equals(variableOpenNlpNerId, intentTrainingMaterials.variableOpenNlpNerId) &&
        Objects.equals(variableOpenNlpRegex, intentTrainingMaterials.variableOpenNlpRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentOpenNlpDoccatId, intentRegexId, variableOpenNlpNerId, variableOpenNlpRegex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentTrainingMaterials {\n");
    
    sb.append("    intentOpenNlpDoccatId: ").append(toIndentedString(intentOpenNlpDoccatId)).append("\n");
    sb.append("    intentRegexId: ").append(toIndentedString(intentRegexId)).append("\n");
    sb.append("    variableOpenNlpNerId: ").append(toIndentedString(variableOpenNlpNerId)).append("\n");
    sb.append("    variableOpenNlpRegex: ").append(toIndentedString(variableOpenNlpRegex)).append("\n");
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
