package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoriesApi
 */
public class StoriesApiTest {

    private StoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(StoriesApi.class);
    }

    /**
     * Create a story
     *
     * Create story
     */
    @Test
    public void createStoryTest() {
        Story body = null;
        // Story response = api.createStory(body);

        // TODO: test validations
    }

    /**
     * Delete story
     *
     * Delete a story
     */
    @Test
    public void deleteStoryTest() {
        UUID storyId = null;
        // api.deleteStory(storyId);

        // TODO: test validations
    }

    /**
     * Finds a story
     *
     * Finds a story
     */
    @Test
    public void findStoryTest() {
        UUID storyId = null;
        // Story response = api.findStory(storyId);

        // TODO: test validations
    }

    /**
     * List stories
     *
     * List stories
     */
    @Test
    public void listStoriesTest() {
        // List<Story> response = api.listStories();

        // TODO: test validations
    }

    /**
     * Updates story
     *
     * Updates a story
     */
    @Test
    public void updateStoryTest() {
        Story body = null;
        UUID storyId = null;
        // Story response = api.updateStory(body, storyId);

        // TODO: test validations
    }

}
