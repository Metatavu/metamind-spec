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
 * Gets or Sets MessageResponseType
 */
public enum MessageResponseType {
  TEXT("TEXT"),
    IMAGE("IMAGE");

  private String value;

  MessageResponseType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageResponseType fromValue(String text) {
    for (MessageResponseType b : MessageResponseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
