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


public class ExportedStory   {
  private @Valid String name = null;
  private @Valid String defaultHint = null;
  private @Valid String locale = null;
  private @Valid List<ExportedStoryKnot> knots = new ArrayList<>();
  private @Valid List<ExportedStoryVariable> variables = new ArrayList<>();
  private @Valid List<ExportedStoryScript> scripts = new ArrayList<>();
  private @Valid List<ExportedStoryIntent> intents = new ArrayList<>();
  private @Valid List<ExportedStoryTrainingMaterial> trainingMaterials = new ArrayList<>();

  /**
   * Story name.
   **/
  public ExportedStory name(String name) {
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
   * Default hint.
   **/
  public ExportedStory defaultHint(String defaultHint) {
    this.defaultHint = defaultHint;
    return this;
  }

  
  //@ApiModelProperty(value = "Default hint.")
  @JsonProperty("defaultHint")

  public String getDefaultHint() {
    return defaultHint;
  }
  public void setDefaultHint(String defaultHint) {
    this.defaultHint = defaultHint;
  }

  /**
   * Story locale.
   **/
  public ExportedStory locale(String locale) {
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
   **/
  public ExportedStory knots(List<ExportedStoryKnot> knots) {
    this.knots = knots;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("knots")
  @NotNull

  public List<ExportedStoryKnot> getKnots() {
    return knots;
  }
  public void setKnots(List<ExportedStoryKnot> knots) {
    this.knots = knots;
  }

  /**
   **/
  public ExportedStory variables(List<ExportedStoryVariable> variables) {
    this.variables = variables;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("variables")
  @NotNull

  public List<ExportedStoryVariable> getVariables() {
    return variables;
  }
  public void setVariables(List<ExportedStoryVariable> variables) {
    this.variables = variables;
  }

  /**
   **/
  public ExportedStory scripts(List<ExportedStoryScript> scripts) {
    this.scripts = scripts;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("scripts")
  @NotNull

  public List<ExportedStoryScript> getScripts() {
    return scripts;
  }
  public void setScripts(List<ExportedStoryScript> scripts) {
    this.scripts = scripts;
  }

  /**
   **/
  public ExportedStory intents(List<ExportedStoryIntent> intents) {
    this.intents = intents;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("intents")
  @NotNull

  public List<ExportedStoryIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<ExportedStoryIntent> intents) {
    this.intents = intents;
  }

  /**
   **/
  public ExportedStory trainingMaterials(List<ExportedStoryTrainingMaterial> trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("trainingMaterials")
  @NotNull

  public List<ExportedStoryTrainingMaterial> getTrainingMaterials() {
    return trainingMaterials;
  }
  public void setTrainingMaterials(List<ExportedStoryTrainingMaterial> trainingMaterials) {
    this.trainingMaterials = trainingMaterials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportedStory exportedStory = (ExportedStory) o;
    return Objects.equals(name, exportedStory.name) &&
        Objects.equals(defaultHint, exportedStory.defaultHint) &&
        Objects.equals(locale, exportedStory.locale) &&
        Objects.equals(knots, exportedStory.knots) &&
        Objects.equals(variables, exportedStory.variables) &&
        Objects.equals(scripts, exportedStory.scripts) &&
        Objects.equals(intents, exportedStory.intents) &&
        Objects.equals(trainingMaterials, exportedStory.trainingMaterials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultHint, locale, knots, variables, scripts, intents, trainingMaterials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportedStory {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultHint: ").append(toIndentedString(defaultHint)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    knots: ").append(toIndentedString(knots)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    trainingMaterials: ").append(toIndentedString(trainingMaterials)).append("\n");
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
