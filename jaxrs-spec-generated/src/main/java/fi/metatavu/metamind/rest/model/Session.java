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


public class Session   {
  private @Valid UUID id = null;
  private @Valid String locale = null;
  private @Valid String timeZone = null;
  private @Valid String visitor = null;
  private @Valid UUID storyId = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * Session id.
   **/
  public Session id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "Session id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Session locale
   **/
  public Session locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Session locale")
  @JsonProperty("locale")
  @NotNull

  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Session time zone
   **/
  public Session timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Session time zone")
  @JsonProperty("timeZone")
  @NotNull

  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * Visitor details
   **/
  public Session visitor(String visitor) {
    this.visitor = visitor;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Visitor details")
  @JsonProperty("visitor")
  @NotNull

  public String getVisitor() {
    return visitor;
  }
  public void setVisitor(String visitor) {
    this.visitor = visitor;
  }

  /**
   * Story id
   **/
  public Session storyId(UUID storyId) {
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
   * Creation time
   **/
  public Session createdAt(OffsetDateTime createdAt) {
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
  public Session modifiedAt(OffsetDateTime modifiedAt) {
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
    Session session = (Session) o;
    return Objects.equals(id, session.id) &&
        Objects.equals(locale, session.locale) &&
        Objects.equals(timeZone, session.timeZone) &&
        Objects.equals(visitor, session.visitor) &&
        Objects.equals(storyId, session.storyId) &&
        Objects.equals(createdAt, session.createdAt) &&
        Objects.equals(modifiedAt, session.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locale, timeZone, visitor, storyId, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    visitor: ").append(toIndentedString(visitor)).append("\n");
    sb.append("    storyId: ").append(toIndentedString(storyId)).append("\n");
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
