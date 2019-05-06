package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Intent;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntentsApi
 */
public class IntentsApiTest {

    private IntentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(IntentsApi.class);
    }

    /**
     * Create a story intent
     *
     * Create story intent
     */
    @Test
    public void createIntentTest() {
        Intent body = null;
        UUID storyId = null;
        // Intent response = api.createIntent(body, storyId);

        // TODO: test validations
    }

    /**
     * Delete intent
     *
     * Delete a intent
     */
    @Test
    public void deleteIntentTest() {
        UUID storyId = null;
        UUID intentId = null;
        // api.deleteIntent(storyId, intentId);

        // TODO: test validations
    }

    /**
     * Finds a story intent
     *
     * Finds a story intent
     */
    @Test
    public void findIntentTest() {
        UUID storyId = null;
        UUID intentId = null;
        // Intent response = api.findIntent(storyId, intentId);

        // TODO: test validations
    }

    /**
     * List story intents
     *
     * List story intents
     */
    @Test
    public void listIntentsTest() {
        UUID storyId = null;
        // List<Intent> response = api.listIntents(storyId);

        // TODO: test validations
    }

    /**
     * Updates intent
     *
     * Updates a intent
     */
    @Test
    public void updateIntentTest() {
        Intent body = null;
        UUID storyId = null;
        UUID intentId = null;
        // Intent response = api.updateIntent(body, storyId, intentId);

        // TODO: test validations
    }

}
