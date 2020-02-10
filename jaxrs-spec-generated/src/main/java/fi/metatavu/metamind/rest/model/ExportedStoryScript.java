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


public class ExportedStoryScript   {
  private @Valid String name = null;
  private @Valid String version = null;
  private @Valid String language = null;
  private @Valid String content = null;

  /**
   * Script name
   **/
  public ExportedStoryScript name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Script name")
  @JsonProperty("name")
  @NotNull

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Script version
   **/
  public ExportedStoryScript version(String version) {
    this.version = version;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Script version")
  @JsonProperty("version")
  @NotNull

  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Script language
   **/
  public ExportedStoryScript language(String language) {
    this.language = language;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Script language")
  @JsonProperty("language")
  @NotNull

  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Script content
   **/
  public ExportedStoryScript content(String content) {
    this.content = content;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Script content")
  @JsonProperty("content")
  @NotNull

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStoryScript exportedStoryScript = (ExportedStoryScript) o;
    return Objects.equals(name, exportedStoryScript.name) &&
        Objects.equals(version, exportedStoryScript.version) &&
        Objects.equals(language, exportedStoryScript.language) &&
        Objects.equals(content, exportedStoryScript.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, language, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStoryScript {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
