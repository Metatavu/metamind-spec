import { Intent } from '../model/intent';
export declare class IntentsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create story intent
     * @summary Create a story intent
     * @param body Payload
     * @param storyId story id
    */
    createIntent(body: Intent, storyId: string): Promise<Intent>;
    /**
     * Delete a intent
     * @summary Delete intent
     * @param storyId story id
     * @param intentId intent id
    */
    deleteIntent(storyId: string, intentId: string): Promise<any>;
    /**
     * Finds a story intent
     * @summary Finds a story intent
     * @param storyId story id
     * @param intentId intent id
    */
    findIntent(storyId: string, intentId: string): Promise<Intent>;
    /**
     * List story intents
     * @summary List story intents
     * @param storyId story id
    */
    listIntents(storyId: string): Promise<Array<Intent>>;
    /**
     * Updates a intent
     * @summary Updates intent
     * @param body Payload
     * @param storyId story id
     * @param intentId intent id
    */
    updateIntent(body: Intent, storyId: string, intentId: string): Promise<Intent>;
}
