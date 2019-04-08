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
  private @Valid UUID openNlpNerId = null;
  private @Valid UUID openNlpDoccatId = null;

  /**
   * OpenNLP NER training material id
   **/
  public IntentTrainingMaterials openNlpNerId(UUID openNlpNerId) {
    this.openNlpNerId = openNlpNerId;
    return this;
  }

  
  //@ApiModelProperty(value = "OpenNLP NER training material id")
  @JsonProperty("openNlpNerId")

  public UUID getOpenNlpNerId() {
    return openNlpNerId;
  }
  public void setOpenNlpNerId(UUID openNlpNerId) {
    this.openNlpNerId = openNlpNerId;
  }

  /**
   * OpenNLP Doccat training material id
   **/
  public IntentTrainingMaterials openNlpDoccatId(UUID openNlpDoccatId) {
    this.openNlpDoccatId = openNlpDoccatId;
    return this;
  }

  
  //@ApiModelProperty(value = "OpenNLP Doccat training material id")
  @JsonProperty("openNlpDoccatId")

  public UUID getOpenNlpDoccatId() {
    return openNlpDoccatId;
  }
  public void setOpenNlpDoccatId(UUID openNlpDoccatId) {
    this.openNlpDoccatId = openNlpDoccatId;
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
    return Objects.equals(openNlpNerId, intentTrainingMaterials.openNlpNerId) &&
        Objects.equals(openNlpDoccatId, intentTrainingMaterials.openNlpDoccatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openNlpNerId, openNlpDoccatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentTrainingMaterials {\n");
    
    sb.append("    openNlpNerId: ").append(toIndentedString(openNlpNerId)).append("\n");
    sb.append("    openNlpDoccatId: ").append(toIndentedString(openNlpDoccatId)).append("\n");
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
