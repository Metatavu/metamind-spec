package fi.metatavu.metamind.server.rest.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Message   {
  
  private @Valid UUID id = null;
  private @Valid UUID sessionId = null;
  private @Valid String content = null;
  private @Valid String response = null;
  private @Valid String hint = null;
  private @Valid List<String> quickResponses = new ArrayList<>();
  private @Valid OffsetDateTime created = null;

  /**
   * Message id
   **/
  public Message id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Message id")
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

  
  @ApiModelProperty(value = "Session id the message belongs to")
  @JsonProperty("sessionId")
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

  
  @ApiModelProperty(value = "Message content")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Response text. Used only when responding
   **/
  public Message response(String response) {
    this.response = response;
    return this;
  }

  
  @ApiModelProperty(value = "Response text. Used only when responding")
  @JsonProperty("response")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   * Hint text. Used only when responding
   **/
  public Message hint(String hint) {
    this.hint = hint;
    return this;
  }

  
  @ApiModelProperty(value = "Hint text. Used only when responding")
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

  
  @ApiModelProperty(value = "List of quick responses. Used only when responding")
  @JsonProperty("quickResponses")
  public List<String> getQuickResponses() {
    return quickResponses;
  }
  public void setQuickResponses(List<String> quickResponses) {
    this.quickResponses = quickResponses;
  }

  /**
   * Time the session was initiated
   **/
  public Message created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(value = "Time the session was initiated")
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
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
        Objects.equals(created, message.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionId, content, response, hint, quickResponses, created);
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
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

