package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.TrainingMaterial;
import fi.metatavu.metamind.client.model.TrainingMaterialType;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrainingMaterialsApi
 */
public class TrainingMaterialsApiTest {

    private TrainingMaterialsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TrainingMaterialsApi.class);
    }

    /**
     * Create a trainingMaterial
     *
     * Create training material
     */
    @Test
    public void createTrainingMaterialTest() {
        TrainingMaterial body = null;
        // TrainingMaterial response = api.createTrainingMaterial(body);

        // TODO: test validations
    }

    /**
     * Delete trainingMaterial
     *
     * Delete a training material
     */
    @Test
    public void deleteTrainingMaterialTest() {
        UUID trainingMaterialId = null;
        // api.deleteTrainingMaterial(trainingMaterialId);

        // TODO: test validations
    }

    /**
     * Finds a trainingMaterial
     *
     * Finds a training material
     */
    @Test
    public void findTrainingMaterialTest() {
        UUID trainingMaterialId = null;
        // TrainingMaterial response = api.findTrainingMaterial(trainingMaterialId);

        // TODO: test validations
    }

    /**
     * List trainingMaterials
     *
     * List training materials
     */
    @Test
    public void listTrainingMaterialsTest() {
        UUID storyId = null;
        TrainingMaterialType type = null;
        // List<TrainingMaterial> response = api.listTrainingMaterials(storyId, type);

        // TODO: test validations
    }

    /**
     * List trainingMaterials
     *
     * List training materials
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listTrainingMaterialsTestQueryMap() {
        TrainingMaterialsApi.ListTrainingMaterialsQueryParams queryParams = new TrainingMaterialsApi.ListTrainingMaterialsQueryParams()
            .storyId(null)
            .type(null);
        // List<TrainingMaterial> response = api.listTrainingMaterials(queryParams);

    // TODO: test validations
    }
    /**
     * Updates trainingMaterial
     *
     * Updates a training material
     */
    @Test
    public void updateTrainingMaterialTest() {
        TrainingMaterial body = null;
        UUID trainingMaterialId = null;
        // TrainingMaterial response = api.updateTrainingMaterial(body, trainingMaterialId);

        // TODO: test validations
    }

}
