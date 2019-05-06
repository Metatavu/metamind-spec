package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Intent;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-06T06:19:40.155+03:00[Europe/Helsinki]")public interface IntentsApi extends ApiClient.Api {

  /**
   * Create a story intent
   * Create story intent
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Intent
   */
  @RequestLine("POST /stories/{storyId}/intents")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Intent createIntent(Intent body, @Param("storyId") UUID storyId);
  /**
   * Delete intent
   * Delete a intent
   * @param storyId story id (required)
   * @param intentId intent id (required)
   */
  @RequestLine("DELETE /stories/{storyId}/intents/{intentId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteIntent(@Param("storyId") UUID storyId, @Param("intentId") UUID intentId);
  /**
   * Finds a story intent
   * Finds a story intent
   * @param storyId story id (required)
   * @param intentId intent id (required)
   * @return Intent
   */
  @RequestLine("GET /stories/{storyId}/intents/{intentId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Intent findIntent(@Param("storyId") UUID storyId, @Param("intentId") UUID intentId);
  /**
   * List story intents
   * List story intents
   * @param storyId story id (required)
   * @return List&lt;Intent&gt;
   */
  @RequestLine("GET /stories/{storyId}/intents")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Intent> listIntents(@Param("storyId") UUID storyId);
  /**
   * Updates intent
   * Updates a intent
   * @param body Payload (required)
   * @param storyId story id (required)
   * @param intentId intent id (required)
   * @return Intent
   */
  @RequestLine("PUT /stories/{storyId}/intents/{intentId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Intent updateIntent(Intent body, @Param("storyId") UUID storyId, @Param("intentId") UUID intentId);
}
