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
 * Gets or Sets TrainingMaterialVisibility
 */
public enum TrainingMaterialVisibility {
  STORY("STORY"),
    LOCAL("LOCAL");

  private String value;

  TrainingMaterialVisibility(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrainingMaterialVisibility fromValue(String text) {
    for (TrainingMaterialVisibility b : TrainingMaterialVisibility.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
