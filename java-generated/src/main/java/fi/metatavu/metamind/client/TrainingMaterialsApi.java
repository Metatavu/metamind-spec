package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.metamind.EncodingUtils;

import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.TrainingMaterial;
import fi.metatavu.metamind.client.model.TrainingMaterialType;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-06T06:19:40.155+03:00[Europe/Helsinki]")public interface TrainingMaterialsApi extends ApiClient.Api {

  /**
   * Create a trainingMaterial
   * Create training material
   * @param body Payload (required)
   * @return TrainingMaterial
   */
  @RequestLine("POST /trainingMaterials")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  TrainingMaterial createTrainingMaterial(TrainingMaterial body);
  /**
   * Delete trainingMaterial
   * Delete a training material
   * @param trainingMaterialId trainingMaterial id (required)
   */
  @RequestLine("DELETE /trainingMaterials/{trainingMaterialId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteTrainingMaterial(@Param("trainingMaterialId") UUID trainingMaterialId);
  /**
   * Finds a trainingMaterial
   * Finds a training material
   * @param trainingMaterialId trainingMaterial id (required)
   * @return TrainingMaterial
   */
  @RequestLine("GET /trainingMaterials/{trainingMaterialId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  TrainingMaterial findTrainingMaterial(@Param("trainingMaterialId") UUID trainingMaterialId);
  /**
   * List trainingMaterials
   * List training materials
   * @param storyId story id (optional)
   * @param type training material type (optional)
   * @return List&lt;TrainingMaterial&gt;
   */
  @RequestLine("GET /trainingMaterials?storyId={storyId}&type={type}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<TrainingMaterial> listTrainingMaterials(@Param("storyId") UUID storyId, @Param("type") TrainingMaterialType type);

  /**
   * List trainingMaterials
   * List training materials
   * Note, this is equivalent to the other <code>listTrainingMaterials</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTrainingMaterialsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>storyId - story id (optional)</li>
   *   <li>type - training material type (optional)</li>
   *   </ul>
   * @return List&lt;TrainingMaterial&gt;

   */
  @RequestLine("GET /trainingMaterials?storyId={storyId}&type={type}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<TrainingMaterial> listTrainingMaterials(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listTrainingMaterials</code> method in a fluent style.
   */
  public static class ListTrainingMaterialsQueryParams extends HashMap<String, Object> {
    public ListTrainingMaterialsQueryParams storyId(final UUID value) {
      put("storyId", EncodingUtils.encode(value));
      return this;
    }
    public ListTrainingMaterialsQueryParams type(final TrainingMaterialType value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates trainingMaterial
   * Updates a training material
   * @param body Payload (required)
   * @param trainingMaterialId trainingMaterial id (required)
   * @return TrainingMaterial
   */
  @RequestLine("PUT /trainingMaterials/{trainingMaterialId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  TrainingMaterial updateTrainingMaterial(TrainingMaterial body, @Param("trainingMaterialId") UUID trainingMaterialId);
}
