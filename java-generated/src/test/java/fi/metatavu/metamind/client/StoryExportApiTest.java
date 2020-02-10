package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.ExportedStory;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoryExportApi
 */
public class StoryExportApiTest {

    private StoryExportApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(StoryExportApi.class);
    }

    /**
     * Export a story
     *
     * export story
     */
    @Test
    public void exportStoryTest() {
        UUID storyId = null;
        // ExportedStory response = api.exportStory(storyId);

        // TODO: test validations
    }

    /**
     * Import a story
     *
     * Import story
     */
    @Test
    public void importStoryTest() {
        ExportedStory body = null;
        // Story response = api.importStory(body);

        // TODO: test validations
    }

}
