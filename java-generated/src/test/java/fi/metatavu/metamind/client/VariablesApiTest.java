package fi.metatavu.metamind.client;

import fi.metatavu.metamind.ApiClient;
import fi.metatavu.metamind.client.model.ErrorResponse;
import fi.metatavu.metamind.client.model.Story;
import java.util.UUID;
import fi.metatavu.metamind.client.model.Variable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VariablesApi
 */
public class VariablesApiTest {

    private VariablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(VariablesApi.class);
    }

    /**
     * Create a story variable
     *
     * Create story variable
     */
    @Test
    public void createVariableTest() {
        Variable body = null;
        UUID storyId = null;
        // Variable response = api.createVariable(body, storyId);

        // TODO: test validations
    }

    /**
     * Delete variable
     *
     * Delete a variable
     */
    @Test
    public void deleteVariableTest() {
        UUID storyId = null;
        UUID variableId = null;
        // api.deleteVariable(storyId, variableId);

        // TODO: test validations
    }

    /**
     * Finds a story variable
     *
     * Finds a story variable
     */
    @Test
    public void findVariableTest() {
        UUID storyId = null;
        UUID variableId = null;
        // Variable response = api.findVariable(storyId, variableId);

        // TODO: test validations
    }

    /**
     * List story variables
     *
     * List story variables
     */
    @Test
    public void listVariablesTest() {
        UUID storyId = null;
        // List<Variable> response = api.listVariables(storyId);

        // TODO: test validations
    }

    /**
     * Updates variable
     *
     * Updates a variable
     */
    @Test
    public void updateVariableTest() {
        Variable body = null;
        UUID storyId = null;
        UUID variableId = null;
        // Story response = api.updateVariable(body, storyId, variableId);

        // TODO: test validations
    }

}
