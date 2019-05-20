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
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Story
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-20T15:24:44.194+03:00[Europe/Helsinki]")public class Story {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("dafaultHint")

  private String dafaultHint = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("locale")

  private String locale = null;

  @JsonProperty("quickResponses")

  private List<String> quickResponses = null;

  @JsonProperty("createdAt")

  private OffsetDateTime createdAt = null;

  @JsonProperty("modifiedAt")

  private OffsetDateTime modifiedAt = null;
  /**
  * Story id.
  * @return id
  **/
  @Schema(description = "Story id.")
  public UUID getId() {
    return id;
  }
  public Story dafaultHint(String dafaultHint) {
    this.dafaultHint = dafaultHint;
    return this;
  }

  

  /**
  * default hint for the story
  * @return dafaultHint
  **/
  @Schema(description = "default hint for the story")
  public String getDafaultHint() {
    return dafaultHint;
  }
  public void setDafaultHint(String dafaultHint) {
    this.dafaultHint = dafaultHint;
  }
  public Story name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Story name.
  * @return name
  **/
  @Schema(required = true, description = "Story name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Story locale(String locale) {
    this.locale = locale;
    return this;
  }

  

  /**
  * Story locale.
  * @return locale
  **/
  @Schema(required = true, description = "Story locale.")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }
  /**
  * List of story global quick responses.
  * @return quickResponses
  **/
  @Schema(description = "List of story global quick responses.")
  public List<String> getQuickResponses() {
    return quickResponses;
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
    Story story = (Story) o;
    return Objects.equals(this.id, story.id) &&
        Objects.equals(this.dafaultHint, story.dafaultHint) &&
        Objects.equals(this.name, story.name) &&
        Objects.equals(this.locale, story.locale) &&
        Objects.equals(this.quickResponses, story.quickResponses) &&
        Objects.equals(this.createdAt, story.createdAt) &&
        Objects.equals(this.modifiedAt, story.modifiedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, dafaultHint, name, locale, quickResponses, createdAt, modifiedAt);
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
