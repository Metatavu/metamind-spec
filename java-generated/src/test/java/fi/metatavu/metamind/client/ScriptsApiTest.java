package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Script;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScriptsApi
 */
public class ScriptsApiTest {

    private ScriptsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ScriptsApi.class);
    }

    /**
     * Create a script
     *
     * Create script
     */
    @Test
    public void createScriptTest() {
        Script body = null;
        // Script response = api.createScript(body);

        // TODO: test validations
    }

    /**
     * Delete script
     *
     * Delete a script
     */
    @Test
    public void deleteScriptTest() {
        UUID scriptId = null;
        // api.deleteScript(scriptId);

        // TODO: test validations
    }

    /**
     * Finds a script
     *
     * Finds a script
     */
    @Test
    public void findScriptTest() {
        UUID scriptId = null;
        // Script response = api.findScript(scriptId);

        // TODO: test validations
    }

    /**
     * List scripts
     *
     * List scripts
     */
    @Test
    public void listScriptsTest() {
        // List<Script> response = api.listScripts();

        // TODO: test validations
    }

    /**
     * Updates script
     *
     * Updates a script
     */
    @Test
    public void updateScriptTest() {
        Script body = null;
        UUID scriptId = null;
        // Script response = api.updateScript(body, scriptId);

        // TODO: test validations
    }

}
