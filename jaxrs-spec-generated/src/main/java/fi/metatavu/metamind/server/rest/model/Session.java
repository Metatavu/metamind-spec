package fi.metatavu.metamind.server.rest.model;

import java.time.OffsetDateTime;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Session   {
  
  private @Valid UUID id = null;
  private @Valid String locale = null;
  private @Valid String visitor = null;
  private @Valid OffsetDateTime created = null;

  /**
   * Session id.
   **/
  public Session id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Session id.")
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
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Visitor details
   **/
  public Session visitor(String visitor) {
    this.visitor = visitor;
    return this;
  }

  
  @ApiModelProperty(value = "Visitor details")
  public String getVisitor() {
    return visitor;
  }
  public void setVisitor(String visitor) {
    this.visitor = visitor;
  }

  /**
   * Time the session was initiated
   **/
  public Session created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(value = "Time the session was initiated")
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
        Objects.equals(visitor, session.visitor) &&
        Objects.equals(created, session.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locale, visitor, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    visitor: ").append(toIndentedString(visitor)).append("\n");
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

