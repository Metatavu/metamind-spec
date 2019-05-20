package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Script;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-20T15:24:44.194+03:00[Europe/Helsinki]")public interface ScriptsApi extends ApiClient.Api {

  /**
   * Create a script
   * Create script
   * @param body Payload (required)
   * @return Script
   */
  @RequestLine("POST /scripts")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Script createScript(Script body);
  /**
   * Delete script
   * Delete a script
   * @param scriptId script id (required)
   */
  @RequestLine("DELETE /scripts/{scriptId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteScript(@Param("scriptId") UUID scriptId);
  /**
   * Finds a script
   * Finds a script
   * @param scriptId script id (required)
   * @return Script
   */
  @RequestLine("GET /scripts/{scriptId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Script findScript(@Param("scriptId") UUID scriptId);
  /**
   * List scripts
   * List scripts
   * @return List&lt;Script&gt;
   */
  @RequestLine("GET /scripts")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Script> listScripts();
  /**
   * Updates script
   * Updates a script
   * @param body Payload (required)
   * @param scriptId script id (required)
   * @return Script
   */
  @RequestLine("PUT /scripts/{scriptId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Script updateScript(Script body, @Param("scriptId") UUID scriptId);
}
