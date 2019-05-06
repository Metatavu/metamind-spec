/*
 * Metamind API
 * Brain spec for Metamind.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fi.metatavu.metamind.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.metatavu.metamind.client.model.IntentTrainingMaterials;
import fi.metatavu.metamind.client.model.IntentType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Intent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-06T06:22:21.133+03:00[Europe/Helsinki]")public class Intent {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("quickResponse")

  private String quickResponse = null;

  @JsonProperty("quickResponseOrder")

  private Integer quickResponseOrder = null;

  @JsonProperty("type")

  private IntentType type = null;

  @JsonProperty("sourceKnotId")

  private UUID sourceKnotId = null;

  @JsonProperty("targetKnotId")

  private UUID targetKnotId = null;

  @JsonProperty("global")

  private Boolean global = null;

  @JsonProperty("trainingMaterials")

  private IntentTrainingMaterials trainingMaterials = null;

  @JsonProperty("createdAt")

  private OffsetDateTime createdAt = null;

  @JsonProperty("modifiedAt")

  private OffsetDateTime modifiedAt = null;
  /**
  * intent id.
  * @return id
  **/
  @Schema(description = "intent id.")
  public UUID getId() {
    return id;
  }
  public Intent name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Intent quickResponse(String quickResponse) {
    this.quickResponse = quickResponse;
    return this;
  }

  

  /**
  * Get quickResponse
  * @return quickResponse
  **/
  @Schema(description = "")
  public String getQuickResponse() {
    return quickResponse;
  }
  public void setQuickResponse(String quickResponse) {
    this.quickResponse = quickResponse;
  }
  public Intent quickResponseOrder(Integer quickResponseOrder) {
    this.quickResponseOrder = quickResponseOrder;
    return this;
  }

  

  /**
  * Get quickResponseOrder
  * @return quickResponseOrder
  **/
  @Schema(required = true, description = "")
  public Integer getQuickResponseOrder() {
    return quickResponseOrder;
  }
  public void setQuickResponseOrder(Integer quickResponseOrder) {
    this.quickResponseOrder = quickResponseOrder;
  }
  public Intent type(IntentType type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(required = true, description = "")
  public IntentType getType() {
    return type;
  }
  public void setType(IntentType type) {
    this.type = type;
  }
  public Intent sourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
    return this;
  }

  

  /**
  * source knot id id.
  * @return sourceKnotId
  **/
  @Schema(description = "source knot id id.")
  public UUID getSourceKnotId() {
    return sourceKnotId;
  }
  public void setSourceKnotId(UUID sourceKnotId) {
    this.sourceKnotId = sourceKnotId;
  }
  public Intent targetKnotId(UUID targetKnotId) {
    this.targetKnotId = targetKnotId;
    return this;
  }

  

  /**
  * target knot id id.
  * @return targetKnotId
  **/
  @Schema(required = true, description = "target knot id id.")
  public UUID getTargetKnotId() {
    return targetKnotId;
  }
  public void setTargetKnotId(UUID targetKnotId) {
    this.targetKnotId = targetKnotId;
  }
  public Intent global(Boolean global) {
    this.global = global;
    return this;
  }

  

  /**
  * Get global
  * @return global
  **/
  @Schema(required = true, description = "")
  public Boolean isGlobal() {
    return global;
  }
  public void setGlobal(Boolean global) {
    this.global = global;
  }
  public Intent trainingMaterials(IntentTrainingMaterials trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
    return this;
  }

  

  /**
  * Get trainingMaterials
  * @return trainingMaterials
  **/
  @Schema(required = true, description = "")
  public IntentTrainingMaterials getTrainingMaterials() {
    return trainingMaterials;
  }
  public void setTrainingMaterials(IntentTrainingMaterials trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
  }
  /**
  * Creation time
  * @return createdAt
  **/
  @Schema(description = "Creation time")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  /**
  * Last modification time
  * @return modifiedAt
  **/
  @Schema(description = "Last modification time")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
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
    return Objects.equals(this.id, intent.id) &&
        Objects.equals(this.name, intent.name) &&
        Objects.equals(this.quickResponse, intent.quickResponse) &&
        Objects.equals(this.quickResponseOrder, intent.quickResponseOrder) &&
        Objects.equals(this.type, intent.type) &&
        Objects.equals(this.sourceKnotId, intent.sourceKnotId) &&
        Objects.equals(this.targetKnotId, intent.targetKnotId) &&
        Objects.equals(this.global, intent.global) &&
        Objects.equals(this.trainingMaterials, intent.trainingMaterials) &&
        Objects.equals(this.createdAt, intent.createdAt) &&
        Objects.equals(this.modifiedAt, intent.modifiedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, quickResponse, quickResponseOrder, type, sourceKnotId, targetKnotId, global, trainingMaterials, createdAt, modifiedAt);
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
