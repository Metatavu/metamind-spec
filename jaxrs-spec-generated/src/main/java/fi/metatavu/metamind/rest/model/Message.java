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


public class Message   {
  private @Valid UUID id = null;
  private @Valid UUID sessionId = null;
  private @Valid String content = null;
  private @Valid List<String> response = new ArrayList<>();
  private @Valid String hint = null;
  private @Valid List<String> quickResponses = new ArrayList<>();
  private @Valid Double confidence = null;
  private @Valid UUID sourceKnotId = null;
  private @Valid UUID matchedIntentId = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * Message id
   **/
  public Message id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "Message id")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Session id the message belongs to
   **/
  public Message sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Session id the message belongs to")
  @JsonProperty("sessionId")
  @NotNull

  public UUID getSessionId() {
    return sessionId;
  }
  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }

  /**
   * Message content
   **/
  public Message content(String content) {
    this.content = content;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Message content")
  @JsonProperty("content")
  @NotNull

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Response text. Used only when responding
   **/
  public Message response(List<String> response) {
    this.response = response;
    return this;
  }

  
  //@ApiModelProperty(value = "Response text. Used only when responding")
  @JsonProperty("response")

  public List<String> getResponse() {
    return response;
  }
  public void setResponse(List<String> response) {
    this.response = response;
  }

  /**
   * Hint text. Used only when responding
   **/
  public Message hint(String hint) {
    this.hint = hint;
    return this;
  }

  
  //@ApiModelProperty(value = "Hint text. Used only when responding")
  @JsonProperty("hint")

  public String getHint() {
    return hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }

  /**
   * List of quick responses. Used only when responding
   **/
  public Message quickResponses(List<String> quickResponses) {
    this.quickResponses = quickResponses;
    return this;
  }

  
  //@ApiModelProperty(value = "List of quick responses. Used only when responding")
  @JsonProperty("quickResponses")

  public List<String> getQuickResponses() {
    return quickResponses;
  }
  public void setQuickResponses(List<String> quickResponses) {
    this.quickResponses = quickResponses;
  }

  /**
   * Value how confident the bot was about the intent
   **/
  public Message confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  
  //@ApiModelProperty(value = "Value how confident the bot was about the intent")
  @JsonProperty("confidence")

  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  /**
   * source knot id id.
   **/
  public Message sourceKnotId(UUID sourceKnotId) {
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
   * matched intent id. Null if intent not found
   **/
  public Message matchedIntentId(UUID matchedIntentId) {
    this.matchedIntentId = matchedIntentId;
    return this;
  }

  
  //@ApiModelProperty(value = "matched intent id. Null if intent not found")
  @JsonProperty("matchedIntentId")

  public UUID getMatchedIntentId() {
    return matchedIntentId;
  }
  public void setMatchedIntentId(UUID matchedIntentId) {
    this.matchedIntentId = matchedIntentId;
  }

  /**
   * Creation time
   **/
  public Message createdAt(OffsetDateTime createdAt) {
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
  public Message modifiedAt(OffsetDateTime modifiedAt) {
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
    Message message = (Message) o;
    return Objects.equals(id, message.id) &&
        Objects.equals(sessionId, message.sessionId) &&
        Objects.equals(content, message.content) &&
        Objects.equals(response, message.response) &&
        Objects.equals(hint, message.hint) &&
        Objects.equals(quickResponses, message.quickResponses) &&
        Objects.equals(confidence, message.confidence) &&
        Objects.equals(sourceKnotId, message.sourceKnotId) &&
        Objects.equals(matchedIntentId, message.matchedIntentId) &&
        Objects.equals(createdAt, message.createdAt) &&
        Objects.equals(modifiedAt, message.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionId, content, response, hint, quickResponses, confidence, sourceKnotId, matchedIntentId, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    quickResponses: ").append(toIndentedString(quickResponses)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    sourceKnotId: ").append(toIndentedString(sourceKnotId)).append("\n");
    sb.append("    matchedIntentId: ").append(toIndentedString(matchedIntentId)).append("\n");
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
