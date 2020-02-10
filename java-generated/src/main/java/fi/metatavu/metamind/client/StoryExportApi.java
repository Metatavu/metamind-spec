package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.ExportedStory;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-10T13:55:11.126+02:00[Europe/Helsinki]")public interface StoryExportApi extends ApiClient.Api {

  /**
   * Export a story
   * export story
   * @param storyId Id of the story to be exported (required)
   * @return ExportedStory
   */
  @RequestLine("GET /storyExport/{storyId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  ExportedStory exportStory(@Param("storyId") UUID storyId);
  /**
   * Import a story
   * Import story
   * @param body Payload (required)
   * @return Story
   */
  @RequestLine("POST /storyImport/")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Story importStory(ExportedStory body);
}
