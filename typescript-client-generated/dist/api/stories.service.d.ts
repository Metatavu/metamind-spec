import { Story } from '../model/story';
export declare class StoriesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create story
     * @summary Create a story
     * @param body Payload
    */
    createStory(body: Story): Promise<Story>;
    /**
     * Delete a story
     * @summary Delete story
     * @param storyId story id
    */
    deleteStory(storyId: string): Promise<any>;
    /**
     * Finds a story
     * @summary Finds a story
     * @param storyId story id
    */
    findStory(storyId: string): Promise<Story>;
    /**
     * List stories
     * @summary List stories
    */
    listStories(): Promise<Array<Story>>;
    /**
     * Updates a story
     * @summary Updates story
     * @param body Payload
     * @param storyId story id
    */
    updateStory(body: Story, storyId: string): Promise<Story>;
}
