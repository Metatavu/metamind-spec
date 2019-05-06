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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets IntentType
 */
public enum IntentType {
  NORMAL("NORMAL"),
  CONFUSED("CONFUSED"),
  REDIRECT("REDIRECT"),
  DEFAULT("DEFAULT");

  private String value;

  IntentType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntentType fromValue(String text) {
    for (IntentType b : IntentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
