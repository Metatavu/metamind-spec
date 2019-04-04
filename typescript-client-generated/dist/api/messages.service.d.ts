import { Message } from '../model/message';
export declare class MessagesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Posts new message
     * @summary Posts new message
     * @param body Payload
     * @param storyId story id
    */
    createMessage(body: Message, storyId: string): Promise<Message>;
}
