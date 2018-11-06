package fi.metatavu.metamind.server.rest.model;

import java.time.OffsetDateTime;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Session   {
  
  private @Valid UUID id = null;
  private @Valid String locale = null;
  private @Valid String timeZone = null;
  private @Valid String visitor = null;
  private @Valid String story = null;
  private @Valid OffsetDateTime created = null;

  /**
   * Session id.
   **/
  public Session id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Session id.")
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

  
  @ApiModelProperty(value = "Session locale")
  @JsonProperty("locale")
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

  
  @ApiModelProperty(value = "Session time zone")
  @JsonProperty("timeZone")
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

  
  @ApiModelProperty(value = "Visitor details")
  @JsonProperty("visitor")
  public String getVisitor() {
    return visitor;
  }
  public void setVisitor(String visitor) {
    this.visitor = visitor;
  }

  /**
   * Story name
   **/
  public Session story(String story) {
    this.story = story;
    return this;
  }

  
  @ApiModelProperty(value = "Story name")
  @JsonProperty("story")
  public String getStory() {
    return story;
  }
  public void setStory(String story) {
    this.story = story;
  }

  /**
   * Time the session was initiated
   **/
  public Session created(OffsetDateTime created) {
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
    Session session = (Session) o;
    return Objects.equals(id, session.id) &&
        Objects.equals(locale, session.locale) &&
        Objects.equals(timeZone, session.timeZone) &&
        Objects.equals(visitor, session.visitor) &&
        Objects.equals(story, session.story) &&
        Objects.equals(created, session.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locale, timeZone, visitor, story, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    visitor: ").append(toIndentedString(visitor)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
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

