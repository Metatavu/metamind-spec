package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Knot;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-06T12:04:51.852+03:00[Europe/Helsinki]")public interface KnotsApi extends ApiClient.Api {

  /**
   * Create a story knot
   * Create story knot
   * @param body Payload (required)
   * @param storyId story id (required)
   * @return Knot
   */
  @RequestLine("POST /stories/{storyId}/knots")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Knot createKnot(Knot body, @Param("storyId") UUID storyId);
  /**
   * Delete knot
   * Delete a knot
   * @param storyId story id (required)
   * @param knotId knot id (required)
   */
  @RequestLine("DELETE /stories/{storyId}/knots/{knotId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteKnot(@Param("storyId") UUID storyId, @Param("knotId") UUID knotId);
  /**
   * Finds a story knot
   * Finds a story knot
   * @param storyId story id (required)
   * @param knotId knot id (required)
   * @return Knot
   */
  @RequestLine("GET /stories/{storyId}/knots/{knotId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Knot findKnot(@Param("storyId") UUID storyId, @Param("knotId") UUID knotId);
  /**
   * List story knots
   * List story knots
   * @param storyId story id (required)
   * @return List&lt;Knot&gt;
   */
  @RequestLine("GET /stories/{storyId}/knots")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Knot> listKnots(@Param("storyId") UUID storyId);
  /**
   * Updates knot
   * Updates a knot
   * @param body Payload (required)
   * @param storyId story id (required)
   * @param knotId knot id (required)
   * @return Knot
   */
  @RequestLine("PUT /stories/{storyId}/knots/{knotId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Knot updateKnot(Knot body, @Param("storyId") UUID storyId, @Param("knotId") UUID knotId);
}
