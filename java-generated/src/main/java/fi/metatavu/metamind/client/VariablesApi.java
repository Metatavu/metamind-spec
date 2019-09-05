package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;
import fi.metatavu.metamind.client.model.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-05T15:23:23.571+03:00[Europe/Helsinki]")public interface VariablesApi extends ApiClient.Api {

  /**
   * Create a story variable
   * Create story variable
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Variable
   */
  @RequestLine("POST /stories/{storyId}/variables")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Variable createVariable(Variable body, @Param("storyId") UUID storyId);
  /**
   * Delete variable
   * Delete a variable
   * @param storyId story id (required)
   * @param variableId variable id (required)
   */
  @RequestLine("DELETE /stories/{storyId}/variables/{variableId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteVariable(@Param("storyId") UUID storyId, @Param("variableId") UUID variableId);
  /**
   * Finds a story variable
   * Finds a story variable
   * @param storyId story id (required)
   * @param variableId variable id (required)
   * @return Variable
   */
  @RequestLine("GET /stories/{storyId}/variables/{variableId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Variable findVariable(@Param("storyId") UUID storyId, @Param("variableId") UUID variableId);
  /**
   * List story variables
   * List story variables
   * @param storyId story id (required)
   * @return List&lt;Variable&gt;
   */
  @RequestLine("GET /stories/{storyId}/variables")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Variable> listVariables(@Param("storyId") UUID storyId);
  /**
   * Updates variable
   * Updates a variable
   * @param body Payload (required)
   * @param storyId story id (required)
   * @param variableId variable id (required)
   * @return Story
   */
  @RequestLine("PUT /stories/{storyId}/variables/{variableId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Story updateVariable(Variable body, @Param("storyId") UUID storyId, @Param("variableId") UUID variableId);
}
