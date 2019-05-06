package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Session;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-06T12:04:51.852+03:00[Europe/Helsinki]")public interface SessionsApi extends ApiClient.Api {

  /**
   * Creates new session
   * Creates new chat session
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Session
   */
  @RequestLine("POST /stories/{storyId}/sessions")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Session createSession(Session body, @Param("storyId") UUID storyId);
}
