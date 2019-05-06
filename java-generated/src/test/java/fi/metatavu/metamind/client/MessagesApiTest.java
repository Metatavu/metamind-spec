package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Message;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private MessagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(MessagesApi.class);
    }

    /**
     * Posts new message
     *
     * Posts new message
     */
    @Test
    public void createMessageTest() {
        Message body = null;
        UUID storyId = null;
        // Message response = api.createMessage(body, storyId);

        // TODO: test validations
    }

}
