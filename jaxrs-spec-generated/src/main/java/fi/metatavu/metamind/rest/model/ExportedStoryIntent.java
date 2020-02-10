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


public class ExportedStoryIntent   {
  private @Valid UUID id = null;
  private @Valid String name = null;
  private @Valid String quickResponse = null;
  private @Valid Integer quickResponseOrder = null;
  private @Valid IntentType type = null;
  private @Valid UUID sourceKnotId = null;
  private @Valid UUID targetKnotId = null;
  private @Valid Boolean global = null;
  private @Valid List<UUID> trainingMaterialIds = new ArrayList<>();

  /**
   * intent id.
   **/
  public ExportedStoryIntent id(UUID id) {
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
  public ExportedStoryIntent name(String name) {
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
  public ExportedStoryIntent quickResponse(String quickResponse) {
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
  public ExportedStoryIntent quickResponseOrder(Integer quickResponseOrder) {
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
  public ExportedStoryIntent type(IntentType type) {
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
   * source knot id.
   **/
  public ExportedStoryIntent sourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
    return this;
  }

  
  //@ApiModelProperty(value = "source knot id.")
  @JsonProperty("sourceKnotId")

  public UUID getSourceKnotId() {
    return sourceKnotId;
  }
  public void setSourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
  }

  /**
   * target knot id.
   **/
  public ExportedStoryIntent targetKnotId(UUID targetKnotId) {
    this.targetKnotId = targetKnotId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "target knot id.")
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
  public ExportedStoryIntent global(Boolean global) {
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
  public ExportedStoryIntent trainingMaterialIds(List<UUID> trainingMaterialIds) {
    this.trainingMaterialIds = trainingMaterialIds;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("trainingMaterialIds")

  public List<UUID> getTrainingMaterialIds() {
    return trainingMaterialIds;
  }
  public void setTrainingMaterialIds(List<UUID> trainingMaterialIds) {
    this.trainingMaterialIds = trainingMaterialIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStoryIntent exportedStoryIntent = (ExportedStoryIntent) o;
    return Objects.equals(id, exportedStoryIntent.id) &&
        Objects.equals(name, exportedStoryIntent.name) &&
        Objects.equals(quickResponse, exportedStoryIntent.quickResponse) &&
        Objects.equals(quickResponseOrder, exportedStoryIntent.quickResponseOrder) &&
        Objects.equals(type, exportedStoryIntent.type) &&
        Objects.equals(sourceKnotId, exportedStoryIntent.sourceKnotId) &&
        Objects.equals(targetKnotId, exportedStoryIntent.targetKnotId) &&
        Objects.equals(global, exportedStoryIntent.global) &&
        Objects.equals(trainingMaterialIds, exportedStoryIntent.trainingMaterialIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quickResponse, quickResponseOrder, type, sourceKnotId, targetKnotId, global, trainingMaterialIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStoryIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quickResponse: ").append(toIndentedString(quickResponse)).append("\n");
    sb.append("    quickResponseOrder: ").append(toIndentedString(quickResponseOrder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceKnotId: ").append(toIndentedString(sourceKnotId)).append("\n");
    sb.append("    targetKnotId: ").append(toIndentedString(targetKnotId)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    trainingMaterialIds: ").append(toIndentedString(trainingMaterialIds)).append("\n");
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
