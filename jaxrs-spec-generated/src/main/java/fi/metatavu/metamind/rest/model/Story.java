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


public class Story   {
  private @Valid UUID id = null;
  private @Valid String dafaultHint = null;
  private @Valid String name = null;
  private @Valid String locale = null;
  private @Valid List<String> quickResponses = new ArrayList<>();
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * Story id.
   **/
  public Story id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "Story id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * default hint for the story
   **/
  public Story dafaultHint(String dafaultHint) {
    this.dafaultHint = dafaultHint;
    return this;
  }

  
  //@ApiModelProperty(value = "default hint for the story")
  @JsonProperty("dafaultHint")

  public String getDafaultHint() {
    return dafaultHint;
  }
  public void setDafaultHint(String dafaultHint) {
    this.dafaultHint = dafaultHint;
  }

  /**
   * Story name.
   **/
  public Story name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Story name.")
  @JsonProperty("name")
  @NotNull

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Story locale.
   **/
  public Story locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Story locale.")
  @JsonProperty("locale")
  @NotNull

  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * List of story global quick responses.
   **/
  public Story quickResponses(List<String> quickResponses) {
    this.quickResponses = quickResponses;
    return this;
  }

  
  //@ApiModelProperty(value = "List of story global quick responses.")
  @JsonProperty("quickResponses")

  public List<String> getQuickResponses() {
    return quickResponses;
  }
  public void setQuickResponses(List<String> quickResponses) {
    this.quickResponses = quickResponses;
  }

  /**
   * Creation time
   **/
  public Story createdAt(OffsetDateTime createdAt) {
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
  public Story modifiedAt(OffsetDateTime modifiedAt) {
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
    Story story = (Story) o;
    return Objects.equals(id, story.id) &&
        Objects.equals(dafaultHint, story.dafaultHint) &&
        Objects.equals(name, story.name) &&
        Objects.equals(locale, story.locale) &&
        Objects.equals(quickResponses, story.quickResponses) &&
        Objects.equals(createdAt, story.createdAt) &&
        Objects.equals(modifiedAt, story.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dafaultHint, name, locale, quickResponses, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Story {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dafaultHint: ").append(toIndentedString(dafaultHint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    quickResponses: ").append(toIndentedString(quickResponses)).append("\n");
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
