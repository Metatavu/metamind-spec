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


public class Intent   {
  private @Valid UUID id = null;
  private @Valid String name = null;
  private @Valid String quickResponse = null;
  private @Valid Integer quickResponseOrder = null;
  private @Valid IntentType type = null;
  private @Valid UUID sourceKnotId = null;
  private @Valid UUID targetKnotId = null;
  private @Valid Boolean global = null;
  private @Valid IntentTrainingMaterials trainingMaterials = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * intent id.
   **/
  public Intent id(UUID id) {
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
  public Intent name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Intent quickResponse(String quickResponse) {
    this.quickResponse = quickResponse;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("quickResponse")

  public String getQuickResponse() {
    return quickResponse;
  }
  public void setQuickResponse(String quickResponse) {
    this.quickResponse = quickResponse;
  }

  /**
   **/
  public Intent quickResponseOrder(Integer quickResponseOrder) {
    this.quickResponseOrder = quickResponseOrder;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("quickResponseOrder")
  @NotNull

  public Integer getQuickResponseOrder() {
    return quickResponseOrder;
  }
  public void setQuickResponseOrder(Integer quickResponseOrder) {
    this.quickResponseOrder = quickResponseOrder;
  }

  /**
   **/
  public Intent type(IntentType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public IntentType getType() {
    return type;
  }
  public void setType(IntentType type) {
    this.type = type;
  }

  /**
   * source knot id id.
   **/
  public Intent sourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
    return this;
  }

  
  //@ApiModelProperty(value = "source knot id id.")
  @JsonProperty("sourceKnotId")

  public UUID getSourceKnotId() {
    return sourceKnotId;
  }
  public void setSourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
  }

  /**
   * target knot id id.
   **/
  public Intent targetKnotId(UUID targetKnotId) {
    this.targetKnotId = targetKnotId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "target knot id id.")
  @JsonProperty("targetKnotId")
  @NotNull

  public UUID getTargetKnotId() {
    return targetKnotId;
  }
  public void setTargetKnotId(UUID targetKnotId) {
    this.targetKnotId = targetKnotId;
  }

  /**
   **/
  public Intent global(Boolean global) {
    this.global = global;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("global")
  @NotNull

  public Boolean isisGlobal() {
    return global;
  }
  public void setGlobal(Boolean global) {
    this.global = global;
  }

  /**
   **/
  public Intent trainingMaterials(IntentTrainingMaterials trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("trainingMaterials")
  @NotNull

  public IntentTrainingMaterials getTrainingMaterials() {
    return trainingMaterials;
  }
  public void setTrainingMaterials(IntentTrainingMaterials trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
  }

  /**
   * Creation time
   **/
  public Intent createdAt(OffsetDateTime createdAt) {
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
  public Intent modifiedAt(OffsetDateTime modifiedAt) {
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
    Intent intent = (Intent) o;
    return Objects.equals(id, intent.id) &&
        Objects.equals(name, intent.name) &&
        Objects.equals(quickResponse, intent.quickResponse) &&
        Objects.equals(quickResponseOrder, intent.quickResponseOrder) &&
        Objects.equals(type, intent.type) &&
        Objects.equals(sourceKnotId, intent.sourceKnotId) &&
        Objects.equals(targetKnotId, intent.targetKnotId) &&
        Objects.equals(global, intent.global) &&
        Objects.equals(trainingMaterials, intent.trainingMaterials) &&
        Objects.equals(createdAt, intent.createdAt) &&
        Objects.equals(modifiedAt, intent.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quickResponse, quickResponseOrder, type, sourceKnotId, targetKnotId, global, trainingMaterials, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quickResponse: ").append(toIndentedString(quickResponse)).append("\n");
    sb.append("    quickResponseOrder: ").append(toIndentedString(quickResponseOrder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceKnotId: ").append(toIndentedString(sourceKnotId)).append("\n");
    sb.append("    targetKnotId: ").append(toIndentedString(targetKnotId)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    trainingMaterials: ").append(toIndentedString(trainingMaterials)).append("\n");
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
