package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Knot;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KnotsApi
 */
public class KnotsApiTest {

    private KnotsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(KnotsApi.class);
    }

    /**
     * Create a story knot
     *
     * Create story knot
     */
    @Test
    public void createKnotTest() {
        Knot body = null;
        UUID storyId = null;
        // Knot response = api.createKnot(body, storyId);

        // TODO: test validations
    }

    /**
     * Delete knot
     *
     * Delete a knot
     */
    @Test
    public void deleteKnotTest() {
        UUID storyId = null;
        UUID knotId = null;
        // api.deleteKnot(storyId, knotId);

        // TODO: test validations
    }

    /**
     * Finds a story knot
     *
     * Finds a story knot
     */
    @Test
    public void findKnotTest() {
        UUID storyId = null;
        UUID knotId = null;
        // Knot response = api.findKnot(storyId, knotId);

        // TODO: test validations
    }

    /**
     * List story knots
     *
     * List story knots
     */
    @Test
    public void listKnotsTest() {
        UUID storyId = null;
        // List<Knot> response = api.listKnots(storyId);

        // TODO: test validations
    }

    /**
     * Updates knot
     *
     * Updates a knot
     */
    @Test
    public void updateKnotTest() {
        Knot body = null;
        UUID storyId = null;
        UUID knotId = null;
        // Knot response = api.updateKnot(body, storyId, knotId);

        // TODO: test validations
    }

}
