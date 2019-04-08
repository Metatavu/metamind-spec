package fi.metatavu.metamind.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.metamind.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TrainingMaterialType
 */
public enum TrainingMaterialType {
  REGEX("REGEX"),
    OPENNLPNER("OPENNLPNER"),
    OPENNLPREGEX("OPENNLPREGEX"),
    OPENNLPDOCCAT("OPENNLPDOCCAT");

  private String value;

  TrainingMaterialType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrainingMaterialType fromValue(String text) {
    for (TrainingMaterialType b : TrainingMaterialType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
