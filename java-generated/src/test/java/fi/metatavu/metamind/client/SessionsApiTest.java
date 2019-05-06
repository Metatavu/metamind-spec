package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Session;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SessionsApi
 */
public class SessionsApiTest {

    private SessionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SessionsApi.class);
    }

    /**
     * Creates new session
     *
     * Creates new chat session
     */
    @Test
    public void createSessionTest() {
        Session body = null;
        UUID storyId = null;
        // Session response = api.createSession(body, storyId);

        // TODO: test validations
    }

}
