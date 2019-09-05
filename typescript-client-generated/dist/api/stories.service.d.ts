import { Story } from '../model/story';
export declare class StoriesService {
    private rptToken;
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create story
     * @summary Create a story
     * @param body Payload
    */
    createStory(body: Story, retrying?: boolean): Promise<Story>;
    /**
     * Delete a story
     * @summary Delete story
     * @param storyId story id
    */
    deleteStory(storyId: string, retrying?: boolean): Promise<any>;
    /**
     * Finds a story
     * @summary Finds a story
     * @param storyId story id
    */
    findStory(storyId: string, retrying?: boolean): Promise<Story>;
    /**
     * List stories
     * @summary List stories
    */
    listStories(retrying?: boolean): Promise<Array<Story>>;
    /**
     * Updates a story
     * @summary Updates story
     * @param body Payload
     * @param storyId story id
    */
    updateStory(body: Story, storyId: string, retrying?: boolean): Promise<Story>;
}
