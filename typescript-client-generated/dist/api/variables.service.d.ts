import { Story } from '../model/story';
import { Variable } from '../model/variable';
export declare class VariablesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create story variable
     * @summary Create a story variable
     * @param body Payload
     * @param storyId story id
    */
    createVariable(body: Variable, storyId: string): Promise<Variable>;
    /**
     * Delete a variable
     * @summary Delete variable
     * @param storyId story id
     * @param variableId variable id
    */
    deleteVariable(storyId: string, variableId: string): Promise<any>;
    /**
     * Finds a story variable
     * @summary Finds a story variable
     * @param storyId story id
     * @param variableId variable id
    */
    findVariable(storyId: string, variableId: string): Promise<Variable>;
    /**
     * List story variables
     * @summary List story variables
     * @param storyId story id
    */
    listVariables(storyId: string): Promise<Array<Variable>>;
    /**
     * Updates a variable
     * @summary Updates variable
     * @param body Payload
     * @param storyId story id
     * @param variableId variable id
    */
    updateVariable(body: Variable, storyId: string, variableId: string): Promise<Story>;
}
