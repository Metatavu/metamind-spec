package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Message;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-20T15:24:44.194+03:00[Europe/Helsinki]")public interface MessagesApi extends ApiClient.Api {

  /**
   * Posts new message
   * Posts new message
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Message
   */
  @RequestLine("POST /stories/{storyId}/messages")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Message createMessage(Message body, @Param("storyId") UUID storyId);
}
