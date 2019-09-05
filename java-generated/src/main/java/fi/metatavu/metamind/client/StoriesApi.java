package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-05T15:23:23.571+03:00[Europe/Helsinki]")public interface StoriesApi extends ApiClient.Api {

  /**
   * Create a story
   * Create story
   * @param body Payload (required)
   * @return Story
   */
  @RequestLine("POST /stories")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Story createStory(Story body);
  /**
   * Delete story
   * Delete a story
   * @param storyId story id (required)
   */
  @RequestLine("DELETE /stories/{storyId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteStory(@Param("storyId") UUID storyId);
  /**
   * Finds a story
   * Finds a story
   * @param storyId story id (required)
   * @return Story
   */
  @RequestLine("GET /stories/{storyId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Story findStory(@Param("storyId") UUID storyId);
  /**
   * List stories
   * List stories
   * @return List&lt;Story&gt;
   */
  @RequestLine("GET /stories")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Story> listStories();
  /**
   * Updates story
   * Updates a story
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Story
   */
  @RequestLine("PUT /stories/{storyId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Story updateStory(Story body, @Param("storyId") UUID storyId);
}
