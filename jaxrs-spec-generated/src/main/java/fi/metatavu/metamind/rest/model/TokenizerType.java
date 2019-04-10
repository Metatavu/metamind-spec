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
 * Gets or Sets TokenizerType
 */
public enum TokenizerType {
  WHITESPACE("WHITESPACE"),
    UNTOKENIZED("UNTOKENIZED");

  private String value;

  TokenizerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TokenizerType fromValue(String text) {
    for (TokenizerType b : TokenizerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
